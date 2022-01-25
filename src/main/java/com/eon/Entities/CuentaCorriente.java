package com.eon.Entities;

import java.math.BigDecimal;

public class CuentaCorriente extends Cuenta {

    private BigDecimal cantidadLimite = BigDecimal.valueOf(0.00);

    public CuentaCorriente(BigDecimal balance) {
        super(balance);
    }

    public CuentaCorriente(BigDecimal balance, BigDecimal cantidadLimite) {
        super(balance);
        this.cantidadLimite = cantidadLimite;
    }

    public boolean extraer(BigDecimal cantidad) {

        // Si el balance es mayor o igual que la cantidad extraida.
        if (balance.compareTo(cantidad) == 1 || balance.compareTo(cantidad) == 0) {
            balance = balance.subtract(cantidad);
            return true;
        } else {
            // Si la cantidad limite mas el balance es mayor o igual a la cantidad a extraer. 
            if (balance.add(cantidadLimite).compareTo(cantidad) == 1 || balance.add(cantidadLimite).compareTo(cantidad) == 0) {
                cantidad = balance.subtract(cantidad);
                balance = balance.subtract(cantidad);
                cantidad = cantidad.abs();
                cantidadLimite = cantidadLimite.subtract(cantidad);
                return true;
            }
        }

        return false;
    }

}
