package CriandoAgenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contato agenda = new Contato();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Buscar Contato");
            System.out.println("3 - Remover Contato");
            System.out.println("4 - Listar Contatos");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    Contato novoContato = new Contato(nome, telefone);
                    agenda.adicionarContato(novoContato);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato para buscar: ");
                    String nomeBusca = scanner.nextLine();
                    Contato contatoBuscado = agenda.buscarContato(nomeBusca);
                    if (contatoBuscado != null) {
                        System.out.println("Contato encontrado: " + contatoBuscado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do contato para remover: ");
                    String nomeRemocao = scanner.nextLine();
                    agenda.removerContato(nomeRemocao);
                    break;
                case 4:
                    agenda.listarContatos();
                    break;
                case 5:
                    System.out.println("Saindo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tente novamente!");
            }
        }
    }
}
