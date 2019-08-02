package com.rest.come.assureNG;

import java.util.Arrays;

public class Forecast {
	
	@Override
	public String toString() {
		return "Forecast [timeList=" + Arrays.toString(timeList) + "]";
	}

	private Time[] timeList;

	public Time[] getTimeList() {
		return timeList;
	}

	public void setTimeList(Time[] timeList) {
		this.timeList = timeList;
	}

}
