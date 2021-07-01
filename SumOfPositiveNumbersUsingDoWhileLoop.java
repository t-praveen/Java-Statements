//Sum Of Positive Numbers Using Do-While Loop//

package statements;
import java.util.Scanner;

public class SumOfPositiveNumbersUsingDoWhileLoop {

	public static void main(String[] args) {
		
			int sum = 0;
		    int number = 0;
		    Scanner input = new Scanner(System.in);
		    do {
		      sum += number;
		      System.out.print("Enter a number : ");
		      number = input.nextInt();
		    } while(number >= 0); 
			   
		    System.out.println("Sum = " + sum);
		    input.close();

		

	}

}
