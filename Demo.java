import java.util.*;
class StudentDetails
{
	
	private int studentRollno;
	private String studentName;
	private int age;
	private String gender;
	private String phoneno;
	private int percentage;
	private String nationality;
	StudentDetails(int studentRollno,String studentName,int age,String gender,String phoneno,int percentage,String nationality)
	{
		this.studentRollno=studentRollno;
		this.studentName=studentName;
		this.age=age;
		this.gender=gender;
		this.phoneno=phoneno;
		this.percentage=percentage;
		this.nationality=nationality;
	}
	public int getStudentRollNo()
	{
		return studentRollno;
	}
	public String toString()
	{
		return studentRollno+" "+studentName+" "+age+" "+gender+" "+phoneno+" "+percentage+" "+nationality;
	}
}
class Demo
{
	public static void main(String args[])
	{
		List<StudentDetails> studentList = new ArrayList<StudentDetails>();
		Scanner sc = new Scanner(System.in);
		int op;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("1.Enter a Student details");
			System.out.println("2.View Student information");
			System.out.println("3.Update Student details");
			System.out.println("4.Delete student detail");
			System.out.println("5.View all students detail");
			System.out.println("0.Exit");
			System.out.print("Enter your option : ");
			op=sc.nextInt();
			switch(op)
			{
				case 1:
					System.out.print("Enter a student roll no : ");
					boolean found=false;
					int rollno=sc.nextInt();
					String stdname;
					int age;
					String gender;
					String phoneno;
					int percentage;
					String nationality;
				 	Iterator<StudentDetails> i=studentList.iterator();
					while(i.hasNext())
					{
						StudentDetails matchh=i.next();
						if(matchh.getStudentRollNo()==rollno)
						{
							System.out.println("***-------***-----------***-----------***-------***");
							System.out.println("Roll number alredy exits, enter a unique Rollno");
							System.out.println("***-------***-----------***-----------***-------***");
							found=true;
						}
					}
					if(!found)
					{
						System.out.print("Enter Student Name : ");
						stdname=in.nextLine();
						System.out.print("Enter Student age : ");
						age=sc.nextInt();
						System.out.print("Enter Student gender : ");
						gender=in.nextLine();
						System.out.print("Enter Student phone number  : ");
						phoneno=in.nextLine();
						System.out.print("Enter Student percentage : ");
						percentage=sc.nextInt();
						System.out.print("Enter Student nationality : ");
						nationality=in.nextLine();
						studentList.add(new StudentDetails(rollno,stdname,age,gender,phoneno,percentage,nationality));
					}
					
					
				break;
				case 2:
					System.out.print("Enter Student roll no : ");
					found=false;
					int rollno1=sc.nextInt();
					System.out.println("***-------***-----------***-----------***-------***");
				 	i=studentList.iterator();
					while(i.hasNext())
					{
						StudentDetails matchh=i.next();
						if(matchh.getStudentRollNo()==rollno1)
						{
							System.out.println(matchh);
							found=true;
						}
					}
					if(!found)
					{
						System.out.println("Student roll number not found");
					}
					System.out.println("***-------***-----------***-----------***-------***");
					
				break;
				case 3:
					found=false;
					System.out.print("Enter a student roll no to update deatils : ");
					rollno1=sc.nextInt();
					System.out.println("***-------***-----------***-----------***-------***");
				 	ListIterator<StudentDetails> newDetail = studentList.listIterator();
					while(newDetail.hasNext())
					{
						StudentDetails matchh=newDetail.next();
						if(matchh.getStudentRollNo()==rollno1)
						{
							System.out.print("Enter new Student Name : ");
							stdname=in.nextLine();
							System.out.print("Enter new Student age : ");
							age=sc.nextInt();
							System.out.print("Enter updated Student gender : ");
							gender=in.nextLine();
							System.out.print("Enter new Student phone number  : ");
							phoneno=in.nextLine();
							System.out.print("Enter new updetared percentage: ");
							percentage=sc.nextInt();
							System.out.print("Enter Student nationality : ");
							nationality=in.nextLine();
							newDetail.set(new StudentDetails(rollno1,stdname,age,gender,phoneno,percentage,nationality));
							found=true;
						}
					}
					if(!found)
					{
						System.out.println("Stundent roll no not found");
					}
					else
					{
						System.out.println("Information of customer has been succesfully updated");
					}
					System.out.println("***-------***-----------***-----------***-------***");
				break;
				case 4:
					found=false;
					System.out.print("Enter a student roll no whose details need to be delete : ");
					rollno1=sc.nextInt();
					System.out.println("***-------***-----------***-----------***-------***");
				 	i=studentList.iterator();
					while(i.hasNext())
					{
						StudentDetails matchh=i.next();
						if(matchh.getStudentRollNo()==rollno1)
						{
							i.remove();
							found=true;
						}
					}
					if(!found)
					{
						System.out.println("Student roll number not found");
					}
					else
					{
						System.out.println("student detail removed successfully");
					}
					System.out.println("***-------***-----------***-----------***-------***");
				break;
				case 5:
					System.out.println("***-------***-----------***-----------***-------***");
					i=studentList.iterator();
					while(i.hasNext())
					{
						StudentDetails matchh=i.next();
						System.out.println(matchh);
					}
					System.out.println("***-------***-----------***-----------***-------***");
				break;
				
					
					
			}

			
		}
		while(op!=0);
	}
}