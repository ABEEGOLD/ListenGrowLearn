public class TwentyOne{
	public static void main(String[] args){
		String bigVowels = "there we are doing";
		int count = 0;
		bigVowels = bigVowels.toLowerCase();
	
	for(int i = 1; i < bigVowels.length() ;i ++){
			char ch = bigVowels.charAt(i);
			if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				count++;
			}
		System.out.println("The vowel count: "+count);
		
	}
	

				
	



	}



}