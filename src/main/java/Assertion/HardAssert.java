package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	// hard assert madhe assert jarr fail zala mhnje expected ani actual output match nahi zala
	// tarr assert pudhchi line mhnjech code execute karat nahi
	// if validation fail it stop execution
	
	@Test
	public void method1() {
		Assert.assertEquals(18, 19); // 18 expected output,  19 actual output 
		System.out.println("hello");
	}

}
