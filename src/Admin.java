import java.util.Scanner;
import java.util.HashMap;

public class Admin {
	
	 
	public static void Book()
	{
		HashMap<String, String> mapBook = new HashMap<String, String>();
		boolean loopAgain = true;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter Author Name:");
			String Author = scan.nextLine();

			System.out.println("Enter Book Name:");
			String Bname = scan.nextLine();

			String oldVal = mapBook.put(Author, Bname);
			if (oldVal!=null) 
			    {
				System.out.println("Author name:" + Author + " is "
						+ oldVal + " and has been overwritten by " + Bname);
			    }
			System.out.println("Enter another Book (y/n)?");
			String answer = scan.nextLine();
			if (answer.equals("y")) 
			    {
				continue;
			    } 
			    else 
			    {
				break;
		        }
		} while (loopAgain);
		scan.close();
		System.out.println("The following Books are in database");
		System.out.println("   Author  "+ "      Book Name");		
		for(String author:mapBook.keySet()){
			System.out.println("   "+author+"     "+mapBook.get(author));}
		}
	
		
	
	
	public static void Magazinex(){
		HashMap<Integer, String> mapMagazine = new HashMap<Integer, String>();
		boolean loopAgain = true;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter Issue date:");
			Integer issued  = Integer.parseInt(scan.nextLine());

			System.out.print("Enter Magazine Name:");
			String Mname = scan.nextLine();

			String oldVal = mapMagazine.put(issued, Mname);
			if (oldVal!=null) 
			    {
				System.out.println("Issue date:" + issued + " is "
						+ oldVal + " and has been overwritten by " + Mname);
			    }
			System.out.print("Enter another Magazine (y/n)?");
			String answer = scan.nextLine();
			if (answer.equals("y")) 
			    {
				continue;
			    } 
			    else 
			    {
				break;
		        }
		} while (loopAgain);
		scan.close();
		scan.close();
		System.out.println("The following Magazines are in database");
		System.out.println("   Issue date  "    +    "      MAgazine Name");		
		for(Integer issued:mapMagazine.keySet()){
			System.out.println("   "+issued+"     "+mapMagazine.get(issued));}
		}
		
}
	
