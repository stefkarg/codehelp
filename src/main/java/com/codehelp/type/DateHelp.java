package com.codehelp.type;

import java.util.Date;

public class DateHelp {

	/**
	 * Get date from seconds (since 01-01-1970)
	 * @param seconds
	 * @return
	 */
	public static Date getDateFromSeconds(long seconds) {
		return new Date(seconds * 1000);
	}
	
	/**
	 * Get seconds (since 01-01-1970) from date
	 * @param date
	 * @return
	 */
	public static long getSecondsFromDate(Date date) {
		return date.getTime() / 1000;
	}
	
}
