package statements;

public class BreakStatementWithNestedLoop {

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
	          break;
	        }
	        System.out.println("Inner Loop: " + j);
	        j++;
	      }
	      i++;
	    }
		
	}

}
