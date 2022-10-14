package com.greatlearning.springDemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCaoch implements SportsCaoch{
	
	@Override
	public String getTrainingSchedule() {
		return "Do-Practice at 6 am";
	}

}


