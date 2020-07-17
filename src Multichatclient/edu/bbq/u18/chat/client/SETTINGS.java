package edu.bbq.u18.chat.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.Properties;

import edu.bbq.u18.chat.common.lib.PropertiesHandler;

public class SETTINGS
{
	public static String APP_VERSION = "";
	public final static String Server_Host= "127.0.0.1";
	public final static int Server_Port =6000;
	//public static boolean SHOWDATATYPES;

	/*************************************************************************************/
	private SETTINGS() {
	}
	//static boolean SHOWDATATYPES = false;
	/*************************************************************************************/
	static void load(){

	}
	/*************************************************************************************/
}
