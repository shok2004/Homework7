package com.saenkov.testing;

import com.saenkov.annotation.AfterSuite;
import com.saenkov.annotation.Test;

public class TestingClass3 {
    @Test
    public void test1() {}

    @AfterSuite
    public void beforeSuite1() {
    }

    @AfterSuite
    public void beforeSuite2() {
    }
}
