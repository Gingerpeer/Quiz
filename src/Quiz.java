

public class Quiz {
	
	
	

	public static void main(String[] args) {
		MultipleChoiceQuestion question = new MultipleChoiceQuestion("What is my favorite OS?", "Macintosh","Windows","Linux","Android","IOS","b");
		question.check();
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("What is my favorite Programming Language?","Ruby","PHP","Java","Python","C#","D");
		question2.check();
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("What is my favorite Web Development Library?","Asp.net","Angular","Vue","Django","React","e");
		question3.check();
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("What is my IDE of choice?","Visual Studio","Eclipse","Atom","Notepad++","X-code","A");
		question4.check();
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion("What is my Cloud Storage Provider of choice?","Google Drive","Microsoft Onedrive","Dropbox","iCloud","pCloud","A");
		question5.check();
		MultipleChoiceQuestion question6 = new MultipleChoiceQuestion("How good is Git?","1/5","2/5","3/5","4/5","5/5","E");
		question6.check();
	}

}