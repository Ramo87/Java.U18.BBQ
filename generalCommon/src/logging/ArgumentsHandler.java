package logging;

public abstract class ArgumentsHandler 
{
	/**********************************************************************************/
	public static void main(String []args){

	}
	/**********************************************************************************/

	public static String[] getPropertiesFromAppCallBySystem()
	{
		String appCall =  System.getProperty("sun.java.command");
		String[] args = new String[] {};
		
		if(appCall != null) 
		{
			if(appCall.contains(" "))
			{
				String arguments = appCall.substring(appCall.indexOf(" ") + 1);
				
				if(appCall.contains(" "))
				{
					args = arguments.split(" ");
					
					
				}
				else
				{
					args = new String[] {arguments};
				}
			}
		}
		 
		
			return args;
	}
		
		
		//System.out.println("-----> " + (appCall == null) + " :--" + arguments + " ------------'" + appCall.indexOf(" "));
		
}
	/**********************************************************************************/

