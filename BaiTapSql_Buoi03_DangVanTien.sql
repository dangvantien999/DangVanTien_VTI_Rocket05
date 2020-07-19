USE qlbaithi;

-- Quesstion 1 : Thêm dữ liệu cho bảng 
-- thêm dữ liệu bảng department (Phòng ban)
INSERT INTO department(DepartmentID,DepartmentName) VALUES ('1','CNTT'); 
INSERT INTO department(DepartmentID,DepartmentName) VALUES ('2','Maketing'); 
INSERT INTO department(DepartmentID,DepartmentName) VALUES ('3','Cơ khí ô tô'); 
INSERT INTO department(DepartmentID,DepartmentName) VALUES ('4','Ngoại giao'); 
INSERT INTO department(DepartmentID,DepartmentName) VALUES ('5','Tự động hóa và điều kiển'); 
INSERT INTO department(DepartmentID,DepartmentName) VALUES ('6','Sale'); 
INSERT INTO department(DepartmentID,DepartmentName) VALUES ('7','Kỹ thuật'); 
INSERT INTO department(DepartmentID,DepartmentName) VALUES ('8','Bán hàng'); 
INSERT INTO department(DepartmentID,DepartmentName) VALUES ('9','Kho'); 
INSERT INTO department(DepartmentID,DepartmentName) VALUES ('10','Kế toán'); 

-- Thêm dữ liệu bảng Position (Chức vụ)
INSERT INTO `position`(PositionID,PositionName) VALUES ('1','DEV'); 
INSERT INTO `position`(PositionID,PositionName) VALUES ('2','Test'); 
INSERT INTO `position`(PositionID,PositionName) VALUES ('3','Scrum Master'); 
INSERT INTO `position`(PositionID,PositionName) VALUES ('4','PM'); 
INSERT INTO `position`(PositionID,PositionName) VALUES ('5','Quản lý'); 
INSERT INTO `position`(PositionID,PositionName) VALUES ('6','Nhân viên'); 
INSERT INTO `position`(PositionID,PositionName) VALUES ('7','Trưởng phong'); 
INSERT INTO `position`(PositionID,PositionName) VALUES ('8','Phó phòng'); 
INSERT INTO `position`(PositionID,PositionName) VALUES ('9','Non ton'); 
INSERT INTO `position`(PositionID,PositionName) VALUES ('10','Le ve'); 

-- Thêm dữ liệu bảng Account
INSERT INTO `account`(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)
			VALUES ('tyltien1999@gmail.com','tien','Đặng Văn Tiến','2','1','2020-7-4'); 
INSERT INTO `account`(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)
			VALUES ('Tam@gmail.com','tam','Ngô Thanh Tâm','1','3','2019-7-4'); 
INSERT INTO `account`(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)
			VALUES ('Datnguyen@gmail.com','Dat','Nguyễn Thành Đạt','1','1','2020-7-4'); 
INSERT INTO `account`(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)
			VALUES ('Thao@gmail.com','thao','Nguyễn Thị Thảo','1','1','2020-7-4'); 
INSERT INTO `account`(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)
			VALUES ('Duong@gmail.com','duong','Đoàn Đức Dương','3','1','2020-7-4'); 
INSERT INTO `account`(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)
			VALUES ('Huynh@gmail.com','huynh','Cao Bá Huỳnh','2','1','2020-7-4'); 
INSERT INTO `account`(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)
			VALUES ('Long@gmail.com','long','Nguyễn Xuân Long','5','1','2020-7-4'); 
INSERT INTO `account`(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)
			VALUES ('Ngan@gmail.com','Ngan','Nguyễn Hồng Ngân','10','1','2020-7-4'); 
INSERT INTO `account`(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)
			VALUES ('tyltie1999@gmail.com','tien','Đặng Văn Tiến','5','10','2020-7-4'); 
INSERT INTO `account`(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)
			VALUES ('Khai@gmail.com','khai','Nguyễn Đình Khải','6','5','2020-7-4'); 

-- INSERT dữ liệu bảng group
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_01','1','2020-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_02','2','2020-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_03','3','2020-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_04','4','2020-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_05','5','2020-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_06','6','2020-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_07','7','2020-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_08','8','2020-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_09','9','2020-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_10','10','2020-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_11','8','2019-7-4');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_12','10','2020-7-5');
INSERT INTO `group`(GroupName,CreatorID,CreateDate) VALUES ('Group_10','10','2020-7-5');

