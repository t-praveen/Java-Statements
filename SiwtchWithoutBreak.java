//Switch without break//

package statements;

public class SiwtchWithoutBreak {

	public static void main(String[] args) {

		 int number = 44;
		    String size;
		    switch (number) 
		    {
		      case 29:
		        size = "Small";
		        System.out.println("Size: " + size);
		      case 42:
		        size = "Medium";
		        System.out.println("Size: " + size);
		      case 44:
		        size = "Large";
		        System.out.println("Size: " + size);
		      case 48:
		        size = "Extra Large";
		        System.out.println("Size: " + size);	      
		      default :
		        size = "Unknown";
		        System.out.println("Size: " + size);

		        

		    }
		   
		

	}

}
