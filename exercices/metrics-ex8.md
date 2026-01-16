# Exercice 8

On crée 2 tests dans le fichier `src/test/java/BankAccountTest.java`.
Au début du fichier, on ajoute une fonction permettant d'initialiser les différents objets utilisés lors des tests.

Les 2 tests portent sur la fonction `depositMoney`.

```java
    @Test
	public void test_deposit_money() {
		int depositamount = 50;
		bank.addAccount(bankAccount, assignAccountNumber);

		assertEquals(5000, bankAccount.getBalance(), 0f);
		bankAccount.depositMoney(depositamount);
		assertEquals(5050, bankAccount.getBalance(), 0f);
	}
```

Ce test vérifie si la fonction `depositMoney` modifie bien l'attribut `Balance` de la classe `BankAccount`.

```java
    @Test
    public void test_deposit_negative_money() {
        int depositAmount = -50;
        bank.addAccount(bankAccount, assignAccountNumber);
        double initialBalance = bankAccount.getBalance();

        bankAccount.depositMoney(depositAmount);
        assertEquals(initialBalance, bankAccount.getBalance(), 0f);
    }
```

Ce test vérifie que le montant sur un compte en banque n'est pas modifié si l'utilisateur souhaite déposer un nombre négatif d'euros.

