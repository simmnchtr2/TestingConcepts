import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

abstract class Adminmethods{
	protected abstract void show();
	public void search()
	{
		return;
	}
}
     



public class AdminLib extends Adminmethods {

	 static ArrayList<Info> bk= new ArrayList<Info>();
	
	 public void AddBook()
	{
		Book b = new Book();
		b.getinfo();
		bk.add(b);
		 
	}
	
	public void ModBook(String isbnNumber, String chng)
	{
		
		ListIterator<Info> iter = bk.listIterator();   
        while (iter.hasNext()) 
        {
        	
           Info book = iter.next();
           if(book.getIsbnnumber().equals(isbnNumber)){
        	   book.Modify(chng);   
               iter.set(book);
               System.out.print("Book modified succesfully");
               break;
           }
        }
             
	     
	}
	
	public void DelBook(String isbnNumber)
	{
		ListIterator<Info> iter = bk.listIterator();   
        while (iter.hasNext()) 
        {
        	 Info book = iter.next();
             if(book.getIsbnnumber().equals(isbnNumber)){
            	iter.remove();
             }
        	
        }
	}
	
	 public void show(){
		if(bk.isEmpty())
		{
			System.out.println("No Info found in library");
		}
		else
		{
			for (Info value : bk) {
			    System.out.println(value);
			}
		}
	
}
	public void AddMagazine()
	{
		Magazine m = new Magazine();
		m.getinfo();
		bk.add(m);
	}
	
	public void DelMag()
	{
		Magazine m = new Magazine();
		m.getinfo();
		for(Info i: bk)
		{
			Magazine s =(Magazine)i;
			if(s.issued.equals(m.issued));
			{
				bk.remove(i);
			}
		}
	}
	
	/*public void ModMag()
	{
		Magazine m = new Magazine();
	m.getinfo();
		for(Information i: bk)
		{
		Magazine s =(Magazine)i;
			if(s.issued.equals(m.issued));
			{
			bk.remove(i);
			}
		bk.add(m);
		}
      }
      */
	
	public void ShowMag()
	{
		if(bk.isEmpty())
		{
			System.out.println("No magazine found in library");
		}
		else
		{
	       for(Info i: bk)
	        {
	        	Magazine s=(Magazine)i;
                System.out.println("Issue date: "+s.issued);
                System.out.println("Magazine name: "+s.name);
                System.out.println("-------------------------");
	        }
		}
		
	}
	
}
