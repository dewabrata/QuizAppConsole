package com.adl.newsapp.controller;

import java.util.ArrayList;
import java.util.List;

import com.adl.newsapp.model.ModelQuiz;
import com.adl.newsapp.view.ContentComponent;
import com.adl.newsapp.view.Form;
import com.adl.newsapp.view.MultipleChoiceComponent;
import com.adl.newsapp.view.TextInputComponent;

public class QuizController {
	
	List<Form> lstForm = new ArrayList<Form>();
	
	public QuizController(ModelQuiz model) {
		
		generateForm(model);
		
	}

	public void generateForm(ModelQuiz model){
		
		
		for (String modelData : model.getLstSoal()) {
			
			Form form = new Form();
			String[]soal = modelData.split(";");
			
			switch (soal[0]) {
			case "multiplechoice":
				  MultipleChoiceComponent choice = new MultipleChoiceComponent("", soal[1], soal[2].split("#"));
				  form.addComponent(choice); 
				  TextInputComponent txtComponent = new TextInputComponent("", "Jawaban >");
				  form.addComponent(txtComponent);
				  
				  
				break;
			case "essay" :
				 ContentComponent content = new ContentComponent("", soal[1]);
				 TextInputComponent txtComponent2 = new TextInputComponent("", "Jawaban >");
				 form.addComponent(content);
				 form.addComponent(txtComponent2);
				break;

			default:
				break;
			}
			
			this.lstForm.add(form);
			
		}
		
		
	}
	
	public void showForm() {
		for (Form form : lstForm) {
			form.showComponents();
		}
	}
	

}
