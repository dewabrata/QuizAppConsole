package com.adl.newsapp.controller;

import java.util.ArrayList;
import java.util.List;

import com.adl.newsapp.model.ModelQuiz;
import com.adl.newsapp.view.Component;
import com.adl.newsapp.view.ContentComponent;
import com.adl.newsapp.view.Form;
import com.adl.newsapp.view.HeaderComponent;
import com.adl.newsapp.view.MultipleChoiceComponent;
import com.adl.newsapp.view.TextInputComponent;

public class QuizController {
	
	ModelQuiz model;
	List<Form> lstForm = new ArrayList<Form>();
	
	private int benar=0;
	private int salah=0;
	
	
	public QuizController(ModelQuiz model) {
		this.model = model;
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
				  TextInputComponent txtComponent = new TextInputComponent("inputan", "Jawaban >");
				  form.addComponent(txtComponent);
				  
				  
				break;
			case "essay" :
				 ContentComponent content = new ContentComponent("", soal[1]);
				 TextInputComponent txtComponent2 = new TextInputComponent("inputan", "Jawaban >");
				 form.addComponent(content);
				 form.addComponent(txtComponent2);
				break;

			default:
				break;
			}
			
			this.lstForm.add(form);
			
		}
		
		
		
	}
	
	
	public void generateNilai() {
		int nilai = 0;
		
		for (int i = 0; i < this.lstForm.size(); i++) {
			
		
				for (Component component : this.lstForm.get(i).getLstComponent()) {
						if(component.getName().equalsIgnoreCase("inputan")) {
							if (component instanceof TextInputComponent) {
								  String jawaban = ((TextInputComponent)component).getValue();
								  
								  String[] soal =this.model.getLstSoal().get(i).split(";"); 
								  String kunciJawaban = "";
								  int score =0;
								  switch (soal[0]) {
								case "multiplechoice":
									  kunciJawaban = soal[3];
									  score = Integer.parseInt(soal[4]);
									break;
								case "essay" :
									kunciJawaban = soal[2];
									score = Integer.parseInt(soal[3]);
									break;
								default:
									break;
								}
								  nilai += hitungNilai(jawaban,kunciJawaban , score);
								
							}
						}
				}
		}
		
		Form formNilai = new Form();
		
		HeaderComponent header = new HeaderComponent("", "Nilai Anda: ");
		
		formNilai.addComponent(header);
		
		String resultNilai = " Score :" + nilai +" benar anda : " + this.benar + " salah anda :" +this.salah;
		ContentComponent content = new ContentComponent("", resultNilai);
		formNilai.addComponent(content);
		
		formNilai.showComponents();
		
	}
	
	
	public int hitungNilai(String jawaban, String kunciJawaban,int score) {
		int nilai =0;
		if(jawaban.equalsIgnoreCase(kunciJawaban)) {
			nilai +=score;
			this.benar++;
		}else {
			this.salah++;
		}
		
		
		return nilai;
	}
	
	public void showForm() {
		for (Form form : lstForm) {
			form.showComponents();
		}
	}
	

}
