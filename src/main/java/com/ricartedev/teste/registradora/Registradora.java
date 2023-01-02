package com.ricartedev.teste.registradora;

import java.math.BigDecimal;

import com.ricartedev.teste.banco.BancoDeDados;
import com.ricartedev.teste.cliente.Cliente;
import com.ricartedev.teste.compra.Compra;
import com.ricartedev.teste.venda.Venda;
import com.ricartedev.teste.vendedor.Vendedor;
import lombok.Builder;

@Builder(toBuilder = true)
public class Registradora {
  
  private final Compra compra;
  private final BigDecimal valorRecebido;
  private final Vendedor vendedor;
  private final Cliente cliente;

  public void efetivarVenda() {
    var totalCompra = compra.getTotal();

    if (totalCompra.compareTo(valorRecebido) > 0) {
      return;
    }
    var troco = valorRecebido.subtract(totalCompra);

    var venda = Venda.builder()
        .totalCompra(totalCompra)
        .troco(troco)
        .vendedor(vendedor)
        .cliente(cliente)
        .build();

        BancoDeDados.addVenda(venda);
  }

}
