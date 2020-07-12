package edu.bbq.u18.chat.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.Properties;

import edu.bbq.u18.chat.common.lib.PropertiesHandler;




public abstract class SETTINGS 
{
	public static String APP_VERSION = "";
	/*************************************************************************************/
	static boolean SHOWDATATYPES = false;
	/*************************************************************************************/
	static void load(){}
	/*************************************************************************************/
}
