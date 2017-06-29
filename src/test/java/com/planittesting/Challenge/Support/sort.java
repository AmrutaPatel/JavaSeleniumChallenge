package com.planittesting.Challenge.Support;

import java.util.Arrays;

public class sort {
	
	public Integer[] sortedNumber(String inputNumbers){
		Integer[] inputNos = null;	
		String [] separatedInputNos = inputNumbers.split(" ");
		inputNos = new Integer[separatedInputNos.length];
		for (int i = 0; i < separatedInputNos.length; i++) {
			inputNos[i]= Integer.parseInt(separatedInputNos[i]);
		}
		Arrays.sort(inputNos);
		return inputNos;
	}
	
	
}