-- INSERT dữ liệu bảng AccountGroup
INSERT INTO groupaccount(GroupID,AccountID,JoinDate) VALUES ('1','1','2020-7-4');
INSERT INTO groupaccount(GroupID,AccountID,JoinDate) VALUES ('2','6','2020-7-4');
INSERT INTO groupaccount(GroupID,AccountID,JoinDate) VALUES ('3','1','2020-7-4');
INSERT INTO groupaccount(GroupID,AccountID,JoinDate) VALUES ('4','2','2020-7-4');
INSERT INTO groupaccount(GroupID,AccountID,JoinDate) VALUES ('5','8','2020-7-4');
INSERT INTO groupaccount(GroupID,AccountID,JoinDate) VALUES ('6','7','2020-7-4');
INSERT INTO groupaccount(GroupID,AccountID,JoinDate) VALUES ('7','8','2020-7-4');
INSERT INTO groupaccount(GroupID,AccountID,JoinDate) VALUES ('8','5','2020-7-4');
INSERT INTO groupaccount(GroupID,AccountID,JoinDate) VALUES ('9','4','2020-7-4');
INSERT INTO groupaccount(GroupID,AccountID,JoinDate) VALUES ('10','2','2020-7-4');

-- INSERT dữ liệu bảng TypeQuestion
INSERT INTO typequestion(TypeName) VALUES ('Điền vào chỗ trống');
INSERT INTO typequestion(TypeName) VALUES ('Chọn đúng sai');
INSERT INTO typequestion(TypeName) VALUES ('Trả lời tự luận');
INSERT INTO typequestion(TypeName) VALUES ('Khoanh vào đáp án đúng');
INSERT INTO typequestion(TypeName) VALUES ('Nối');
INSERT INTO typequestion(TypeName) VALUES ('Nghe và trả lời câu hỏi');
INSERT INTO typequestion(TypeName) VALUES ('Gạch chân dưới đáp án đúng');
INSERT INTO typequestion(TypeName) VALUES ('Khoa học');
INSERT INTO typequestion(TypeName) VALUES ('Vật lý');
INSERT INTO typequestion(TypeName) VALUES ('Xã hội');

-- INSERT dữ liệu bảng crategoryquestion
INSERT INTO categoryquestion(CategoryName) VALUES ('Java');
INSERT INTO categoryquestion(CategoryName) VALUES ('PHP');
INSERT INTO categoryquestion(CategoryName) VALUES ('Ruby');
INSERT INTO categoryquestion(CategoryName) VALUES ('.NET');
INSERT INTO categoryquestion(CategoryName) VALUES ('SQL');
INSERT INTO categoryquestion(CategoryName) VALUES ('Postman');
INSERT INTO categoryquestion(CategoryName) VALUES ('Con trăn');
INSERT INTO categoryquestion(CategoryName) VALUES ('C');
INSERT INTO categoryquestion(CategoryName) VALUES ('C#');
INSERT INTO categoryquestion(CategoryName) VALUES ('C++');

-- INSERT dữ liệu Question
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('Nêu khái niệm java','1','3','1','2020-7-4');
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('Đặc chưng của lập trình Ruby','3','4','3','2020-7-4');
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('PHP là ngôn ngữ.....','2','1','1','2020-7-4');
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('Hàm funstion là :','2','4','6','2020-7-4');
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('Nêu khái C#','1','3','1','2020-7-4');
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('C là ngôn ngữ lập trình cấu trúc','8','2','8','2020-7-4');
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('khai báo 1 hàm trong PHP ta dùng','2','4','6','2020-7-4');
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('Độ dài 1 byte bằng bao nhiêu bit','5','4','1','2020-7-4');
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('1 bit biểu diễn được bao nhiêu số','5','4','1','2020-7-4');
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('1MB bằng bao nhiêu byte','5','4','1','2020-7-4');
INSERT INTO question(Content,CategoryID,TypeID,CreatorID,CreateDate) 
			VALUES('Câu hỏi 1MB bằng bao nhiêu byte','5','4','1','2020-7-4');

-- INSERT dữ liệu bảng Answer 
INSERT INTO answer(Content,QuestionID,isCorrect) VALUES ('Câu trả lời 1','1',TRUE);
INSERT INTO answer(Content,QuestionID,isCorrect) VALUES ('Câu trả lời 2','1',FALSE);
INSERT INTO answer(Content,QuestionID,isCorrect) VALUES ('Câu trả lời 3','3',TRUE);
INSERT INTO answer(Content,QuestionID,isCorrect) VALUES ('Câu trả lời 4','2',TRUE);
INSERT INTO answer(Content,QuestionID,isCorrect) VALUES ('Câu trả lời 5','4',FALSE);
INSERT INTO answer(Content,QuestionID,isCorrect) VALUES ('Câu trả lời 6','4',TRUE);
INSERT INTO answer(Content,QuestionID,isCorrect) VALUES ('Câu trả lời 7','5',FALSE);
INSERT INTO answer(Content,QuestionID,isCorrect) VALUES ('Câu trả lời 8','8',FALSE);
INSERT INTO answer(Content,QuestionID,isCorrect) VALUES ('Câu trả lời 9','2',TRUE);
INSERT INTO answer(Content,QuestionID,isCorrect) VALUES ('Câu trả lời 10','6',TRUE);

