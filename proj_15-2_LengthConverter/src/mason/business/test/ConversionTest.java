package mason.business.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mason.business.Conversion;

class ConversionTest {

	@Test
	void testMilesToFeet() {
		Conversion conversion = new Conversion("Miles", 1.0, "Feet", 5280.0);
		
		assertEquals(5280.0, conversion.getToValue());
		fail("test");
	}

}
