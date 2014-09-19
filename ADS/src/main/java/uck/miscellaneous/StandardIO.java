package uck.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIO {
	public int getInt(){
		int value=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
		value= Integer.parseInt(br.readLine().trim());	
		}
		catch(Exception e){
			print("Invalid input or selection");
		}
		return value;
	}
	public String getString(){
		String input=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
		input=(br.readLine().trim());
		}
		catch(Exception e){		
				print("Invalid Input");
		}
		return input;	
	}
	public void printInt(int value){
		System.out.println(value);
	}
	public void print(String message){
		System.out.println(message);
	}
}
