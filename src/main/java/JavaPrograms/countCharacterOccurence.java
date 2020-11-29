package JavaPrograms;

public class countCharacterOccurence {

	public static void main(String[] args) {

		String s = "Hai how are you, i am fine";
		
		int totalCount = s.length();
		int countAfterRemove = s.replace("e", "").length();
		
		int count =  totalCount - countAfterRemove;
		
		System.out.println(count);
	}

}
