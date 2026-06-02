package src;

import src.Entidades.Chamado;
import src.Entidades.Cliente;
import src.Entidades.Pedido;

public class Main {

    public static void main(String[] args) {
        Fila<Cliente> filaClientes = new Fila<>();
        Fila<Chamado> filaChamados = new Fila<>();
        Fila<Pedido> filaPedidos = new Fila<>();

        testarFila("Clientes", filaClientes,
                new Cliente("Ana", "111.111.111-11"),
                new Cliente("Bruno", "222.222.222-22"));

        testarFila("Chamados", filaChamados,
                new Chamado(1, "Internet fora do ar"),
                new Chamado(2, "Computador não liga"));

        testarFila("Pedidos", filaPedidos,
                new Pedido(1001, 250.90),
                new Pedido(1002, 89.50));
    }

    public static <T> void testarFila(String nome, Fila<T> fila, T primeiroItem, T segundoItem) {
        System.out.println("\n===== Fila de " + nome + " =====");

        fila.adicionar(primeiroItem);
        fila.adicionar(segundoItem);

        System.out.println("Lista inicial:");
        fila.listar();

        System.out.println("Primeiro elemento: " + fila.primeiro());

        System.out.println("Elemento removido com proximo(): " + fila.proximo());

        System.out.println("Lista após remoção:");
        fila.listar();

        System.out.println("Quantidade de elementos: " + fila.quantidade());
    }
}
