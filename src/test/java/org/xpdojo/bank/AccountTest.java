package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {
    private int amount=10;


    @Test
    public void checkBalanceBeforeDeposit() {
        Account account = new Account();
        assertThat("").isBlank();
        assertThat(account.checkBalance()).isEqualTo(0);
    }
    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        assertThat("").isBlank();
        account.deposit(amount);
        assertThat(account.checkBalance()).isEqualTo(amount);
    }
}
