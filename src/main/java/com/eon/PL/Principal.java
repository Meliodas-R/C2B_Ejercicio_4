package com.eon.PL;

import com.eon.Entities.CuentaAhorro;
import com.eon.Entities.CuentaCorriente;
import java.io.Console;
import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {

        final String ANSI_GREEN = "\u001B[32m";

        // Operaciones Jane Smith
        System.out.println("Creando el cliente Jane Smith.");
        System.out.println("Creando una cuenta de ahorro para Jane Smith con un balance de 500.00€ y 3% de interés.");
        System.out.print("Resultados: ");

        CuentaAhorro cuentaAhorroJane = new CuentaAhorro(BigDecimal.valueOf(500.0), 3.0);

        System.out.print(cuentaAhorroJane.extraer(BigDecimal.valueOf(150.00)) + ", ");
        System.out.print(cuentaAhorroJane.ingresar(BigDecimal.valueOf(22.50)) + ", ");
        System.out.print(cuentaAhorroJane.extraer(BigDecimal.valueOf(47.62)) + ", ");
        System.out.print(cuentaAhorroJane.extraer(BigDecimal.valueOf(400.00)));
        System.out.println("\n");

        // Operaciones Owen Bryant
        System.out.println("Creando el cliente Owen Bryant.");
        System.out.println("Creando una cuenta corriente para Owen Bryant con un balance de 500.00€ y sin cantidad limite.");
        System.out.print("Resultados: ");

        CuentaCorriente cuentaCorrienteOwen = new CuentaCorriente(BigDecimal.valueOf(500.00));

        System.out.print(cuentaCorrienteOwen.extraer(BigDecimal.valueOf(150.00)) + ", ");
        System.out.print(cuentaCorrienteOwen.ingresar(BigDecimal.valueOf(22.50)) + ", ");
        System.out.print(cuentaCorrienteOwen.extraer(BigDecimal.valueOf(47.62)) + ", ");
        System.out.print(cuentaCorrienteOwen.extraer(BigDecimal.valueOf(400.00)));
        System.out.println("\n");

        // Operaciones Tim Soley
        System.out.println("Creando el cliente Tim Soley.");
        System.out.println("Creando una cuenta de ahorro para Tim Soley con un balance de 500.00€ y 500.00€ de cantidad limite.");
        System.out.print("Resultados: ");

        CuentaCorriente cuentaCorrienteTim = new CuentaCorriente(BigDecimal.valueOf(500.00), BigDecimal.valueOf(500.00));

        System.out.print(cuentaCorrienteTim.extraer(BigDecimal.valueOf(150.00))  + ", ");
        System.out.print(cuentaCorrienteTim.ingresar(BigDecimal.valueOf(22.50))  + ", ");
        System.out.print(cuentaCorrienteTim.extraer(BigDecimal.valueOf(47.62))  + ", ");
        System.out.print(cuentaCorrienteTim.extraer(BigDecimal.valueOf(400.00))  + ", ");
        System.out.println("\n");
    }
}
