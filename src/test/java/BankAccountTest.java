package bankAccountApp;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;

import bankAccountApp.BankAccount;
import org.junit.Test;

public class BankAccountTest {
	String name = "John";
	char gender = 'm';
	int age = 20;
	int weight = 80;
	float height = 180;
	String hairColor = "brown";
	String eyeColor = "green";
	String email = "buffer@gmail.com";

	int assignAccountNumber = 0;
	int accountNumberExists = 1;
	int initMoneyAmount = 5000;
	int withdrawLimit = 1000;
	String dateCreated = "05/21/2019";
	BankAccount bankAccount = null;
	Bank bank = null;
	Person accountHolder = null;
	String serializedPerson = null;

	@Before
	public void setup() {
		// Create Person
		try {
			accountHolder = new Person(name, gender, age, weight, height, hairColor, eyeColor, email);
			serializedPerson = name + Person.DELIM + gender + Person.DELIM + age + Person.DELIM + height + Person.DELIM
					+ weight + Person.DELIM + hairColor + Person.DELIM + eyeColor + Person.DELIM + email;
		} catch (Exception e) {
			System.out.print("Unexpected failure during test setup creating accountHolder");
			e.printStackTrace();
		}
		bank = new Bank();
		bankAccount = new BankAccount(initMoneyAmount, withdrawLimit, dateCreated, accountHolder);
	}

	@Test
	public void test_deposit_money() {
		int depositamount = 50;
		bank.addAccount(bankAccount, assignAccountNumber);

		assertEquals(5000, bankAccount.getBalance(), 0f);
		bankAccount.depositMoney(depositamount);
		assertEquals(5050, bankAccount.getBalance(), 0f);
	}

    @Test
    public void test_deposit_negative_money() {
        int depositAmount = -50;
        bank.addAccount(bankAccount, assignAccountNumber);
        double initialBalance = bankAccount.getBalance();

        bankAccount.depositMoney(depositAmount);
        assertEquals(initialBalance, bankAccount.getBalance(), 0f);
    }
}
