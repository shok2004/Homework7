package com.saenkov.testing;

import com.saenkov.annotation.BeforeSuite;
import com.saenkov.annotation.Test;

public class TestingClass2 {
    @BeforeSuite
    public void beforeSuite1() {
    }

    @BeforeSuite
    public void beforeSuite2() {
    }

    @Test
    public void test1() {}

}
