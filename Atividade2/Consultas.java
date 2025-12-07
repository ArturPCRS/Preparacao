package Atividade2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Consultas {
    ItemPedido ip = ItemPedido.getInstance();

    public double valorTotalPedido(String codigoPedido){
        double valorTotal = 0;
        Map<Pedido, List<Produto>> itemPedido = ip.itemPedido;

        for (Map.Entry<Pedido, List<Produto>> entry : itemPedido.entrySet()){
            if (entry.getKey().getCodigoPedido().equals(codigoPedido)){
                List<Produto> totalProdutos = entry.getValue();
                for (Produto p : totalProdutos){
                    valorTotal = p.getPreco() * totalProdutos.size();
                }
            }
        }
        return valorTotal;
    }

    public Pedido pedidosPorCliente(String CPF){
        Map<String, Pedido> pedidosClientes = ip.pedidoClientes;

        for (Map.Entry<String, Pedido> entry : pedidosClientes.entrySet()){
            String CPFCliente = entry.getKey();
            Pedido pedidoCliente = entry.getValue();
            if (CPFCliente.equals(CPF) && pedidoCliente.getPedidoCliente().equals(CPF)){
                return entry.getValue();
            }
        }
        return null;
    }

    public List<Produto> produtosMaisVendidos(){
        List<Produto> maisVendidos = ip.listaProdutos.stream().filter(p -> p.getStatus() == true)
        .sorted(Comparator.comparing(ip::quantidadeVendido)).collect(Collectors.toList());
        
        return maisVendidos;
    }

    public void faturamento(){
         Map<Map<Pedido, List<Produto>>, Cliente> clientes = ip.clientes;

        int valorTotalMes = 0;
        
        for (Map.Entry<Map<Pedido, List<Produto>>, Cliente> entry : clientes.entrySet()){
            List<Cliente> clientesComprando = new ArrayList<>();
            clientesComprando.add(entry.getValue());

            
        }

    }
}
