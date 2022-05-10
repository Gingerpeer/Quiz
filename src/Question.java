import javax.swing.JOptionPane;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	String question;
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
	
	abstract String ask();
}
