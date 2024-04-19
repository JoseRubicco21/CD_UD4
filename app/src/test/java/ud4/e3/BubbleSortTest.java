package ud4.e3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;
public class BubbleSortTest {

	
	@Test
	@ValueSource(ints = {3,1,2})
	public void allPositiveTest(int[] arr) {
		int[] expectedArr = {1,2,3};
		BubbleSort.Sort(arr);
		assertEquals(arr, expectedArr);
	}
	
	@Test
	@ValueSource(ints = {-3,-1,-2})
	public void allNegativePositiveTest(int[] arr) {
		int[] expectedArr = {-3,-2,-1};
		BubbleSort.Sort(arr);
		assertEquals(arr, expectedArr);
	}
	
	@Test
	@ValueSource(ints = {3,-11,2})
	public void positiveAndNegativTest(int[] arr) {
		int[] expectedArr = {-11,2,3};
		BubbleSort.Sort(arr);
		assertEquals(arr, expectedArr);
	}
	
	@Test
	@ValueSource(ints = {2,3,2})
	public void repeatedNumbers(int[] arr) {
		int[] expectedArr = {2,2,3};
		BubbleSort.Sort(arr);
		assertEquals(arr, expectedArr);
	}
}