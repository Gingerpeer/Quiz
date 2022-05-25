//import javax.swing.JButton;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
import java.awt.*; 
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {
	
	public boolean checkIfValid(String str) {
		String[] validArray = {"A","B","C","D","E"};
		for(int i = 0;i<5;i++) {
			if(str.equals(validArray[i])) {
				return true;
			}
		}
		return false;
	}

	void addChoice(String name, String label) { 
		JPanel choice = new JPanel(new BorderLayout()); 
		JButton button = new JButton(name);
		button.addActionListener(question); 
		choice.add(button,BorderLayout.WEST); 
		choice.add(new JLabel(label+" ",JLabel.LEFT),BorderLayout.CENTER); 
		question.add(choice); 
	}
	
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer){
		
		super(query); 
		addChoice("A",a);
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);
		initQuestionDialog(); 
		super.correctAnswer = answer.toUpperCase();;
	}

}
