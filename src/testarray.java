import java.util.*;


public class testarray {
	ArrayList<String> Identify= new ArrayList<String>();
	ArrayList<String> Data= new ArrayList<String>();
	
	public testarray()
	{
		
	}
	
	public void setData (String identify, String data)
	{
		int index = -1;
		for (int i=0; i<Identify.size(); i++)
		{
			if(identify.equals(Identify.get(i)))
			{
				index = i;
				i = Identify.size();
			}
		}
		if (index > -1)
		{
			Identify.remove(index);
			Data.remove(index);
		}
		Identify.add(identify);
		Data.add(data);
	}
	
	public String getData(String identify)
	{
		int index = -1;
		for (int i=0; i<Identify.size(); i++)
		{
			if(identify.equals(Identify.get(i)))
			{
				index = i;
				i = Identify.size();
			}
		}
		if (index > -1)
		{
			return Data.get(index);
		}
		return "Identifier not found!";
		
	}
	
	public void delData (String identify, String data)
	{
		int index = -1;
		for (int i=0; i<Identify.size(); i++)
		{
			if(identify.equals(Identify.get(i)))
			{
				index = i;
				i = Identify.size();
			}
		}
		if (index > -1)
		{
			Identify.remove(index);
			Data.remove(index);
		}
		
	}
	
	public void Showdata()
	{
		if(Identify.isEmpty())
		{
			System.out.println("No book found in library");
		}
		else
		{
	       for(String i: Identify)
	        {
	        	
                System.out.println("Identifier: "+ Identify);
                System.out.println("Data info: "+  Data);
                System.out.println("-------------------------");
                break;
	        }
		}
	}
	
}
