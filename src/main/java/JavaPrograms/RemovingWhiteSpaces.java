package JavaPrograms;

public class RemovingWhiteSpaces {

	public static void main(String[] args) {

		String s = "Java programming Selenium        programs";
		
		System.out.println(" String before  removing white spaces: " +s);

		
		String i = s.replaceAll("\\s", "");
		
		System.out.println(" String after removing white spaces: " +i);
	}

}
