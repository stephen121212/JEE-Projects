package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	//Create an array of string
	private String[] data = {
		"Diligence",
		"Beware",
		"Journey"
	};
	
	//Create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//Pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}
}
