//1Sum of positive numbers using while loop//

package statements;
import java.util.Scanner;

public class SumOfPositiveNumbersOnlyUsimgWhileLoop {

	public static void main(String[] args) {

		   
	    int sum = 0;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int number = input.nextInt();
	    while (number >= 0) 
	    {
	      sum += number;

	      System.out.print("Enter a number : ");
	      number = input.nextInt();
	    }
	    System.out.println("Sum = " + sum);
	    input.close();	
	}

}
