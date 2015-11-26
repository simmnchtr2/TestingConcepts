import java.util.Scanner;


public class runarray {
	private static testarray Runarray = new testarray();
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to my library");
		while (true)
		{
			System.out.println("Enter command then identifier and data");
			String command = in.nextLine();
			if (command.substring(0 , 3).equalsIgnoreCase("add"))
			{
				add(command);
			}
			if (command.substring(0 , 3).equalsIgnoreCase("get"))
			{
				get(command);
			}
			if (command.substring(0 , 3).equalsIgnoreCase("sho"))
			{
				sho(command);
			}
			if (command.substring(0 , 3).equalsIgnoreCase("del"))
			{
				del(command);
			}

		}
		
	}
	public static void add(String command)
	{
		command = command.substring(4);
		String identify = command.substring(0 , command.indexOf(" "));
		String data = command.substring(command.indexOf(" ")+1);
		Runarray.setData(identify, data);
	}
	
	public static void get(String command)
	{
		String identify = command.substring(4);
		System.out.println(Runarray.getData(identify));
		
	}
	
	public static void sho(String command)
	{
		Runarray.Showdata();
	}
	
	public static void del(String command)
	{
		command = command.substring(4);
		String identify = command.substring(0 , command.indexOf(" "));
		String data = command.substring(command.indexOf(" ")+1);
		Runarray.delData(identify, data);
	}

}
