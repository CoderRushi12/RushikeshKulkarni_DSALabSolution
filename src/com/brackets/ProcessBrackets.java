package com.brackets;

import java.util.Stack;

public class ProcessBrackets {

	public boolean isBracketBalanced(String inputstring) {

		Stack<Character> charStack = new Stack<>();

		for (int i = 0; i < inputstring.length(); i++) {

			char tempchar = inputstring.charAt(i);

			if (tempchar == '{' || tempchar == '[' || tempchar == '(') {
				charStack.push(tempchar);
				continue;
			}

			if (charStack.isEmpty())
				return false;

			char openingBracket;

			switch (tempchar) {
			case ')': {
				openingBracket = charStack.pop();
				if (openingBracket == '[' || openingBracket == '{')
					return false;
				break;
			}
			case ']': {
				openingBracket = charStack.pop();
				if (openingBracket == '(' || openingBracket == '{')
					return false;
				break;
			}
			case '}': {
				openingBracket = charStack.pop();
				if (openingBracket == '[' || openingBracket == '(')
					return false;
				break;
			}
			}

		}
		return (charStack.isEmpty());
	}
}
