package com.adl.newsapp.view;

public class FooterComponent extends Component{
	
	 public FooterComponent(String name, String label) {
		 super(name,label);
	 }
	 
	 @Override
	 public void show() {
		
		 String footer =  "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \n" +
						 "|                                  | \n"  +
						 "|                                  | \n"  +
						 "|     "+this.getLabel()+"          | \n" +
						 "|                                  | \n"  +
						 "|                                  | \n"  +
						 "|                                  | \n"  +
						 "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \n" ;

		 System.out.println(footer);
	 }

}
