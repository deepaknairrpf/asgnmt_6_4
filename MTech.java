
public class MTech extends Student{
	private String branch,internCompany;
	private float cgpa;
	private int semester;
	MTech()
	{
		
	}
	MTech(String branch,int semester)
	{
		this.branch=branch;
		this.semester=semester;
	}
	void setCgpa(float cgpa)
	{
		this.cgpa=cgpa;
	}
	float getCgpa()
	{
		return cgpa;
	}
	
	void setCompany(String company)
	{
		internCompany=company;
	}
	void printResults()
	{
		 System.out.println("Course Name - "+ branch + "\nSemester - "+semester+"\n CGPA - "+cgpa+"\n"+"Internship Company = "+internCompany);
	}

}
