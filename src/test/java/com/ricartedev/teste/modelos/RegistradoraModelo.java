package com.ricartedev.teste.modelos;

import com.ricartedev.teste.cliente.Cliente;
import com.ricartedev.teste.registradora.Registradora;
import com.ricartedev.teste.vendedor.Vendedor;

public class RegistradoraModelo {
  public static Registradora.RegistradoraBuilder construirCenario() {
    return Registradora.builder()
    .vendedor(new Vendedor(1, "Jet Li"))
    .cliente(new Cliente("Bruce Lee"));

  }

}
