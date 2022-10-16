package moodanalyzer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyzer moodanalyser = new MoodAnalyzer("I'm in Any mood");
		try {
			Assert.assertEquals("HAPPY", moodanalyser.analyseMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I'm in a Sad mood");
		try {
			Assert.assertEquals("SAD", moodAnalyser.analyseMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessage_WhenNull_ReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void givenMessage_WhenEmpty_ThrowException() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("");

		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
