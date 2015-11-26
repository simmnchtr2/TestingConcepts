import java.util.Scanner;

public class librarymgmt {
	public static void main(String args[]){
		System.out.println("Enter 1 for Book or 2 for Magazine:");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		Admin a = new Admin();

		switch (i)
	{
		case 1:
		{
			a.Book();
			break;
		}
		case 2:
		{
			a.Magazinex();
			break;
		}
	}
  }

}
