package manassawee;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tasty {

	@Test
	public void test() {
		//Arrange
		Hello hell = new Hello();
		//Act
		String res = Hello.sayHi("M");
		//Assert
		assertEquals("M", res);
	}

}
