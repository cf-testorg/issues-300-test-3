package com.frappuccino.nice.ruletest.squid.noncompliant;

import com.frappuccino.nice.ruletest.squid.compliant.AbstractS1114Rule;

public class S1114Rule2 extends AbstractS1114Rule {

	@Override
	protected void finalize() throws Throwable {
		super.finalize(); // Noncompliant; this call should come last
		releaseSomeResources();
	}

	public void releaseSomeResources() {

	}

}
