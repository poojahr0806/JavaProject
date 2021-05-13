package iprime.com;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		Emp e1=new Emp();
		int choice;
		do{
   	    System.out.println("Enter choice: ");
          choice=  a.nextInt();
           
           switch(choice)
           {
               case 1:e1.read();
                       break;
               case 2:e1.display();
                       break;
               case 3:e1.SalRaise();
                       break;
               case 4:System.exit(choice);
               case 5:continue;
	       }
		}while(choice>=0);
	}
}