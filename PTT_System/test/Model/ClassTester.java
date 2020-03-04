package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassTester {
	
	@Test
	public void test(){
		for (int i = 1; i < 1000; ++i) {
			Class c = SystemFactory.createClass(i , i + 100);
			assertEquals(i, c.getClassID());
			assertEquals(i + 100 , c.getNumOfStudent());
			assertEquals(i + " " + (i+100) , c.toWriter());
			assertEquals("class ID: " + i, c.toString());
		}
	} 

}
