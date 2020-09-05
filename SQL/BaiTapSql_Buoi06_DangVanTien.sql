use testingsystem;

-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó

DROP PROCEDURE IF EXISTS Phong_Ban
DELIMITER $$
CREATE PROCEDURE Phong_Ban (IN DepartmentName NVARCHAR(50))
BEGIN
	SELECT *
    FROM `account` a
    INNER JOIN department d
    ON a.DepartmentID = d.DepartmentID
    WHERE d.DepartmentName = DepartmentName;
END $$
DELIMITER ;

CALL Phong_Ban('Sale');
    
-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS SoLuongAccount_Group
DELIMITER $$
CREATE PROCEDURE SoLuongAccount_Group (IN GroupName NVARCHAR(50), IN GroupID INT)
BEGIN
	SELECT `group`.GroupID, `group`.GroupName , COUNT(groupaccount.GroupID) as SoLuongAccount
    FROM 	`group`
    JOIN  groupaccount
    ON `group`.GroupID = groupaccount.GroupID
    WHERE `group`.GroupName = GroupName OR `group`.GroupID = GroupID
    GROUP BY `group`.GroupID;
END $$
DELIMITER ;
    
CALL SoLuongAccount_Group('','1');
    
-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS Question3
DELIMITER $$
CREATE PROCEDURE Question3 ()
BEGIN
	SELECT t.TypeID, t.TypeName , COUNT(q.TypeID) as SoLuongQuestion 
    FROM typequestion t
    JOIN  question q
    ON t.TypeID= q.TypeID
    WHERE MONTH(q.CreateDate) = (SELECT MONTH(now()))
    GROUP BY t.TypeID;
END $$
DELIMITER ;

CALL Question3();

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP PROCEDURE IF EXISTS Question4_Question5
DELIMITER $$
CREATE PROCEDURE Question4_Question5 ()
BEGIN
	SELECT t.TypeID, t.TypeName , COUNT(q.TypeID) as SoLuongQuestion 
    FROM typequestion t
    JOIN  question q
    ON t.TypeID= q.TypeID
	GROUP BY t.TypeID
    HAVING COUNT(q.TypeID) = (SELECT MAX(SoLuongQuestion)
								FROM ( SELECT t.TypeID, t.TypeName , COUNT(q.TypeID) as SoLuongQuestion 
										FROM typequestion t
										JOIN  question q
										ON t.TypeID= q.TypeID
									GROUP BY t.TypeID) as tb );
END $$
DELIMITER ;

CALL Question4_Question5();

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS Question6
DELIMITER $$
CREATE PROCEDURE Question6 (IN GroupName_IN NVARCHAR(50))
BEGIN
	SELECT GroupName
    FROM `group` 
    WHERE GroupName = GroupName_IN
    GROUP BY GroupID;
END $$
DELIMITER ;

CALL Question6('Testing System');

-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán
-- username sẽ giống email nhưng bỏ phần @..mail đi positionID: sẽ có default là developer departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công
DROP PROCEDURE IF EXISTS Question7
DELIMITER $$
CREATE PROCEDURE Question7 (IN FullName NVARCHAR(50), IN Email VARCHAR (50), OUT DepartmentID_Out INT)
BEGIN
	SELECT UserName, Email INTO  DepartmentID_Out
    FROM `account`
	WHERE FullName = FullName AND Email = Email;
END $$
DELIMITER ;

SET @DepartmentID_1 = '';
CALL Question7('Nguyen Hai Dang','haidang29productions@gmail.com',@DepartmentID_1);
SELECT @DepartmentID_1;

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS Question9
DELIMITER $$
CREATE PROCEDURE Question9 (IN ExamID_IN INT)
BEGIN
	DELETE
    FROM Exam 
    WHERE ExamID = ExamID_IN;
END $$
DELIMITER ;

CALL Question9 ('1');

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử
-- dụng store ở câu 9 để xóa), sau đó in số lượng record đã remove từ các table liên quan trong khi removing
DROP PROCEDURE IF EXISTS Question10
DELIMITER $$
CREATE PROCEDURE Question10 (IN ExamID_IN INT)
BEGIN
	DELETE
    FROM Exam 
    WHERE  year(CreateDate) <= year(now())- 3;
    SELECT row_count();
END $$
DELIMITER ;

-- 












