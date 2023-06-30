package com.imageinfo.eclear.configuration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) 
	{
		String pipeSeparatedList="CLG|FINONEPDC|FINACLEPDC|CORPPDC";
		String regex4 = "(\\b"+(pipeSeparatedList.replace("|", "\\b|\\b"))+"\\b)";
		
		System.out.println("regex4 : "+regex4);
		
		Pattern p = Pattern.compile(regex4);
		
		Matcher m = p.matcher("CLG");
		System.out.println(m.find());
		
		boolean a = Pattern.matches(regex4, "CLG");
		
		System.out.println("a : "+a);
                System.out.println("hello");

	}

}
