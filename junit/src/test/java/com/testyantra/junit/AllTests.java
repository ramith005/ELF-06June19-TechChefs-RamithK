package com.testyantra.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BooleanOppTest.class, MathOppTest.class, StringOppTest.class })
public class AllTests {

}
