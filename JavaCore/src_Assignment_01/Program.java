import java.time.LocalDate;

public class Program {
	public static void main(String[] args) {
		// create department
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.name = "Marketting";
		
		Department department3 = new Department();
		department3.departmentID = 3;
		department3.name = "ke Toan";

		// create group
		Group group1 = new Group();
		group1.groupID = 1;
		group1.name = "Group 1";

		Group group2 = new Group();
		group2.groupID = 2;
		group2.name = "Group 2";
		
		Group group3 = new Group();
		group3.groupID = 3;
		group3.name = "Group 3";

		// Create position
		Position position1 = new Position();
		position1.positionID = 1;
		position1.name = "Le Ve";

		Position position2 = new Position();
		position2.positionID = 2;
		position2.name = "Test";
		
		Position position3 = new Position();
		position3.positionID = 3;
		position3.name = "DEV";

		// Create account
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "tyltien@gmail.com";
		account1.groups = new Group[] { group2};
		account1.position = position1;
		account1.department = department1;
		account1.fullname = "Dang Van Tien";
		account1.createDate = LocalDate.now();
		account1.username = "TienDang";

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "Ngothanhtam@gmail.com";
		account2.groups = new Group[] { group1 };
		account2.position = position2;
		account2.department = department2;
		account2.fullname = "Ngo Thanh Tam";
		account2.createDate = LocalDate.now();
		account2.username = "TamNgoNgan";

		Account account3 = new Account();
		account3.accountID = 3;
		account3.email = "DooDoxuanvinh@gmail.com";
		account3.groups = new Group[] { group3 };
		account3.position = position2;
		account3.department = department3;
		account3.fullname = "Do Xuan Vinh";
		account3.createDate = LocalDate.now();
		account3.username = "VinhNgaoNgo";
		
		//GroupAccount
		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.groupID = group2;
		groupAccount1.accountID = account3;
		
		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.groupID = group1;
		groupAccount2.accountID = account2;
		
		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.groupID = group2;
		groupAccount3.accountID = account3;
		
		//TypeQuestion
		TypeQuestion typequestion1 = new TypeQuestion();
		typequestion1.typeQuestionID = 1;
		typequestion1.typeName = TypeNameQuestion.Multiple_Choice;
		
		TypeQuestion typequestion2 = new TypeQuestion();
		typequestion2.typeQuestionID = 2;
		typequestion2.typeName = TypeNameQuestion.Essay;
		
		TypeQuestion typequestion3 = new TypeQuestion();
		typequestion3.typeQuestionID = 3;
		typequestion3.typeName = TypeNameQuestion.Multiple_Choice;
		
		//CategoryQuestion
		CategoryQuestion categoryquestion1 = new CategoryQuestion();
		categoryquestion1.categoryID = 1;
		categoryquestion1.categoryName = "SQL";
		
		CategoryQuestion categoryquestion2 = new CategoryQuestion();
		categoryquestion2.categoryID = 2;
		categoryquestion2.categoryName = "PHP";
		
		CategoryQuestion categoryquestion3 = new CategoryQuestion();
		categoryquestion3.categoryID = 3;
		categoryquestion3.categoryName = "RuBy";
		
		// print department
		System.out.println("Department 2:");

		System.out.println("name: " + department2.name);
		System.out.println("id: " + department2.departmentID);
		System.out.println("\n");

		System.out.println("Department 3 information: ");

		System.out.println("name: " + department3.name);
		System.out.println("id: " + department3.departmentID);
		System.out.println("\n");

		// print account
		System.out.println("Account 1 :");

		System.out.println("id: " + account1.accountID);
		System.out.println("Email: " + account1.email);
		System.out.println("Department Name: " + account1.department.name);
		System.out.println("Create Date: " + account1.createDate);
		System.out.println("\n");
		
		System.out.println("Account 3 :");
		
		System.out.println("id: " + account3.accountID);
		System.out.println("Email: " + account3.email);
		System.out.println("Department Name: " + account3.department.name);
		System.out.println("Create Date: " + account3.createDate);
		System.out.println("\n");
		
		// print exam
		System.out.println("CategoryQuestion 1 :");
		
		System.out.println("id: " + categoryquestion1.categoryID);
		System.out.println("Name: " + categoryquestion1.categoryID);

	}
}
