package com.ricartedev.teste.venda;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.ricartedev.teste.cliente.Cliente;
import com.ricartedev.teste.vendedor.Vendedor;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class Venda {

  private final BigDecimal totalCompra;
  private final BigDecimal troco;
  private final Vendedor vendedor;
  private final Cliente cliente;

  @Builder.Default
  private final LocalDate dataDaVenda = LocalDate.now();
  
}
