package com.adl.newsapp.view;

public class ContentComponent extends Component{
	
	   public ContentComponent(String name, String label) {
		   super(name,label);
	   }
	   
	   @Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.getLabel());
	}

}
