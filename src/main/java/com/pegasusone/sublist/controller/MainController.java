package com.pegasusone.sublist.controller;


import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pegasusone.sublist.form.SubList;
import com.pegasusone.sublist.service.EvaluateSubList;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayLandingPage(Map<String, Object> model) {
		SubList subList = new SubList();
		model.put("subListForm", subList);
		return "index";
	}
	
	@RequestMapping(value = "/evaluateSubList", method = RequestMethod.POST)
	public String evaluateSubList(@ModelAttribute("subListForm") SubList subList,
            Map<String, Object> model) {

		List<Integer> numberList = subList.getNumberList();
		List<List<Integer>> outputSubList;
		Integer sum = subList.getSum();
		
		logger.debug("Number List: " + numberList);
		logger.debug("Sum: " + sum);
		
		outputSubList = EvaluateSubList.printAllSubsets(numberList, numberList.size(), sum);
		model.put("numberList", subList.getNumberList());
		model.put("sum", subList.getSum());
		model.put("subList", outputSubList);
		return "result";
	}
}
