package com.gcuervo.callcenter.empleados;

import static java.lang.Thread.sleep;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.gcuervo.callcenter.call.Call;
import com.gcuervo.callcenter.dispatcher.Dispatcher;

public abstract class Employee {
	private String name;
	private Boolean isAvailable;
	private List<Call> answeredCalls;
	private Logger logger = Logger.getLogger(Employee.class.getName());

	public Employee(String name) {
		this.name = name;
		isAvailable = Boolean.TRUE;
		answeredCalls = new ArrayList<Call>();
	}

	public void answerCall(Call call) {
		try {
			logger.info("Llamada: " + call.getName());
			sleep(call.getDuration());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		answeredCalls.add(call);
		isAvailable = Boolean.TRUE;
	}

	public void getCall(Call call) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isAvailable() {
		return isAvailable;
	}

	public void setisAvailable(Boolean available) {
		this.isAvailable = available;
	}

	public List<Call> getAnsweredCalls() {
		return answeredCalls;
	}

	public void setAnsweredCalls(List<Call> answeredCalls) {
		this.answeredCalls = answeredCalls;
	}
}
