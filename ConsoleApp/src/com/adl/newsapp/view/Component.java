package com.adl.newsapp.view;

import java.util.ArrayList;
import java.util.List;

import com.adl.newsapp.interfaces.ActionListener;

public class Component {
	
	private String name ;
	private String label ;
	
	

	
	public Component() {
		
	}
	
	
	public Component(String name, String label) {
		this.name = name;
		this.label = label;
		
	}
	
	public void show() {
		
		System.out.println(label);
		
		
	}
	
	private List<Component> componentListener = new ArrayList<Component>();
	

	public void addActionListener(Component component) {

		 this.componentListener.add(component);
		
		
		
	}
	
	public void onAction(ActionListener action) {
		
		
		
		
		action.onAction(this.componentListener);
		
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


		
	
	
	


	

	



	
	
	
	
	
	

}
