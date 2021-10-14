package com.adl.newsapp;

import java.util.ArrayList;
import java.util.List;

import com.adl.newsapp.controller.QuizController;
import com.adl.newsapp.interfaces.ActionListener;
import com.adl.newsapp.model.ModelQuiz;
import com.adl.newsapp.view.Component;
import com.adl.newsapp.view.ContentComponent;
import com.adl.newsapp.view.FooterComponent;
import com.adl.newsapp.view.Form;
import com.adl.newsapp.view.HeaderComponent;
import com.adl.newsapp.view.TextInputComponent;

public class NewsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    List<String> soal = new ArrayList<String>();
	    
	    
	    soal.add("multiplechoice;siapakah nama trainner JC;A.Hanif#B.Agung#C.Abdillah#D.Anggito;A.Hanif;20");
	    soal.add("essay;10+10 = ?;20;20");
	    soal.add("essay;5+5 = ?;10;20");
		
	    
	    ModelQuiz model = new ModelQuiz();
	    model.setLstSoal(soal);
	    
	    QuizController quiz = new QuizController(model);
	    quiz.showForm();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	Form form = new Form();
		
		String [] lstSoal = new String[100];
		
		lstSoal[0] = "hello1";
		lstSoal[1] = "hello2";
		lstSoal[2] = null;
		lstSoal[3] ="hello4";
		
		
		for (String string : lstSoal) {
			System.out.println(string);
		}
		
		
		List<String> lstSoal2 = new ArrayList<String>();
		lstSoal2.add("hello1");
		lstSoal2.add("hello2");
		lstSoal2.add("hello3");
		lstSoal2.add("hello4");
		lstSoal2.add("hello");
		lstSoal2.add("hello");
		lstSoal2.add("hello");
		
		for (String string : lstSoal2) {
			System.out.println(string);
		}
		lstSoal2.remove(1);
		
		for (String string : lstSoal2) {
			System.out.println(string);
		}
		
		
		
		ContentComponent component1 = new ContentComponent("txtNama", "Nama saya dewabrata");
		ContentComponent component2 = new ContentComponent("txtNama2", "Hallo saya adalah component kedua");
		HeaderComponent headerComponent1 = new HeaderComponent("txtNama3", "Ini adalah header");
		FooterComponent footer = new FooterComponent("footer1", "Halo ini footer lho");
		TextInputComponent txtInput = new TextInputComponent("txtInput", "Masukan pilihan anda?>");
		
		
		
		form.addComponent(headerComponent1);
		form.addComponent(component1);
		form.addComponent(component2);
		form.addComponent(footer);
		form.addComponent(txtInput);
		form.showComponents();
		
		ActionListener action = new ActionListener() {
			
			@Override
			public void onAction(List<Component> lstComponent) {
				// TODO Auto-generated method stub
				
				for (Component  component: lstComponent) {
					component.setLabel(txtInput.getValue());
					
				}
			
			}

		
		};
		
		
		txtInput.addActionListener(footer);
		txtInput.addActionListener(headerComponent1);
		txtInput.onAction(action);
		
		
		form.showComponents();
*/
	}
	

}
