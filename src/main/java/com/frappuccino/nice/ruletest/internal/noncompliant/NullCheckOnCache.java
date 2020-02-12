package com.frappuccino.nice.ruletest.internal.noncompliant;

import com.frappuccino.nice.ruletest.helpers.Cache;

public class NullCheckOnCache {

    public void testCacheCase(){

        Cache c = new Cache();

        System.out.println(c.getId());
        System.out.println(c.getName());

    }

}
