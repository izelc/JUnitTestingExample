package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcateTest {

	@Test
	public void testConcatenate() {
       Junit test=new Junit();
       String result=test.concatenate("izel","cavusoglu");
       assertEquals("izelcavusoglu", result);
	}

}
