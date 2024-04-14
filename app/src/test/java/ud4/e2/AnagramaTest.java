package ud4.e2;
import ud4.e1.Anagrama;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class AnagramaTest {

	
	@ParameterizedTest
	@CsvSource ({
		"abc123,abc123",
		"ffff,ffff",
		"mm,nn",
		"LL,FFFFF"
	})
	void checkAnagram(String str1, String str2) {
		Anagrama ana = new Anagrama(str1, str2);
		assertTrue(ana.checkAnagram(ana.getStr1(), ana.getStr2()));
	}
}
