package com.frappuccino.nice.ruletest.squid.compliant;

public abstract class AbstractS1161Rule implements S1161Interface{
	
	protected void someMethod(String aParam) {
		System.out.println("in someMethod");
	}

	public void doOneThing() {
		//abstract class, doesn't need @Override.
	}

	
	
}
