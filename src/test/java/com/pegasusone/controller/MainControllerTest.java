package com.pegasusone.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.pegasusone.sublist.service.EvaluateSubList;

public class MainControllerTest{
	
	@Test
	public void testSubListSum() {
		List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(7,3,9,8,4,5,2,10));
		int sum = 15;
		List<List<Integer>> outputSubList = EvaluateSubList.printAllSubsets(inputList, inputList.size(), sum);
		Assert.assertNotNull(outputSubList);
		Assert.assertEquals(7, outputSubList.size());
		Assert.assertEquals(true, outputSubList.contains(Arrays.asList(8,7)));
		Assert.assertEquals(true, outputSubList.contains(Arrays.asList(4,8,3)));
		Assert.assertEquals(true, outputSubList.contains(Arrays.asList(5,3,7)));
		Assert.assertEquals(true, outputSubList.contains(Arrays.asList(2,4,9)));
		Assert.assertEquals(true, outputSubList.contains(Arrays.asList(2,5,8)));
		Assert.assertEquals(true, outputSubList.contains(Arrays.asList(10,5)));
		Assert.assertEquals(true, outputSubList.contains(Arrays.asList(10,2,3)));
	}
	
	@Test
	public void testSubListSumForZero() {
		List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(1,3,5));
		int sum = 0;
		List<List<Integer>> outputSubList = EvaluateSubList.printAllSubsets(inputList, inputList.size(), sum);
		Assert.assertNotNull(outputSubList);
		Assert.assertEquals(0, outputSubList.size());
		Assert.assertEquals(true, outputSubList.isEmpty());
	}
}