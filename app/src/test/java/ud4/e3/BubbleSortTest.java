package ud4.e3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;
public class BubbleSortTest {

	
	@Test
	public void allPositiveTest() {
		int[] baseArray = {3,2,1};
		int[] expectedArr = {1,2,3};
		BubbleSort.Sort(baseArray);
		assertTrue(Arrays.equals(baseArray, expectedArr));
	}
	
	
	@Test
	public void allNegativeTest() {
		int[] baseArray = {-2,-1,-3};
		int[] expectedArr = {-3,-2,-1};
		BubbleSort.Sort(baseArray);
		assertTrue(Arrays.equals(baseArray, expectedArr));
	}
	
	@Test
	public void positiveAndNegativTest() {
		int[] baseArray = {3,-11,2};
		int[] expectedArr = {-11,2,3};
		BubbleSort.Sort(baseArray);
		assertTrue(Arrays.equals(baseArray, expectedArr));
	}
	
	@Test
	public void repeatedNumbers() {
		int[] baseArray = {3,2,2};
		int[] expectedArr = {2,2,3};
		BubbleSort.Sort(baseArray);
		assertTrue(Arrays.equals(baseArray, expectedArr));
	}
}