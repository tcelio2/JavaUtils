package org.parameters.utils;


public class Display {

	
	
	
	public static void showStrings(String... str){
		
		for(String ccc : str){
			System.out.println("Valor :"+ccc);
		}
	}
	
	public static void showIntegers(int...numbers){
		for(int num: numbers){
			System.out.println("Numero: "
					+ num);
		}
		
	}

	
	
}
