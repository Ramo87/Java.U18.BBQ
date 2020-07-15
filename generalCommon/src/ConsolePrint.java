
import logging.LOGGER;

import java.util.logging.Level;

public abstract class ConsolePrint
{
	private static boolean LOG = false;
	
	static
	{
		LOG = Boolean.parseBoolean(System.getProperty("global.log", "false"));
	}
	/*********************************************************************************************************/
	public static void showln(String str)
	{
		System.out.println(str);
		
		if(LOG) LOGGER.log(Level.INFO, str);
	}
	/*********************************************************************************************************/
	private ConsolePrint(){}
	/*********************************************************************************************************/
	public static void showln(StringBuilder str)
	{
		showln(str.toString());
		
	}
	/*********************************************************************************************************/
	public static void showErrorln(String str)
	{
		System.err.println(str);
		
		if(LOG)LOGGER.log(Level.SEVERE, str);
	}
	/*********************************************************************************************************/
}
