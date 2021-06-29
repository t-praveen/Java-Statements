//CONTINUE STATEMENT WITH NESTED LOOP//

package statements;

public class ContinueStatementWithNestedLoop {

	public static void main(String[] args) {

		int i = 1, j = 1;
	    while (i <= 3) 
	    {

	      System.out.println("Outer Loop: " + i);
	      while(j <= 3)
	      {

	        if(j == 2) 
	        {
	          j++;
	          continue;
	        }
	        System.out.println("Inner Loop: " + j);
	        j++;
	      }
	      i++;
	    }

		
	}

}
