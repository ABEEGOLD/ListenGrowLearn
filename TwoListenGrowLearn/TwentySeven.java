public class TwentySeven{
	public static void main(String[] args){
				
		String str = "hello";
		String reversed = "";
			
			for(int index = str.length()-1;index >= 0;index--){
				reversed += str.charAt(index);
			}		

			System.out.println("The word reverse: "+reversed);
		
		
	}
}