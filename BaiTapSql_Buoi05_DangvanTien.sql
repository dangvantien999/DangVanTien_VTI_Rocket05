USE testingsystem;
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ 
SELECT *
FROM account
JOIN department
ON account.DepartmentID = department.DepartmentID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 
SELECT * 
FROM account
WHERE CreateDate > '2010-12-20';



-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất 
CREATE VIEW Q5 as
SELECT examquestion.QuestionID,question.Content
FROM examquestion
JOIN question
ON examquestion.QuestionID = question.QuestionID
GROUP BY QuestionID
HAVING COUNT(examquestion.QuestionID) = (select max(countq) 
										from (SELECT 
												QuestionID,COUNT(QuestionID) as countq
												FROM examquestion
												GROUP BY QuestionID)
										as tb)
;
SELECT * FROM Q5;
-- Question 8: Lấy ra Question có nhiều câu trả lời nhất 
SELECT question.QuestionID, answer.Content,COUNT(answer.QuestionID) as So_Cau_Tra_Loi
FROM question
JOIN answer
ON question.QuestionID = answer.QuestionID
GROUP BY question.QuestionID
HAVING COUNT(answer.QuestionID) = ( SELECT MAX(dem)
									FROM
									(SELECT COUNT(QuestionID) as dem
									FROM answer
                                    GROUP BY QuestionID) as tb
                                    );


-- Question 11: thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM   
SELECT department.DepartmentName,`position`.PositionName,COUNT(`account`.DepartmentID) as SoNhanVien
FROM department
LEFT JOIN `account`
ON department.DepartmentID = `account`.DepartmentID
LEFT JOIN `position`
ON `position`.PositionID = `account`.PositionID
GROUP BY department.DepartmentName;

-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
CREATE VIEW PhongnSale AS
SELECT *
FROM `account`
WHERE DepartmentID = 2;
SELECT * FROM PhongnSale;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất 

SELECT account.AccountID,account.Username,account.FullName,COUNT(`group`.CreatorID) as SoNhomThamGia
FROM account
LEFT JOIN `group`
ON account.AccountID = `group`.CreatorID
GROUP BY account.AccountID
HAVING COUNT(`group`.CreatorID) =( SELECT MAX(dem) FROM (SELECT CreatorID, COUNT(CreatorID) as dem
						FROM `group`
						GROUP BY CreatorID) as tb);

-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi 
DELETE
FROM question
WHERE Content LIKE('%') > '300';

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất 
SELECT department.DepartmentID, department.DepartmentName, COUNT(account.DepartmentID) as Nhan_Vien
FROM department
LEFT JOIN account
ON department.DepartmentID = account.DepartmentID
GROUP BY department.DepartmentID
HAVING COUNT(account.DepartmentID) =(SELECT MAX(dem)
									FROM (SELECT COUNT(DepartmentID) AS  dem
										FROM account
                                        GROUP BY DepartmentID) as tb);

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo 
CREATE VIEW CauHoi_HoNguyen AS
SELECT question.QuestionID, `account`.Username, `account`.FullName,question.Content
FROM `account`
LEFT JOIN question
ON `account`.AccountID = question.CreatorID
GROUP BY question.QuestionID
HAVING FullName LIKE('Nguyen%');

SELECT * FROM CauHoi_HoNguyen;