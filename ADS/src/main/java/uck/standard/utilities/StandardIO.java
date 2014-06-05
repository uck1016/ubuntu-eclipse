package uck.standard.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIO {
	public int getInput(){
		int value=0;
		System.out.println("Please enter the value\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			 value=Integer.parseInt(br.readLine());
		} catch (IOException e) {
			print("Please enter a valid integer");
			getInput();
		}
		return value;
	}
	public String getChoice(){
		System.out.println("Please enter your choice\n");
		String choice=null;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			 try {
				choice= br.readLine().trim();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return choice;
	}
	public void print(String message){
		if(message!=null){
			System.out.println(message);
		}
	}
	public void printInt(int value){
		System.out.println(value);
	}
}