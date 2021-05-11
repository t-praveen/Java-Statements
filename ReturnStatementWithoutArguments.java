package statements;

public class ReturnStatementWithoutArguments {
	
	 public int add() { // without arguments
	      int x = 30;
	      int y = 70;
	      int z = x+y;
	      return z;
	   }


	public static void main(String[] args) {
		
		ReturnStatementWithoutArguments test = new ReturnStatementWithoutArguments();
	      int add = test.add();
	      System.out.println("The sum of x and y is: " + add);

		

	}

}

