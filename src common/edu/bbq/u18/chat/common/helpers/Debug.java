package edu.bbq.u18.chat.common.helpers;

public abstract class Debug
{
	private static boolean DEBUG = false;


	public Debug(){}

	static
	{
		DEBUG = Boolean.parseBoolean(System.getProperty("global.debug", "false"));
	}
	/**************************************************************************/
	public static void show(String message)
	{
		if(DEBUG) ConsolePrint.showln(new StringBuilder("[DEBUG]").append(message));
	}
	/**************************************************************************/
	public static void show(StringBuilder message)
	{
		show(message.toString());
	}
	/**************************************************************************/
	public static void showError(String message)
	{
		if(DEBUG) ConsolePrint.showErrorln(new StringBuilder("[DEBUG]").append(message).toString());
	}
	/**************************************************************************/
}
