package com.frappuccino.nice.ruletest.squid.noncompliant;

import com.frappuccino.nice.ruletest.squid.compliant.AbstractS1114Rule;

public class S1114Rule3 extends AbstractS1114Rule {
	
	protected void finalize() throws Throwable {
		try {
			// no method
		} catch (Throwable t) {
			releaseSomeResources();
			super.finalize(); // non-compliant- Super is at the end of the
								// method but in a catch block
		}

	}

	public void releaseSomeResources() {

	}
}
