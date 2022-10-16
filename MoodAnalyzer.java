package moodanalyzer;

public class MoodAnalyzer {

	public String message;

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0) {
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,
						"Please enter VALID mood");
			}
			if (message.toLowerCase().contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,
					"Please Enter VALID Mood");
		}
	}

	public static void main(String[] args) throws MoodAnalysisException {
		MoodAnalyzer mood1 = new MoodAnalyzer("I'm in any mood ");
		System.out.println(mood1.analyseMood());
		MoodAnalyzer mood2 = new MoodAnalyzer("I am in Sad Mood");
		System.out.println(mood2.analyseMood());
		MoodAnalyzer mood3 = new MoodAnalyzer("I am in Happy Mood");
		System.out.println(mood3.analyseMood());
	}
}
