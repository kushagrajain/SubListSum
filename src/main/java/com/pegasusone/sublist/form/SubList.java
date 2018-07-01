package com.pegasusone.sublist.form;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SubList {
	
	private List<Integer> numberList;
	private Integer sum;
	private String commandName;
	
	public SubList() {
		super();
		this.numberList = new ArrayList();
		this.sum = null;
		commandName = null;
	}
	
	public SubList(List<Integer> numberList, Integer sum, String commandName) {
		super();
		this.numberList = numberList;
		this.sum = sum;
		this.commandName = commandName;
	}
	
	public List<Integer> getNumberList() {
		return numberList;
	}
	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public String getCommandName() {
		return commandName;
	}
	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}
}
