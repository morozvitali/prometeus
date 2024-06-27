package prometheus.olimpiatasks.number23;

import java.util.Objects;

public class BankAccount {
    private final String name;
    private final int accountBalance;

    public BankAccount(String name, int accountBalance) {
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount bankAccount = (BankAccount) o;
        return accountBalance == bankAccount.accountBalance && Objects.equals(name, bankAccount.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accountBalance);
    }
}
