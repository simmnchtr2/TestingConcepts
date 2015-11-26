import java.util.*;
abstract class Info
{
	public abstract String getIsbnnumber();
	public abstract void getinfo();
	public abstract void Modify(String chng);
}


  class Book extends Info {

	String author;
	String name;
    public String isbnnumber;
	Scanner inp=new Scanner(System.in);
	
	public String getIsbnnumber() {
		return isbnnumber;
	}

	public void setIsbnnumber(String isbnnumber) {
	this.isbnnumber = isbnnumber;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 
	public void getinfo()
	{
		System.out.println("Enter the author");
		author =inp.nextLine();	
		System.out.println("Enter the Book name");
		name =inp.nextLine();
		System.out.println("Enter ISBN number");
		isbnnumber = inp.nextLine();
	 }
	
	public void Modify(String chng)

	{
		if(chng.equals("1") || chng.equals("3"))
		{
		System.out.println("Enter the author");
		author =inp.nextLine();	
		}
		if(chng.equals("2") || chng.equals("3"))
		{
		System.out.println("Enter the Book name");
		name =inp.nextLine();
		}
	 }

	
public String toString() {
	return ("Author: "+ author+"\nBook Name: " + name +"\n-----------------------");
}

	
	}

	




