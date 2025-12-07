package Atividade2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Consultas {

    public void pagamento(Pedido pedido){
        Cadastros c = Cadastros.getInstance();

        Map<Pedido, Cliente> pedidosCliente = c.pedidosCliente;

        for (Map.Entry<Pedido, Cliente> entry : pedidosCliente.entrySet()){
            Pedido pedidoCliente = entry.getKey();
            List<Produto> produtos = pedidoCliente.getProdutos();
            for (Produto p : produtos){
                if (p.getNoCarrinho() == true){
                    p.setVendido(true);
                    p.setQuantidadeVendida(p);
                }
            }
        }
    }

    public double valorTotal(Pedido pedido){
        Cadastros c = Cadastros.getInstance();
        Map<Pedido, Cliente> pedidosCliente = c.pedidosCliente;
        double valorTotal = 0;

        for (Map.Entry<Pedido, Cliente> entry : pedidosCliente.entrySet()){
            Pedido pedidoCliente = entry.getKey();
            List<Produto> produtos = pedidoCliente.getProdutos();
            for (Produto p : produtos){
                if (p.getNoCarrinho() == true){
                    p.setVendido(true);
                    p.setQuantidadeVendida(p);
                    valorTotal = p.getPreco() * produtos.size();
                }
            }
        }
        return valorTotal;
    }

    public Pedido filtrarPorCliente(Cliente cliente){
        Cadastros c = Cadastros.getInstance();
        Map<Pedido, Cliente> pedidosCliente = c.pedidosCliente;

        for (Map.Entry<Pedido, Cliente> entry : pedidosCliente.entrySet()){
            if (entry.getValue().equals(cliente)){
                return entry.getKey();
            }
        }
        return null;
    }

    public List<Produto> produtosMaisVendidos(){
        Cadastros c = Cadastros.getInstance();

        List<Produto> produtos = c.listaProdutos;

        List<Produto> maisVendidos = produtos.stream().filter(p -> p.getVendido() == true)
        .sorted(Comparator.comparing(Produto::getQuantidadeVendida)).collect(Collectors.toList());

        return maisVendidos;
    }

    public void faturamento(){
        Cadastros c = Cadastros.getInstance();
        List<Produto> produtosTotal = c.listaProdutos;

        Map<Pedido, Cliente> pedidosCliente = c.pedidosCliente;
        List<Cliente> listaClientes = c.listaClientes;

    }
}
