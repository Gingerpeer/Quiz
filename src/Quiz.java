

public class Quiz {
	
	
	

	public static void main(String[] args) {
		Question question = new MultipleChoiceQuestion("What is my favorite OS?", "Macintosh","Windows","Linux","Android","IOS","b");
		question.check();
		Question question2 = new MultipleChoiceQuestion("What is my favorite Programming Language?","Ruby","PHP","Java","Python","C#","D");
		question2.check();
		Question question3 = new MultipleChoiceQuestion("What is my favorite Web Development Library?","Asp.net","Angular","Vue","Django","React","e");
		question3.check();
		Question question4 = new MultipleChoiceQuestion("What is my IDE of choice?","Visual Studio","Eclipse","Atom","Notepad++","X-code","A");
		question4.check();
		Question question5 = new MultipleChoiceQuestion("What is my Cloud Storage Provider of choice?","Google Drive","Microsoft Onedrive","Dropbox","iCloud","pCloud","A");
		question5.check();
		Question question6 = new MultipleChoiceQuestion("How good is Git?","1/5","2/5","3/5","4/5","5/5","E");
		question6.check();
		Question question7 = new TrueFalseQuestion("Has Donald Trump ever been the President of the United States?", "TRUE");
		question7.check();
		Question question8 = new TrueFalseQuestion("Did Elon Musk buy Amazon?", "FALSE");
		question8.check();
		Question question9 = new TrueFalseQuestion("Is Tim Cook the CEO of Apple?", "TRUE");
		question9.check();
		Question question10 = new TrueFalseQuestion("Is Jeff Bezos the Founder of Amazon?", "TRUE");  
		question10.check();       
		Question question11 = new TrueFalseQuestion("Was Elon Musk the first man on the moon?", "FALSE");  
	    question11.check();                                                                    
	}
	

}
