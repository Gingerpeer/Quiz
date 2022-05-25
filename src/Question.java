import java.awt.GridLayout;

import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import java.awt.*; 
import javax.swing.*;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	QuestionDialog question;
	String correctAnswer;
	
	public void check() {
		nQuestions = nQuestions + 1;
		String answer = ask();
		answer = answer.toUpperCase();
		
		if (answer.equals(correctAnswer)) {
			nCorrect = nCorrect + 1;
			showResults();
		}else {
			showResults();
		}
		
		}
	
	public static void showResults() {
		JOptionPane.showMessageDialog(null,nCorrect + " Correct out of " + nQuestions + " questions.");
	}
	
	String ask() {
		question.setVisible(true);
		return question.answer;
	}
	
	void initQuestionDialog() {
		this.question.setModal(true); 
		this.question.pack(); 
		this.question.setLocationRelativeTo(null); 
	}
	
	Question(String question) { 
		this.question = new QuestionDialog(); 
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel("    " + question + "       ",JLabel.CENTER));
	}
}
