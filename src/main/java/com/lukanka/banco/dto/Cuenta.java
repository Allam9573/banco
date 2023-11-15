package com.lukanka.banco.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cuenta {

    private int numero;
    private int codigoCliente;
    private int fechaApertura;
    private double saldo;

    public void retirarSaldo(double saldo) {
        this.saldo -= saldo;
    }

    public void depositarSaldo(double saldo) {
        this.saldo += saldo;
    }

}
