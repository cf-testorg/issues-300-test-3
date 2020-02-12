package com.frappuccino.nice.ruletest.squid.compliant;

public class S1699Rule {

    public S1699Rule() {
        doSomething();  // Noncompliant
    }

    private void doSomething() {  // not final; can be overridden
    }

}
