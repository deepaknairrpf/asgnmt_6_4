
public abstract class Student {
 String name,rollNo;
 int regNo;
 void setDetails(String name,String rollNo,int regNo)
 {
	 this.name=name;
	 this.rollNo=rollNo;
	 this.regNo=regNo;
 }
 abstract void printResults();
 abstract void setCgpa(float cgpa);
 abstract void setCompany(String company);
 void printDetails()
 {
	 System.out.println("Student Name "+ name +"\nRoll " + rollNo+"\nregNo "+ regNo);
	 printResults();
 }
}
