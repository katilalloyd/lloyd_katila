/**
 * 
 */
package ArrayStudents;
import java.util.Scanner;
/**
 * @author ccs/00033/020
 * Oduor stanley
 *
 */
public class Credentials {
	
	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		double[]studentMarks= new double[3];
        String[]studentName=new String[3];
        
        for(int j=0;j<studentName.length;j++) {
        	
        System.out.println("The name of the student");
        studentName[j]= keyIn.nextLine();
        }
      for(int i=0;i<studentName.length;i++)  {
        System.out.println("Enter the student marks for "+studentName[i]);
        studentMarks[i]=keyIn.nextDouble();
        
      }
      for (int k=0;k<studentName.length;k++)
        {
        	System.out.println("NAME:"+studentName[k] +"   SCORE:"+studentMarks[k]);
      
        }
        	
	}
}
