package logging;

public final class Numbers
{
	/********************************************************************************/
	public static boolean isNumeric(String arg)
	{
		try
		{
			Double.parseDouble(arg);
			return true;
		}
		catch(NumberFormatException ex) 
		{
			return false;
		}
	}
	/********************************************************************************/
}
