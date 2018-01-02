package thermostat;

import static org.junit.Assert.*;
import org.junit.*;

public class ThermostatTest {
	
	
	@Before //lo dice el enunciado
    public void setUp() {
		Thermostat.partOfDay = "Wake"; 
		Thermostat.temp = "Low";
	}

	
	@Test
	public void testAdvance() {
		Thermostat.advance();
		Thermostat.advance();
		Thermostat.advance();
		assertEquals("Sleep,Low",Thermostat.partOfDay + "," + Thermostat.temp);
	}
	
	@Test
	public void testUp() {
		Thermostat.up();
		Thermostat.up();
		Thermostat.up();
		assertEquals("Wake,High",Thermostat.partOfDay + "," + Thermostat.temp);
	}
	
	@Test
	public void testDown() {
		Thermostat.up();
		Thermostat.down();
		Thermostat.down();
		Thermostat.down();
		Thermostat.down();
		assertEquals("Wake,Low",Thermostat.partOfDay + "," + Thermostat.temp);
	}
	
	@Test
	public void testEdgeCoverage() {
		Thermostat.advance();
		Thermostat.up();
		Thermostat.advance();
		Thermostat.down();
		Thermostat.advance();
		Thermostat.advance();
		Thermostat.up();
		Thermostat.advance();
		assertEquals("Sleep,High",Thermostat.partOfDay + "," + Thermostat.temp);
	}
}
