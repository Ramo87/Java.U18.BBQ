/**
 * 
 */
package edu.bbq.u18.chat.client;
import edu.bbq.u18.chat.common.helpers.ConsolePrint;
import edu.bbq.u18.chat.common.lib.PropertiesHandler;

// "C:\Program Files\Java\jdk1.8.0_101\bin\java"
// "-javaagent:E:\Java Stuff\IntelliJ IDEA 2017.1.5\lib\idea_rt.jar=58013:E:\Java Stuff\IntelliJ IDEA 2017.1.5\bin" -Dfile.encoding=UTF-8 -classpath
// "C:\Program Files\Java\jdk1.8.0_101\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\deploy.jar;
// C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\localedata.jar;
// C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\nashorn.jar;
// C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\sunec.jar;
// C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\sunjce_provider.jar;
// C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\sunmscapi.jar;
// C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\zipfs.jar;
// C:\Program Files\Java\jdk1.8.0_101\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\jce.jar;
// C:\Program Files\Java\jdk1.8.0_101\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\jfxswt.jar;
// C:\Program Files\Java\jdk1.8.0_101\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\management-agent.jar;
// C:\Program Files\Java\jdk1.8.0_101\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\rt.jar;E:\Java.U18.BBQ\out\production\MultiChatServer;E:\Java.U18.BBQ\out\production\GeneralCommon;E:\Java.U18.BBQ\out\production\Java.U18.BBQ;E:\Java.U18.BBQ\out\production\JavaKnowlege" chatServer.Start


//
public class Start 
{
	/**********************************************************************************/
	/**
	 * @param args
	 */
	//public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/* Für lange Zeit Kommentar! */

		getfullQualifiedCallApplicationShellcomand();

		SETTINGS.load();
		Configurations.load();
		Arguments.load();
		
		ConsolePrint.showln(new StringBuilder("Multi Chat Client gestartet! Version: ").append(SETTINGS.APP_VERSION).append("\n"));
		//handleArguments(args);
		//PropertiesHandler.showProperties(System.getProperties(), PropertiesHandler.SHOW_WHILE_WIDTH_ITERATOR_STYLE);
		
		//SystemInfos.showProperties();

	}
	/**********************************************************************************/

	static void getfullQualifiedCallApplicationShellcomand(){

		StringBuilder command = new StringBuilder(  );
		command.append( "java - cp " );
		command.append(System.getProperty( "java.class.path" )).append( "  " );
		command.append( "edu.bbq.u18.chat.serrver. start" ).append("\n");
		ConsolePrint.showln(command);
		System.exit( 0 );

	}
}
