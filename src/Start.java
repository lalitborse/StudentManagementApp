import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		
		System.out.println("welcome to student management app");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		while (true)
		{
		System.out.println("PRESS 1 to ADD student");
		System.out.println("PRESS 2 to Delete student");
		System.out.println("Press 3 to display student"); 
		System.out.println("Press 4 to exit app");

		int c=Integer.parseInt(br.readLine());

		if(c==1)
		{
			
			System.out.println("Enter user name :"); 
			String name = br.readLine();

			System.out.println("Enter user phone : "); 
			String phone = br.readLine();

			System.out.println("Enter user city :"); 
			String city = br.readLine();
			Student st = new Student(name,phone,city);
			//Student st = new Student("lalit","8855","pune");
			boolean answer = StudentDao.insertStudentToDB(st);
			if(answer)
			{
				System.out.println("Student is added successfully");
			}	
			else
			{
				System.out.println("Something went wrong try again....");
			}
			System.out.println(st);
	
		}
		
		else if(c==2)
		{
		 	System.out.println("Enter student id to delete: ");
		 	int userID=Integer.parseInt(br.readLine());
		 	boolean f = StudentDao.deleteStudent(userID);
		 	if(f)
		 	{
		 		System.out.println("Deleted...");
		 	}
		 	else
		 	{
		 		System.out.println("Something went wrong.......");
		 	}
		 	
		}
		else if(c==3)
		{
			StudentDao.showAllStudent();
		 	
		}
		else if(c==4)
		{
		 break;  
		}
	/*	else 
		{
			
		}*/
		
		}
	   System.out.println("Thank You For using my application....");
	   System.out.println(" see you soon...");

	
	}
}
