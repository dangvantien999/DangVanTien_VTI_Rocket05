package Assignment03;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Execrise01 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// Create group
		Group group1 = new Group();
		group1.groupID = 1;
		group1.name = "Java Fresher";
		group1.createDate = new Date(2020, 04, 21);

		Group group2 = new Group();
		group2.groupID = 2;
		group2.name = "DB Fresher";
		group2.createDate = new Date(2020, 05, 22);

		Group group3 = new Group();
		group3.groupID = 3;
		group3.name = "C++ Fresher";
		group3.createDate = new Date(2020, 06, 23);

		// Create Deparment
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.name = "Marketting";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.name = "HR";

		// Create Position
		Position position1 = new Position();
		position1.positionID = 1;
		position1.name = "Manager";

		Position position2 = new Position();
		position2.positionID = 2;
		position2.name = "Team Leader";

		Position position3 = new Position();
		position3.positionID = 3;
		position3.name = "Trainee";

		// Create account
		Account account1 = new Account();
		account1.accountID = 1;
		account1.createDate = new Date(2020, 03, 17);
		account1.department = department1;
		account1.email = "An@gmail.com";
		account1.fullname = "Nguyen Van An";
		account1.position = position1;
		account1.username = "an.nguyenvan";
		account1.luong = (float)5623.23;

		Account account2 = new Account();
		account2.accountID = 2;
		account2.createDate = new Date(2020, 01, 9);
		account2.department = department1;
		account2.email = "Linh@gmail.com";
		account2.fullname = "Nguyen Hoai Linh";
		account2.position = position3;
		account2.username = "Linh.nguyenhoai";
		account2.luong = (float)7452.23;

		Account account3 = new Account();
		account3.accountID = 3;
		account3.createDate = new Date(2020, 03, 19);
		account3.department = department2;
		account3.email = "ha@gmail.com";
		account3.fullname = "Pham Hai Ha";
		account3.position = position1;
		account3.username = "Ha.phamhai";
		account3.luong = (float)5693.23;

		// add group to account
		Group[] groupOfAccount1 = { group1 };
		account1.groups = groupOfAccount1;

		Group[] groupOfAccount2 = { group3 };
		account2.groups = groupOfAccount2;

		Group[] groupOfAccount3 = { group1 };
		account3.groups = groupOfAccount3;

		// add account to group
		Account[] accountOfGroups1 = { account1, account2, account3 };
		group1.accounts = accountOfGroups1;

		// Create CategoryQuestion
		CategoryQuestion category1 = new CategoryQuestion();
		category1.categoryID = 1;
		category1.categoryName = "JAVA";

		CategoryQuestion category2 = new CategoryQuestion();
		category2.categoryID = 2;
		category2.categoryName = "DB";

		CategoryQuestion category3 = new CategoryQuestion();
		category3.categoryID = 3;
		category3.categoryName = "C++";

		// Create TypeQuestion
		TypeQuestion type1 = new TypeQuestion();
		type1.typeQuestionID = 1;
		type1.typeName = TypeNameQuestion.Essay;

		TypeQuestion type2 = new TypeQuestion();
		type2.typeQuestionID = 2;
		type2.typeName = TypeNameQuestion.Multiple_Choice;

		// Create Question
		Question question1 = new Question();
		question1.categoryQuestion = category1;
		question1.content = "Dac diem chinh cua Java";
		question1.createDate = new Date(2020, 1, 7);
		question1.account = account1;
		question1.questionID = 1;
		question1.typeQuestion = type1;

		Question question2 = new Question();
		question2.categoryQuestion = category1;
		question2.content = "Cac chuong trinh Java chu yeu";
		question2.createDate = new Date(2020, 2, 8);
		question2.account = account1;
		question2.questionID = 2;
		question2.typeQuestion = type2;

		Question question3 = new Question();
		question3.categoryQuestion = category1;
		question3.content = "Quy tac thiet ke Database";
		question3.createDate = new Date(2019, 2, 9);
		question3.account = account2;
		question3.questionID = 3;
		question3.typeQuestion = type1;

		// Create exam
		Exam exam1 = new Exam();
		exam1.code = "JV01";
		exam1.createDate = new Date(2019, 9, 4);
		exam1.account = account1;
		exam1.duration = Duration.MINUTE_60;
		exam1.examID = 1;
		exam1.title = "Các ràng buộc trong Java";

		Exam exam2 = new Exam();
		exam2.code = "DB01";
		exam2.createDate = new Date(2019, 12, 4);
		exam2.account = account2;
		exam2.duration = Duration.MINUTE_45;
		exam2.examID = 2;
		exam1.title = "Kiến thức cơ bản của SQL";

		// add question to exam
		Question[] questionOfExam1 = { question1, question2 };
		exam1.questions = questionOfExam1;

		Question[] questionOfExam2 = { question3 };
		exam1.questions = questionOfExam2;

		// Create Answer
		Answer answer1 = new Answer();
		answer1.answerID = 1;
		answer1.content = "PHP là ngôn ngư phổ biến nhất";
		answer1.isCorrect = true;
		answer1.question = question1;

		Answer answer2 = new Answer();
		answer2.answerID = 2;
		answer2.content = "PHP Là ngôn ngữ lập trình miễn phí";
		answer2.isCorrect = false;
		answer2.question = question1;
		
		// Question 1
		int luong1  = (int)account1.luong;
		int luong2  = (int)account2.luong;
		System.out.println("Lương của Account 1 là :" + luong1 + "$");
		System.out.println("Lương của Account 1 là :" + luong2 + "$");
		
		
		// Question 2
		int min = 0;
		int max = 99999;
		int x = (int) (Math.random() * max) + min;
		while (x < 10000) {
			x = x * 10;
		}
		System.out.println("Số ngẫu nhiên: " + x);
		
		// Question 3
		String haisocuoi = String.valueOf(x);
		System.out.println("Hai số cuối: " + haisocuoi.substring(3));
		
		Question4();
		}
	// Question 4 
			public static void Question4() {
				Scanner nhap = new Scanner(System.in);
				
				System.out.println("Mời nhập số thứ nhất :");
				int a = nhap.nextInt();
				System.out.println("Mời bạn nhập vào số thứ 2 :");
				int b = nhap.nextInt();
				float kq = (float) a/b;
				System.out.println("Thương của 2 số là : "+ kq);
		
		
		
		
		
		
		
		
		
		
		

	}

}
