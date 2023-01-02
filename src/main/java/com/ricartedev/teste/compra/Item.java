package com.ricartedev.teste.compra;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder(toBuilder = true)
public class Item {

  private final String nome;
  private final BigDecimal valor;

}
