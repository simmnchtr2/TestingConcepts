import java.util.Scanner;

 public class runlibrary {
public static void main(String[] args)
{
  AdminLib lib=new  AdminLib();
  
	boolean loopAgain = true;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("WELCOME to Simba's Library, type anything to begin.");
	String bookchoice = scan.nextLine();
	
	do{
		
		System.out.println("Select an below option:");
		System.out.println("1) Add Book ");
		System.out.println("2) Add Magazine ");
		System.out.println("3) Modify");
		System.out.println("4) Delete");
		System.out.println("5) Show");
		System.out.println("6) Exit");
		String libchoice = scan.nextLine();

		if (bookchoice.equals("1"))
		{
			if(libchoice.equals("1"))
			{
               lib.AddBook();
			}
			if(libchoice.equals("2"))
			{
               lib.AddMagazine();
			}
			if(libchoice.equals("3"))
			{
			   System.out.println("Enter ISBN number");
			String isbnNumber = scan.nextLine();

			System.out.println("What you want to change?");
			System.out.println("1) Author/Mag name ");
			System.out.println("2) Book/issue date");
			System.out.println("3) All");
			String whatChng = scan.nextLine();

               lib.ModBook(isbnNumber,whatChng);
			}
			if(libchoice.equals("4"))
			{
				System.out.println("Enter ISBN number");
				String isbnNumber = scan.nextLine();
               lib.DelBook(isbnNumber);
			}
			if(libchoice.equals("5"))
			{
               lib.show();
			}
			if(libchoice.equals("6"))
			{
				break;
			}
		}
		else
		{
		  System.out.println("Error please press 1");
		  bookchoice =scan.nextLine();
	     }
	}
	
    while(loopAgain);
	scan.close();
       

 }
}


