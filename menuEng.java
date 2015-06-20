import java.util.Scanner;


public class menuEng
{
   public void customer_data1()
   {
	   
	   @SuppressWarnings("resource")
	   Scanner userInput=new Scanner(System.in); 
	  
	   menuEng itself1=new menuEng();
	   menuEng itself2=new menuEng();
	   
	   System.out.print("1-To know your bill press 1 \n2-For porting request press 2\n3-To talk to our customer care executive press 3\n4-To go back to previous menu press 9\n5-To exit press 0");
	   int choice1=userInput.nextInt();     
	   switch(choice1)
       {
        	case 1:System.out.print("Your bill is 800 Rupees.\n1-To go back to previous menu press 9\n2-To exit press 0");
        	int choice2=userInput.nextInt();
        	switch(choice2)
        	{
        	   case 9:itself1.customer_data1();
        	   case 0:break;
        	   default:System.out.print("Try again");
        	           itself1.customer_data1();
        	}break;
	        	
        	case 2:System.out.print("Your porting request is under process.\n1-To go back to previous menu press 9\n2-To exit press 0");
        	int choice3=userInput.nextInt();
        	switch(choice3)
        	{
        	   case 9:itself1.customer_data1();
        	   case 0:break;
        	   default:System.out.print("Try again");
        	           itself1.customer_data1();
        	}break;
	        	
        	case 3:System.out.print("All our executives are busy learning Java. Please try again later.\n1-To go back to previous menu press 9\n2-To exit press 0");
        	int choice4=userInput.nextInt();
        	switch(choice4)
        	{
        	   case 9:itself1.customer_data1();
        	   case 0:break;
        	   default:System.out.print("Try again");
        	   		   itself1.customer_data1();
        	}break;
	        	
        	case 9:itself1.customer_data1();
        	break;
        	
        	case 0:break;
        	
        	default:System.out.print("Wear Glasses before using Mobile");
	        }
   }
   
}