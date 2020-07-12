package edu.bbq.u18.chat.common.knowledge;

import java.util.HashSet;

import edu.bbq.u18.chat.common.helpers.Debug;
import edu.bbq.u18.chat.common.lib.Numbers;

public abstract class DataTypes 
{
/*********************************************************************************************************/
private static String getNumericDecimalDataTypeAsString(String str)
{
	Debug.show(new StringBuilder("Prüfe float-Wertbereich: ").append(Float.MIN_VALUE).append( " bis ").append( Float.MAX_VALUE));
	
	if(!Float.isInfinite(Float.parseFloat(str)))
	{
		return "float";
	}
	else
	{
		Debug.show(new StringBuilder("Prüfe double-Wertbereich: ").append(Double.MIN_VALUE).append(" bis ").append(Double.MAX_VALUE));
		
		try
		{
			Double.parseDouble(str);
			
			return "double";
		}
		catch(NumberFormatException ex)
		{
			return "Datatype unknown!";
		}
	}
}
/*********************************************************************************************************/
private static String getNumericIntegerDataTypeAsString(String str)
{
	try 
	{
		Debug.show(new StringBuilder("Prüfe byte-Wertbereich: ").append( Byte.MIN_VALUE).append(" bis ").append(Byte.MAX_VALUE));
		Byte.parseByte(str);
		
		return "byte";
	}
	catch (NumberFormatException ex1)
	{
		try 
		{
			Debug.show(new StringBuilder("Prüfe short-Wertbereich: ").append(Short.MIN_VALUE).append(" bis ").append(Short.MAX_VALUE));
			Short.parseShort(str);
			
			return "short";
		}
		catch(NumberFormatException ex2)
		{
			try
			{
				Debug.show(new StringBuilder("Prüfe int-Wertbereicht: ").append(Integer.MIN_VALUE).append(" bis ").append(Integer.MAX_VALUE));
				Integer.parseInt(str);
				
				return "int";
			}
			catch(NumberFormatException ex3)
			{
				try
				{
					Debug.show(new StringBuilder("Prüfe long-Wertbereich: ").append(Long.MIN_VALUE).append(" bis ").append(Long.MAX_VALUE));
					Long.parseLong(str);
					
					return "long";
				}
				catch(NumberFormatException ex4)
				{
					return "Datatype unknown!";
				}
			}
		}
	}
}
/*********************************************************************************************************/
private static String getNumericDataTypeAsString(String str) 
{
	return ((!str.contains(".")) ? getNumericIntegerDataTypeAsString(str) : getNumericDecimalDataTypeAsString(str));
}
/*********************************************************************************************************/
public static String getDataTypeAsString(String str)
{
	if(Numbers.isNumeric(str))
	{
		Debug.show(new StringBuilder("Das Argument\"").append(str).append("\" ist eine Zahl!"));
		
		return getNumericDataTypeAsString(str);
	}
	else 
	{
		Debug.show(new StringBuilder("Das Argument \"").append(str).append("\" ist keine Zahl (String, char o.boolean)"));
		
		switch(str.length())
		{
			case 1:
				return "char";
			case 4:
				if(str.equalsIgnoreCase("true")) 
				{
					return "boolean";
				}
				else 
				{
					return "String";
				}
			case 5:
				if(str.equalsIgnoreCase("false")) 
				{
					return "boolean";
				}
				else 
				{
					return "String";
				}
			default:
				return "String";
		}
	}
}

/*********************************************************************************************************/
	public static boolean isPrimitiveDataType(String str)
	{
		return PRIMITIVE_DATA_TYPES_AS_STRING.contains(str);
	}
/*********************************************************************************************************/
	private static HashSet<String> PRIMITIVE_DATA_TYPES_AS_STRING = new HashSet<String>(){{add("byte"); add("short"); add("int"); add("long"); add("float"); add("double"); add("boolean"); add("char");}};
/*********************************************************************************************************/
}
