package edu.bbq.u18.chat.client;

import edu.bbq.u18.chat.common.helpers.Debug;
import abstractClasses.knowledge.DataTypes;
import logging.ArgumentsHandler;

public abstract class Arguments 
{
	static
	{
			
		handleArguments( ArgumentsHandler.getPropertiesFromAppCallBySystem());
		
	}
			
	
	/**********************************************************************************/
	private static void handleArguments(String[] args)
	{	
		
		if(args.length > 0) 
		{
			
			for(int i = 0; i<args.length; i++)
			{
				switch(args[i].toLowerCase()) 
				{
					case "debug": 
						System.setProperty("global.debug", "true");
						break;
						
					case "log": 
						System.setProperty("global.log", "true");
						break;
					
					case "showdatatypes":
						SETTINGS.SHOWDATATYPES = true;
						break;
				}
				//Test
				if(SETTINGS.SHOWDATATYPES)
				{
					String dataType = DataTypes.getDataTypeAsString(args[i]);
					
					Debug.show(new StringBuilder(args[i]).append(" = ").append(dataType).append(" (Primitiver Datentype = ").append(DataTypes.isPrimitiveDataType(dataType)).append(")"));
				
				} 
			}
			Debug.show(new StringBuilder("Ich habe ").append(args.length).append(" Argument(e)!"));
			
		}
		else
		{
			Debug.showError("Keine Kommandozeilen-Argumente!\n");
		}
		
	}
	/**********************************************************************************/
	static void load() {}
}
