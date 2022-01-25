package com.eon.Entities;

import java.math.BigDecimal;

public class CuentaAhorro extends Cuenta{

    private double interes;

    public CuentaAhorro(BigDecimal balance, double interes) {
        super(balance);
        this.interes = interes;
    }
  
}
