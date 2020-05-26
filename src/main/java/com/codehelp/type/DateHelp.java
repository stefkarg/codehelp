package com.codehelp.type;

import java.time.LocalDate;
import java.time.Period;
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
	
	/**
	 * Get months from a given date until now
	 * @param date
	 * @return
	 */
	public static long getMonthsSince(Date date) {
		LocalDate inputDate = new java.sql.Date(date.getTime()).toLocalDate();
		LocalDate nowDate = LocalDate.now();
		Period period = Period.between(inputDate, nowDate);
	    long months = period.toTotalMonths();
	    return months;
	}
}
