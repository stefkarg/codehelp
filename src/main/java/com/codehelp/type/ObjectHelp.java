package com.codehelp.type;

public class ObjectHelp {
	public static boolean isEmpty(Object input) {
		boolean inputIsEmpty = false;
		inputIsEmpty |= input == null;
		inputIsEmpty |= "".equals(input);
		return inputIsEmpty;
	}
}
