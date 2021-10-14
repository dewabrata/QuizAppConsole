package com.adl.newsapp.view;

import java.util.Scanner;

import com.adl.newsapp.interfaces.ActionListener;

public class TextInputComponent extends Component{
	private String value ="";
	private Scanner scan = new Scanner(System.in);
	
	public TextInputComponent(String name , String label) {
		
		super(name,label);
		
		
		
	}
	
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		this.value = scan.nextLine();
		
		
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}
	
	

}
