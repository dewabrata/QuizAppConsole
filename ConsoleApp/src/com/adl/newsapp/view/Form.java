package com.adl.newsapp.view;

import java.util.ArrayList;
import java.util.List;

import com.adl.newsapp.interfaces.ActionListener;

public class Form {

	public Form() {

	}

	public Form(Component component) {
		addComponent(component);

	}

	private List<Component> lstComponent = new ArrayList<Component>();

	public void addComponent(Component component) {
		lstComponent.add(component);
	}

	public void showComponents() {

		for (int i = 0; i < lstComponent.size(); i++) {

			lstComponent.get(i).show();

		}

	}

	public void showComponentByName(String name) {
		for (int i = 0; i < lstComponent.size(); i++) {
			if (lstComponent.get(i).getName().equals(name))
				lstComponent.get(i).show();

		}

	}

	public List<Component> getLstComponent() {
		return lstComponent;
	}

	public void setLstComponent(List<Component> lstComponent) {
		this.lstComponent = lstComponent;
	}

	
}
