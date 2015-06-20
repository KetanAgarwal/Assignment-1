import java.util.Scanner;


public class menuHindi 
{
	public void customer_data2()
	   {
		   
		   @SuppressWarnings("resource")
		   Scanner userInput=new Scanner(System.in); 
		  
		   menuEng itself1=new menuEng();
		   menuEng itself2=new menuEng();
		   
		   System.out.print("1-Apna bill janne ke liye press kre 1 \n2-Apne request ko port krne ke liye press kre 2\n3-Humare customer care executive se baat krne ke liye press kre 3\n4-Pichle menu pe jane ke liye press kre 9\n5-Bahar jane ke liye press kre 0");
		   int choice1=userInput.nextInt();     
		   switch(choice1)
	       {
	        	case 1:System.out.print("Apka bill 800 rupee hai.\n1-Pichle menu pe jane ke liye press kre 9\n2-Bahar jane ke liye press kre 0");
	        	int choice2=userInput.nextInt();
	        	switch(choice2)
	        	{
	        	   case 9:itself2.customer_data1();
	        	   case 0:break;
	        	   default:System.out.print("Try again");
	        	           itself2.customer_data1();
	        	}break;
		        	
	        	case 2:System.out.print("Apki porting request abhi karya pr hai.\n1-Pichle menu pe jane ke liye press kre 9\n2-Bahar jane ke liye press kre 0");
	        	int choice3=userInput.nextInt();
	        	switch(choice3)
	        	{
	        	   case 9:itself2.customer_data1();
	        	   case 0:break;
	        	   default:System.out.print("Try again");
    	                   itself2.customer_data1();
	        	}break;
		        	
	        	case 3:System.out.print("Humare sare executives Java padne mein busy hain. Kripya badmein koshish karen.\n1-Pichle menu pe jane ke liye press kre 9\n2-Bahar jane ke liye press kre 0");
	        	int choice4=userInput.nextInt();
	        	switch(choice4)
	        	{
	        	   case 9:itself2.customer_data1();
	        	   case 0:break;	
	        	   default:System.out.print("Try again");
    	                   itself2.customer_data1();
	        	}break;
		        	
	        	case 9:itself2.customer_data1();
	        	break;
	        	
	        	case 0:break;
	        	
	        	default:System.out.print("Apne chasme ka number badva le");
		        }
	   }
}
