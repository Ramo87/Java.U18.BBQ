package edu.bbq.u18.chat.client;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public abstract class Configurations 
{
	/*************************************************************************************/
	static public void load(){}
	/*************************************************************************************/
	private static Properties properties = new Properties();
	
	static
	{
		try 
		{
			//FileSystems.getDefault().getSeparator()
			//File.separator
		properties.load(new BufferedReader(new FileReader(new StringBuilder("conf client").append(System.getProperty("file.separator")).append("multichat.properties").toString())));
		
		
		properties.forEach((k, v) -> { 	if(((String)k).startsWith("global.")) 
		{
			System.getProperties().setProperty(((String)k), ((String)v));
			
		}
		else if(((String)k).equalsIgnoreCase("app.version"))
		{
			SETTINGS.APP_VERSION= (String)v;
		}
		}
		);
		
		//PropertiesHandler.showProperties(System.getProperties());
		
		//ConsolePrint.showln(properties.size());
		
		//ConsolePrint.showln(properties.getProperty("global.debug"));
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	/*************************************************************************************/
}
