import javax.swing.JOptionPane;
public class TrueFalseQuestion extends Question {

	@Override
	String ask() {
		correctAnswer.toUpperCase();
		String res = JOptionPane.showInputDialog(question);
		res = res.toUpperCase();
		if(res.equals("Y")||res.equals("T")||res.equals("YES")||res.equals("TRUE")) {
			res = "TRUE";
		}
		if(res.equals("F")||res.equals("N")||res.equals("NO")||res.equals("FALSE")) {
			res = "FALSE";
		}
	if(!checkIfValid(res)) {
		JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE");
		ask();
	}else if (res.equals(correctAnswer)) {
		return correctAnswer;
		}

	return question;
	
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
		this.question = "TRUE or FALSE: " + question;
		super.correctAnswer = answer;
	}
}
