package com.letus179.company.model.controller.enums;

/**
 * 日期时间枚举类
 *
 * @author xfyin
 * @date 2019-07-16
 */
public enum DateTimeEnum {

	DATE_PATTERN0(0, "yyyyMMdd"),
	DATE_PATTERN(1, "yyyy-MM-dd"),
	TIME_PATTERN(2, "HH:mm:ss"),
	DATE_TIME_PATTERN(3, "yyyy-MM-dd HH:mm:ss");

	private int type;
	private String desc;

	DateTimeEnum(int type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	public static String ofDesc (int type) {
		for (DateTimeEnum enumDateTime : DateTimeEnum.values()) {
			if (enumDateTime.getType() == type) {
				return enumDateTime.getDesc();
			}
		}
		return null;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
