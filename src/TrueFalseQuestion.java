//import javax.swing.JOptionPane;
//import java.awt.*; 
import javax.swing.*; 
public class TrueFalseQuestion extends Question {

//	@Override
//	String ask() {
////		correctAnswer.toUpperCase();
////		String res = JOptionPane.showInputDialog(question);
////		res = res.toUpperCase();
////		if(res.equals("Y")||res.equals("T")||res.equals("YES")||res.equals("TRUE")) {
////			res = "TRUE";
////		}
////		if(res.equals("F")||res.equals("N")||res.equals("NO")||res.equals("FALSE")) {
////			res = "FALSE";
////		}
////	if(!checkIfValid(res)) {
////		JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE");
////		ask();
////	}else if (res.equals(correctAnswer)) {
////		return correctAnswer;
////		}
////
////	return question;
////	
//		question.setVisible(true);
//		return question.answer;
//	}
	void addButton(JPanel buttons,String label) {
		JButton button = new JButton(label);
		button.addActionListener(question); 
		buttons.add(button);
	}
	public boolean checkIfValid(String str) {
		String[] validArray = {"FALSE","TRUE"};
		for(int i = 0;i<2;i++) {
			if(str.equals(validArray[i])) {
				return true;
			}
		}
		return false;
	}
	TrueFalseQuestion(String question, String answer){
//		this.question = new QuestionDialog(); 
//		this.question.setLayout(new GridLayout(0,1));
//		this.question.add(new JLabel("    " + question + "       ",JLabel.CENTER));
		super(question); 
		JPanel buttons = new JPanel(); 
		addButton(buttons,"TRUE"); 
		addButton(buttons,"FALSE"); 
		this.question.add(buttons);
//		this.question.setModal(true); 
//		this.question.pack();
//		this.question.setLocationRelativeTo(null);
		initQuestionDialog(); 
		super.correctAnswer = answer;
	}
}
