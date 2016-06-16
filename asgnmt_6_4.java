import java.util.Scanner;
public class asgnmt_6_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String degree;
		 String name,rollNo;
		 Database d1 = new Database();
		 float cgpa;
		 int regNo;
		Student s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the degree,the student is pursuing\n.BTech or MTech??");
		degree=sc.nextLine();
		System.out.println(degree);
		System.out.println("Enter the name,roll and registration number of the student respectively");
		name=sc.nextLine();
		rollNo=sc.nextLine();
		regNo=sc.nextInt();
		
	
if(degree.equals("BTech"))
{
	String branch;
	int semester;
	System.out.println("Enter the branch,the student is currently pursuing");
	branch=sc.next();
	System.out.println("Enter the semester,the student is currently studying");
	semester=sc.nextInt();
	s1=new BTech(branch,semester);
	s1.setDetails(name,rollNo,regNo);
	cgpa=d1.getMarks(regNo);
	s1.setCgpa(cgpa);
	s1.printDetails();
}
else if(degree.equals("MTech"))
{
	String branch;
	int semester;
	System.out.println("Enter the branch,the student is currently pursuing");
	branch=sc.next();
	System.out.println("Enter the semester,the student is currently studying");
	semester=sc.nextInt();
	s1=new MTech(branch,semester);
	s1.setDetails(name,rollNo,regNo);
	cgpa=d1.getMarks(regNo);
	s1.setCgpa(cgpa);
	System.out.println("Which company did the student attend intern program from?");
	String company = sc.next();
	s1.setCompany(company);
	s1.printDetails();
}
}
}