-- INSERT dữ liệu bảng EXAM
INSERT INTO Exam(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate) 
		 VALUES ('001','KT_PHP','2','60:00:00','1','2020-7-4');
INSERT INTO Exam(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate) 
		 VALUES ('002','KT_Java','1','60:00:00','3','2020-7-4');
INSERT INTO Exam(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate) 
		 VALUES ('003','KT_Ruby','3','60:00:00','5','2020-7-4');
INSERT INTO Exam(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate) 
		 VALUES ('004','KT_NET','4','60:00:00','4','2020-7-4');
INSERT INTO Exam(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate) 
		 VALUES ('005','KT_SQL','5','60:00:00','1','2020-7-4');
INSERT INTO Exam(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate) 
		 VALUES ('006','KT_Postman','6','60:00:00','6','2020-7-4');
INSERT INTO Exam(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate) 
		 VALUES ('007','KT_Con trăn','7','60:00:00','2','2020-7-4');
INSERT INTO Exam(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate) 
		 VALUES ('008','KT_C','8','60:00:00','7','2020-7-4');
INSERT INTO Exam(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate) 
		 VALUES ('009','KT_C#','9','60:00:00','8','2020-7-4');
INSERT INTO Exam(`Code`,Title,CategoryID,Duration,CreatorID,CreateDate) 
		 VALUES ('010','KT_C++','10','60:00:00','10','2020-7-4');

-- INSERT dữ liệu bảng EXAMQUESTION
INSERT INTO examquestion(ExamID,QuestionID) VALUES ('1','2');
INSERT INTO examquestion(ExamID,QuestionID) VALUES ('2','3');
INSERT INTO examquestion(ExamID,QuestionID) VALUES ('3','1');
INSERT INTO examquestion(ExamID,QuestionID) VALUES ('4','1');
INSERT INTO examquestion(ExamID,QuestionID) VALUES ('5','10');
INSERT INTO examquestion(ExamID,QuestionID) VALUES ('6','2');
INSERT INTO examquestion(ExamID,QuestionID) VALUES ('7','4');
INSERT INTO examquestion(ExamID,QuestionID) VALUES ('8','5');
INSERT INTO examquestion(ExamID,QuestionID) VALUES ('9','6');
INSERT INTO examquestion(ExamID,QuestionID) VALUES ('10','10');

-- QUestion 2: Lấy ra tất cả các phòng ban
SELECT * 
FROM department;

-- Question 3 : Lấy ra id của phòng ban sale
SELECT DepartmentID 
FROM department 
WHERE DepartmentName = 'Sale';

-- Question4 : Lấy ra thông tin account có tên tin dài nhất 
SELECT * 
FROM `account`
WHERE FullName = (SELECT max(FullName) 
				   FROM `account`);
	
-- Sắp sếp giảm dần
SELECT * FROM `account` ORDER BY (FullName) DESC;

-- Question 5 : lấy ra thông tin account fullName dai nhất và thuộc phòng ban id =3
SELECT * 
FROM `account`
WHERE FullName = (SELECT MAX(FullName) 
				   FROM `account` 
                   WHERE AccountID = 3);
-- Question 6 : lấy ra tên group tham gia trước ngày 20-12-2019
SELECT GroupName,CreateDate FROM `group` WHERE CreateDate < '2019-12-20';

-- Question 7 : Lấy ra id của question có >= 4 câu rả lời 
SELECT QuestionID,COUNT(QuestionID)
FROM answer
GROUP BY QuestionID
HAVING COUNT(QuestionID)>=4;

-- Question 8 : Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019 
SELECT *
FROM exam
WHERE Duration >= '60:00:00' AND CreateDate < '2019-20-12';

-- Question 9 : Lấy ra 5 group tạo gần nhất 
SELECT * FROM `group` ORDER BY CreateDate DESC LIMIT 5;

-- Question 10 : Đếm số nhân viên thuộc department có id = 2 
SELECT DepartmentID,COUNT(DepartmentID) as SoNhanVien
 FROM `account` 
 WHERE DepartmentID = 2;
 
-- Question 11 : Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o" 
SELECT *
FROM `account`
WHERE FullName LIKE('D%o');

-- Question 12 :  xóa tất cả các exam được tạo trước ngày 20/12/2019  
DELETE 
FROM exam
WHERE CreateDate < '2019-12-20';

-- Question 13 : xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi" 
DELETE 
FROM question
WHERE Content LIKE('Câu hỏi%');

-- Question 14 : update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn 
UPDATE account
SET FullName = 'Nguyễn Bá Lộc',
	Email = 'loc.nguyenba@vti.com.vn'
WHERE AccountID = 5;

-- Question 15 :  update account có id = 5 sẽ thuộc group có id = 4 
UPDATE `group`
SET CreatorID = 5
WHERE GroupID = 4;








