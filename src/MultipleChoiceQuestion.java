import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	String question;
	String correctAnswer;
	
	public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question = query + "\n";
		question += "A. " + a + "\n";
		question += "B. " + b + "\n";
		question += "C. " + c + "\n";
		question += "D. " + d + "\n";
		question += "E. " + e + "\n";
		
		correctAnswer = answer.toUpperCase();
	}
	public String ask() {
		correctAnswer.toUpperCase();
			String res = JOptionPane.showInputDialog(question);
			res = res.toUpperCase();
		if(!checkIfValid(res)) {
			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D or E");
			ask();
		}else if (res.equals(correctAnswer)) {
			return correctAnswer;
			}
	
		return question;
		
	}
	public boolean checkIfValid(String str) {
		String[] validArray = {"A","B","C","D","E"};
		for(int i = 0;i<5;i++) {
			if(str.equals(validArray[i])) {
				return true;
			}
		}
		return false;
	}
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
	

}