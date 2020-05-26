package com.codehelp.type;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringHelp {
	public static String generateSlug(String name) {
		if (name == null) {
			return null;
		}
		String slug;
		slug = name.toLowerCase();
		slug = slug.replaceAll("[\\W]|_", " "); // remove all non-alphanumeric
		slug = slug.trim().replaceAll(" +", " "); // remove all double spaces
		slug = slug.replaceAll("\\s","-"); // replace spaces with dashes (-)
		return slug;
	}
	
	/**
	 * Transform string to camel case. Words in input string can be separated using a specific separator.
	 * For example "grumpy_cat" using "_" as separator, will return "GrumpyCat"
	 * @param input
	 * @param separator
	 * @return
	 */
	public static String toCamelCase(String input, String separator) {
		String camelCase = "";
		List<String> words = Stream.of(input.split(separator)).collect(Collectors.toList());
		for (String word : words) {
			word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
			camelCase += word;
		}
		return camelCase;
	}
}
