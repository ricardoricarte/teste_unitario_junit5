package com.ricartedev.teste.banco;

import java.util.ArrayList;
import java.util.List;

import com.ricartedev.teste.venda.Venda;

public class BancoDeDados {

  public static List<Venda> vendas = new ArrayList<>();

  public static void addVenda(Venda venda) {
    vendas.add(venda);

  }

  public static void reset() {
    vendas.clear();
  }

}
