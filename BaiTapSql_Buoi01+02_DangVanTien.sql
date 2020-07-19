CREATE DATABASE QLBaiThi;
USE QLBaiThi;

CREATE TABLE Department (
	DepartmentID 		INT auto_increment,
    DepartmentName 		NVARCHAR(50),
    PRIMARY KEY (DepartmentID)
);
-- ALTER TABLE Department
-- ADD primary key (DepartmentID) câu lệnh dùng khi bảng đã được tạo và muốn thêm khóa
-- ADD Constraint TenKhoaNgoai forenign key (DepartmentID) REFERENCES Department(DepartmentID),
CREATE TABLE `Position` (
	PositionID 		INT not null auto_increment,
    PositionName	NVARCHAR(50),
    PRIMARY KEY (PositionID)
);

CREATE TABLE `Account`(
	AccountID 		INT auto_increment,
    Email 			VARCHAR(50),
    UserName 		VARCHAR(50),
    FullName 		NVARCHAR(50),
    DepartmentID 	INT,
    PositionID 		INT,
    CreateDate 		DATETIME DEFAULT NOW() ,
    UNIQUE KEY(Email,UserName),
    PRIMARY KEY (AccountID),
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
    FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID)
);
CREATE TABLE `Group` (
	GroupID 		INT AUTO_INCREMENT,
    GroupName 		NVARCHAR(50),
    CreatorID 		INT,
    CreateDate 	 	DATETIME DEFAULT NOW(),
    PRIMARY KEY (GroupID),
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

CREATE TABLE GroupAccount(
	GroupID 		INT,
    AccountID 		INT,
    JoinDate 		DATETIME DEFAULT NOW(),
	FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID),
    FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID)
);

CREATE TABLE TYPEQUESTION(
	TypeID 			INT AUTO_INCREMENT,
    TypeName 		NVARCHAR(50),
    PRIMARY KEY(TypeID)
);

CREATE TABLE CATEGORYQUESTION(
	CategoryID 		INT AUTO_INCREMENT,
    CategoryName 	NVARCHAR(50),
    PRIMARY KEY (CategoryID)
);

CREATE TABLE QUESTION(
	QuestionID 		INT AUTO_INCREMENT,
    Content 		NVARCHAR(50),
    CategoryID 		INT,
    TypeID 			INT,
    CreatorID 		INT,
    CreateDate 		DATETIME DEFAULT NOW(),
    PRIMARY KEY (QuestionID),
    FOREIGN KEY (CategoryID) REFERENCES CATEGORYQUESTION(CategoryID),
    FOREIGN KEY (TypeID) REFERENCES TYPEQUESTION(TypeID),
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

CREATE TABLE ANSWER(
	AnswerID 		INT AUTO_INCREMENT,
    Content 		NVARCHAR(50),
    QuestionID 		INT,
    isCorrect 		BOOL,
    PRIMARY KEY (AnswerID),
    FOREIGN KEY (QuestionID) REFERENCES QUESTION(QuestionID)
);

CREATE TABLE EXAM(
	ExamID 			INT AUTO_INCREMENT,
    `Code` 			INT,
    Title 			NVARCHAR(50),
    CategoryID 		INT,
    Duration 		TIME,
    CreatorID 		INT,
    CreateDate 		DATETIME DEFAULT NOW(),
    UNIQUE KEY (`Code`),
    PRIMARY KEY (ExamID),
    FOREIGN KEY (CategoryID) REFERENCES CATEGORYQUESTION(CategoryID),
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

CREATE TABLE EXAMQUESTION(
	ExamID 			INT AUTO_INCREMENT,
    QuestionID 		INT,
    FOREIGN KEY (ExamID) REFERENCES EXAM(ExamID),
    FOREIGN KEY (QuestionID) REFERENCES QUESTION(QuestionID)
);
