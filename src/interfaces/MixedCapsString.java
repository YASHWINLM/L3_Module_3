package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		
		char[] charArray=( s.toLowerCase()).toCharArray();
		
		String x="";
		for (int i = 0; i < charArray.length; i++) {
			if(i%2==0) {
				System.out.println("Even");
				x+=charArray[i];
				
			}
			
			else {
				System.out.println("odd");
				x+=(charArray[i]+"").toUpperCase();
			}
		}
		return x;
	}

}
