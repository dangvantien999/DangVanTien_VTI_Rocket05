import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Exercise02 {

	public static void main(String[] args) {
		// Create group
		Group group1 = new Group();
		group1.groupID = 1;
		group1.name = "Java Fresher";
		group1.createDate = new Date(2020, 04, 21);;

		Group group2 = new Group();
		group2.groupID= 2;
		group2.name = "DB Fresher";
		group2.createDate = new Date(2020, 04, 21);;

		Group group3 = new Group();
		group3.groupID = 3;
		group3.name = "C++ Fresher";
		group3.createDate = new Date(2020, 04, 15);;

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
		account1.email = "tyltien@gmail.com";
		account1.groups = new Group[] { group2};
		account1.position = position1;
		account1.department = department1;
		account1.fullname = "Dang Van Tien";
		account1.createDate = new Date(2020, 04, 16);
		account1.username = "TienDang";

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "Ngothanhtam@gmail.com";
		account2.groups = new Group[] { group1 };
		account2.position = position2;
		account2.department = department2;
		account2.fullname = "Ngo Thanh Tam";
		account2.createDate = new Date(2020, 04, 16);
		account2.username = "TamNgoNgan";

		Account account3 = new Account();
		account3.accountID = 3;
		account3.email = "DooDoxuanvinh@gmail.com";
		account3.groups = new Group[] { group3 };
		account3.position = position2;
		account3.department = department3;
		account3.fullname = "Do Xuan Vinh";
		account3.createDate = new Date(2020, 04, 16);
		account3.username = "VinhNgaoNgo";


		Group[] groupOfAccount1 = { group1 };
		account1.groups = groupOfAccount1;

		Group[] groupOfAccount2 = { group3 };
		account2.groups = groupOfAccount2;

		Group[] groupOfAccount3 = { group1 };
		account3.groups = groupOfAccount3;


		Account[] accountOfGroups1 = { account1, account2, account3 };
		group1.accounts = accountOfGroups1;

		
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
		
		
		// Question 1
		int a = 5;
		System.out.printf("%d%n", a);

		// Question 2
		int b = 25000000;
		System.out.printf(Locale.US, "%,d%n", b);

		// Question 3
		float c = 6.254665f;
		System.out.printf("%5.4f%n", c);

		// Question 4
		String s = "Đặng Văn Tiến";
		System.out.printf("Tên tôi là \"" + s + "\" và tôi có vợ rồi \n");

		// Question 5.
		String pattern = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);



	}

}
