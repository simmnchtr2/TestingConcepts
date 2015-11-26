import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Magazine extends Info {
	
	public String getIsbnnumber() {
		return isbnnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIssued() {
		return issued;
	}
	public void setIssued(String issued) {
		this.issued = issued;
	}
	public void setIsbnnumber(String isbnnumber) {
		this.isbnnumber = isbnnumber;
	}
	String name;
	String issued;
	public String isbnnumber;
	Scanner inp=new Scanner(System.in);
	
	public void getinfo()
	{
		System.out.println("Enter Issue date");
		issued =inp.nextLine();
		System.out.println("Enter Magazine name");
		name =inp.nextLine();
		System.out.println("Enter ISBN number");
		isbnnumber = inp.nextLine();
	}
	public void Modify(String chng)
	{
		if(chng.equals("1") || chng.equals("3"))
		{
		System.out.println("Enter the Magazine name");
		name =inp.nextLine();	
		}
		if(chng.equals("2") || chng.equals("3"))
		{
		System.out.println("Enter the Issue date");
		issued =inp.nextLine();
		}
	 }
	public String toString() {
		return ("Issue date: "+ issued+"\nMagazine NAme: " + name+ "\n-----------------------");
	}

}