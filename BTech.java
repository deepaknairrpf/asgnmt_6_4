
public class BTech extends Student{
	BTech(){}
	BTech(String branch,int semester)
	{
		this.branch=branch;
		this.semester=semester;
	}
	private String branch;
	private float cgpa;
	private int semester;
 void printResults()
 {
	 System.out.println("Course Name - "+ branch + "\nSemester - "+semester+"\n CGPA - "+cgpa);
 }
 void setCgpa(float cgpa)
 {
	 this.cgpa=cgpa;
 }
 float getCgpa()
 {
	 return cgpa;
 }
 void setCompany(String company){}
}
