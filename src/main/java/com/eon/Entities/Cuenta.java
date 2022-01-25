package com.eon.Entities;

import java.math.BigDecimal;

public class Cuenta {

    protected BigDecimal balance;

    public Cuenta(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean ingresar(BigDecimal cantidad) {
        balance = balance.add(cantidad);
        return true;
    }

    public boolean extraer(BigDecimal cantidad) {

        if ((balance.subtract(cantidad).compareTo(BigDecimal.ZERO)) < 0) {
            return false;
        }

        balance = balance.subtract(cantidad);
        return true;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return balance.toString();
    }

}
