package com.frappuccino.nice.ruletest.findbugs.noncompliant;

import java.util.Collection;

public class ImpossibleDowncastOfToArray {

    String[] getAsArray(Collection c) {
        return (String[]) c.toArray();
    }

}
