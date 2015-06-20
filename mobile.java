
import java.util.*;
public class mobile 
{
    
	public static void main(String[] args) 
	{
		System.out.print("1-To continue in english press 1 \n2-Hindi mein jaankari ke liye 2 dabayein");
		
		//Taking Input from user
		@SuppressWarnings("resource")
		Scanner userInput=new Scanner(System.in);
		int choice=userInput.nextInt();
		
		//Calling data from other two Classses
		menuEng userchoice1= new menuEng();
		menuHindi userchoice2= new menuHindi();
		
		switch(choice)
		{
			//For menu in English
		    case 1:userchoice1.customer_data1();
			break;
			
			//For Menu in Hindi
		    case 2:userchoice2.customer_data2();
			break;
		}

	}

}
