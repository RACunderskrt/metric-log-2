package bankAccountApp;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;

import bankAccountApp.Person;
import org.junit.Test;
import java.lang.Exception;

public class PersonTest {

    @Test
	public void test_default_values() {
		Person person = new Person();

		assertEquals("", person.getName());
		assertEquals('M', person.getGender());
		assertEquals(0, person.getAge());
		assertEquals(0.0, person.getHeight(), 0);
		assertEquals(0.0, person.getWeight(), 0);
		assertEquals("", person.getHairColor());
		assertEquals("", person.getEyeColor());
	}
}
