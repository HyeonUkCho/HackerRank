import java.util.Scanner;

public class Anagrams {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        System.out.println( res );

        scanner.close();

	}
	
	private static int makeAnagram(String a, String b) {
		
		int result = 0;
		
		int[] letterCompare = new int[26];
		
		for(char c : a.toCharArray()) {
			letterCompare[c - 'a']++;
		}
		
		for(char c : b.toCharArray()) {
			letterCompare[c - 'a']--;
		}
		
		for(int i : letterCompare) {
			result = result + Math.abs(i);
		}
		
		return result;
		
	}

}
