package com.frappuccino.nice.ruletest.squid.noncompliant;

import com.frappuccino.nice.ruletest.squid.compliant.AbstractS1161Rule;

public class S1161Rule extends AbstractS1161Rule {

	protected void someMethod(String aParam) {
		// non compliance since it is not declaring annotation @Override.
	}

	public String parentMethod() {
		// non compliance since it is not declaring annotation @Override.
		return null;
	}

}
