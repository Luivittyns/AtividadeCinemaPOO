import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Filme> filmes = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        exibirFilmesPadrao();

        do {
            System.out.println("\n--- Sistema de Cinema ---");
            System.out.println("1. Cadastrar Filme");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Listar Filmes");
            System.out.println("4. Listar Clientes");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarFilme();
                    break;
                case 2:
                    cadastrarCliente();
                    break;
                case 3:
                    listarFilmes();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static void exibirFilmesPadrao() {
        System.out.println("\n--- Filmes Padrão ---");
        for (Filme filme : Filme.filmesPadrao) {
            System.out.println("Título: " + filme.getTitulo());
            System.out.println("Gênero: " + filme.getCategoria().getNome());
            System.out.println("Duração: " + filme.getDuracao() + " minutos\n");
        }
    }

    private static void cadastrarFilme() {
        System.out.print("Digite o título do filme: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Digite o gênero do filme: ");
        String genero = scanner.nextLine();
        
        System.out.print("Digite a duração do filme (em minutos): ");
        int duracao = scanner.nextInt();
        scanner.nextLine();

        Filme filme = new Filme(titulo, genero, duracao);
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    private static void cadastrarCliente() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        
        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, endereco);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void listarFilmes() {
        System.out.println("\n--- Lista de Filmes ---");
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
        } else {
            for (Filme filme : filmes) {
                System.out.println("Título: " + filme.getTitulo());
                System.out.println("Gênero: " + filme.getCategoria().getNome());
                System.out.println("Duração: " + filme.getDuracao() + " minutos\n");
            }
        }
    }

    private static void listarClientes() {
        System.out.println("\n--- Lista de Clientes ---");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCPF());
                System.out.println("Endereço: " + cliente.getEndereco() + "\n");
            }
        }
    }
}
