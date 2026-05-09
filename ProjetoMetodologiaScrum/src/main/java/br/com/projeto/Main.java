package br.com.projeto;
import br.com.projeto.model.Produto;
import br.com.projeto.service.BuscaService;
import br.com.projeto.service.OrdenacaoService;
import br.com.projeto.service.TabelaHash;
import br.com.projeto.util.ConsoleUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Estruturas de armazenamento
    private static List<Produto> listaProdutos = new ArrayList<>();
    private static TabelaHash tabelaHash = new TabelaHash(100); // Tamanho inicial da tabela hash
    private static boolean listaOrdenadaPorId = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            ConsoleUtil.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    cadastrarProduto(scanner);
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    ordenarPorId();
                    break;
                case 4:
                    ordenarPorPreco();
                    break;
                case 5:
                    ordenarPorNome();
                    break;
                case 6:
                    buscarSequencialPorId(scanner);
                    break;
                case 7:
                    buscarSequencialPorNome(scanner);
                    break;
                case 8:
                    buscarBinariaPorId(scanner);
                    break;
                case 9:
                    buscarPorHash(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static Produto[] getListaComoArray() {
        return listaProdutos.toArray(new Produto[0]);
    }

    private static void cadastrarProduto(Scanner scanner) {
        System.out.println("\n--- Cadastro de Produto ---");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        Produto novoProduto = new Produto(id, nome, preco);

        // Adiciona nas duas estruturas
        listaProdutos.add(novoProduto);
        tabelaHash.inserir(novoProduto);

        listaOrdenadaPorId = false; // A lista não está mais garantidamente ordenada

        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        ConsoleUtil.imprimirProdutos(getListaComoArray());
    }

    private static void ordenarPorId() {
        Produto[] array = getListaComoArray();
        OrdenacaoService.bubbleSortPorId(array);
        listaProdutos = new ArrayList<>(List.of(array)); // Atualiza a lista principal
        listaOrdenadaPorId = true;
        System.out.println("Produtos ordenados por ID.");
        listarProdutos();
    }

    private static void ordenarPorPreco() {
        Produto[] array = getListaComoArray();
        OrdenacaoService.bubbleSortPorPreco(array);
        listaProdutos = new ArrayList<>(List.of(array));
        listaOrdenadaPorId = false;
        System.out.println("Produtos ordenados por Preço.");
        listarProdutos();
    }

    private static void ordenarPorNome() {
        Produto[] array = getListaComoArray();
        OrdenacaoService.selectionSortPorNome(array);
        listaProdutos = new ArrayList<>(List.of(array));
        listaOrdenadaPorId = false;
        System.out.println("Produtos ordenados por Nome.");
        listarProdutos();
    }

    private static void buscarSequencialPorId(Scanner scanner) {
        System.out.print("Digite o ID para busca sequencial: ");
        int id = scanner.nextInt();
        Produto encontrado = BuscaService.buscaSequencial(getListaComoArray(), id);
        if (encontrado != null) {
            System.out.println("Produto encontrado: " + encontrado);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void buscarSequencialPorNome(Scanner scanner) {
        System.out.print("Digite o Nome para busca sequencial: ");
        String nome = scanner.nextLine();
        Produto encontrado = BuscaService.buscaSequencial(getListaComoArray(), nome);
        if (encontrado != null) {
            System.out.println("Produto encontrado: " + encontrado);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void buscarBinariaPorId(Scanner scanner) {
        if (!listaOrdenadaPorId) {
            System.out.println("Atenção: A busca binária requer que a lista esteja ordenada por ID.");
            System.out.print("Deseja ordenar agora? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ordenarPorId();
            } else {
                System.out.println("Busca binária cancelada.");
                return;
            }
        }

        System.out.print("Digite o ID para busca binária: ");
        int id = scanner.nextInt();
        Produto encontrado = BuscaService.buscaBinaria(getListaComoArray(), id);
        if (encontrado != null) {
            System.out.println("Produto encontrado: " + encontrado);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void buscarPorHash(Scanner scanner) {
        System.out.print("Digite o ID para busca na Tabela Hash: ");
        int id = scanner.nextInt();
        Produto encontrado = tabelaHash.buscar(id);
        if (encontrado != null) {
            System.out.println("Produto encontrado: " + encontrado);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
