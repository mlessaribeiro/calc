package br.com.calc;

public class ConverteBinario {

	public int convertBinary(int number) {
		if(number <1)
			return 0;
		
		int leftover;
		String binary = "";
		while(number > 0) {
			leftover = number % 2;
			binary += leftover;
			number = number / 2;
		}		
		return Integer.parseInt(stringReverse(binary));
	}
	
	private String stringReverse(String text) {
		String inverted = "";
		for (int i = text.length() -1; i >= 0; i--)
			inverted += text.charAt(i);
			
		return inverted;
	}
}
