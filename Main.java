
public class Main {
	
	public static void main (String[] args)
	{
		Printer printer = new Printer (50, true);
		
		System.out.println("our initial page count = " + printer.getPagesPrint());
		
		int pagesPrint = printer.printPages(5);
		System.out.println("Number of pages printed = " + pagesPrint + ", new total count for printer = " + printer.getPagesPrint());
		
		//pagesPrint = printer.printPages(2);
		//System.out.println("Number of pages printed = " + pagesPrint + ", new total count for printer = " + printer.getPagesPrint());	
		
	}

}
