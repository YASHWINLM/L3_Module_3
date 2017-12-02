import java.util.Stack;

import interfaces.SpecialString;
import interfaces.TextFunkifier;

public class BackwardsString extends SpecialString implements TextFunkifier {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		Stack<Character> Words= new Stack<Character>();
		char[] Char = s.toCharArray();
		
		for (int i = 0; i < Char.length; i++) {
			Words.push(Char[i]);
		}
		String done="";
		for (int i = 0; i < Words.size(); i++) {
			done+=Words.pop();
		}

		return done;
	}

}
