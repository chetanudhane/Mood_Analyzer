package moodanalyzer;

public class MoodAnalyzer {

	public String message;

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.toLowerCase().contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}

	public static void main(String[] args) {
		MoodAnalyzer mood1 = new MoodAnalyzer("I'm in any mood ");
		System.out.println(mood1.analyseMood());
		MoodAnalyzer mood2 = new MoodAnalyzer("I am in Sad Mood");
		System.out.println(mood2.analyseMood());
		MoodAnalyzer mood3 = new MoodAnalyzer("I am in Happy Mood");
		System.out.println(mood3.analyseMood());
	}
}
