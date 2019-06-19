
public class Printer {
	
	private int tonerLevel = 100;
	private int pagesPrint;
	private boolean duplexPrinter;
	
	public Printer(int tonerLevel,boolean duplexPrinter) {
		if (tonerLevel >=0 && tonerLevel <= 100)
		{
			this.tonerLevel = tonerLevel;
		}
		else
		{
			this.tonerLevel = -1;
		}
		this.pagesPrint = 0;
		this.duplexPrinter = duplexPrinter;
	}

	public int addToner (int tonerAmount)
	{
		if (this.tonerLevel >0 && this.tonerLevel <= 100)
		{
			if (this.tonerLevel + tonerAmount > 100)
			{
				return -1;
			}
			else
			{
				this.tonerLevel += tonerAmount;
				return this.tonerLevel;
			}
		}
		else
		{
			return -1;
		}
		
		
	}
	
	public int printPages (int pages)
	{
		int pagesToPrint = pages;
		if (this.duplexPrinter)
		{
			pagesToPrint = (pages/2) + (pages%2);
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrint += pagesToPrint;
		return pagesToPrint;
		
	}

	public int getPagesPrint() {
		return pagesPrint;
	}
	
	
	
	

	
}
