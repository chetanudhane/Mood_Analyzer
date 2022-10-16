package moodanalyzer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyzer moodanalyser = new MoodAnalyzer("I'm in Any mood");
		Assert.assertEquals("HAPPY", moodanalyser.analyseMood());
	}

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I'm in a Sad mood");
		Assert.assertEquals("SAD", moodAnalyser.analyseMood());
	}

	@Test
	public void givenMessage_WhenNull_ReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
		Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
	}
}
