//Return statement with arguments//

package statements;

public class ReturnStatementWithArguments {
	
	public int add(int x, int y) { // with arguments
	      int z = x+y;
	      return z;
	}
	

	public static void main(String[] args) {
		
		  ReturnStatementWithArguments test = new ReturnStatementWithArguments();
	      int add = test.add(10, 20);
	      System.out.println("The sum of x and y is: " + add);

		

	}

}
