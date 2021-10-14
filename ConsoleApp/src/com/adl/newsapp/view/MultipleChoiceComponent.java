package com.adl.newsapp.view;

public class MultipleChoiceComponent extends Component {

	private String[] pilihan;
	
	
	 public MultipleChoiceComponent(String name, String pertanyaan,String[] pilihan) {
		 
		 super(name,pertanyaan);
		 this.pilihan=pilihan;
		// TODO Auto-generated constructor stub
	}
	 
	@Override
	public void show() {
		
		System.out.println(this.getLabel());
		for (String string : pilihan) {
			
			System.out.println(string);
			
		}
		
	}
}
