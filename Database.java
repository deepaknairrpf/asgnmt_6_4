import java.util.Random;
public final class Database {
   float[] marks = new float[250];
  int counter;
  Random rn= new Random();{
  for(counter=0;counter<250;counter++)
  {
	  marks[counter]=rn.nextFloat()*10;
	  
  }
  
  }
  float getMarks(int regNo)
  {
	
	  return (float)marks[regNo];
	 
  }
}
