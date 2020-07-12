package edu.bbq.u18.chat.common.lib;

public abstract class Numbers 
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
