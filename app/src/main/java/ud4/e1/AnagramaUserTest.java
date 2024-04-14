package ud4.e1;

public class AnagramaUserTest {

	public static void main(String[] args) {
		Anagrama ana = new Anagrama();
		ana.getInput();
		ana.printResult(ana.checkAnagram(ana.getStr1(), ana.getStr2()));
	}
}
