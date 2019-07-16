package com.letus179.company.model.controller.util;


import com.letus179.company.model.controller.enums.DateTimeEnum;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

/**
 * 日期时间工具类
 *
 * @author xfyin
 * @date 2019-07-16
 */
public final class DateTimeUtils {

	/**
	 * 将Long类型的时间戳转换成String,格式为：yyyy-MM-dd HH:mm:ss
	 *
	 * @param time
	 * @return
	 */
	public static String longToStringTime(Long time) {
		Objects.requireNonNull(time);
		DateTimeFormatter df = DateTimeFormatter.ofPattern(DateTimeEnum.DATE_TIME_PATTERN.getDesc());
		return df.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault()));
	}

	/**
	 * 将字符串转日期成Long类型的时间戳，格式为：yyyy-MM-dd HH:mm:ss
	 *
	 * @param time
	 * @return
	 */
	public static Long stringToLongTime(String time) {
		Objects.requireNonNull(time);
		DateTimeFormatter ftf = DateTimeFormatter.ofPattern(DateTimeEnum.DATE_TIME_PATTERN.getDesc());
		LocalDateTime parse = LocalDateTime.parse(time, ftf);
		return LocalDateTime.from(parse).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
	}

	/**
	 * 将字符串类型的日期时间转换为LocalDateTime，格式为：yyyy-MM-dd HH:mm:ss
	 *
	 * @param dateTime 字符串日期时间
	 * @return LocalDateTime
	 */
	public static LocalDateTime strToLocalDateTime(String dateTime) {
		Objects.requireNonNull(dateTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateTimeEnum.DATE_TIME_PATTERN.getDesc());
		return LocalDateTime.parse(dateTime, formatter);
	}

	/**
	 * 将字符串类型的日期转换为LocalDate，格式为：yyyy-MM-dd
	 *
	 * @param date 字符串日期
	 * @return LocalDate
	 */
	public static LocalDate strToLocalDate(String date) {
		Objects.requireNonNull(date);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateTimeEnum.DATE_PATTERN.getDesc());
		return LocalDate.parse(date, formatter);
	}

	/**
	 * 日期转字符串，格式为：yyyy-MM-dd
	 *
	 * @param date 日期
	 * @return 字符串
	 */
	public static String localDateToStr(LocalDate date) {
		Objects.requireNonNull(date);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DateTimeEnum.DATE_PATTERN.getDesc());
		return date.format(dtf);
	}

	/**
	 * Date 转 String，格式为：yyyy-MM-dd HH:mm:ss
	 *
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date) {
		Objects.requireNonNull(date);
		SimpleDateFormat sdf = new SimpleDateFormat(DateTimeEnum.DATE_TIME_PATTERN.getDesc());
		return sdf.format(date);
	}
}
