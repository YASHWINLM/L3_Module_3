package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		char[] charArray= s.toCharArray();
		String x="";
		for (int i = charArray.length-1; i >=0; i--) {
			x+=charArray[i];
		}
		return x;
	}

}
