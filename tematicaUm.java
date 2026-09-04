
import java.util.Scanner;

public class tematicaUm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int tamanhoAtual = 0;
        int opcao = 0;

        while (opcao != 8) {

            System.out.println("1 - Inserir na proxima posicao livre");
            System.out.println("2 - Inserir em uma posicao informada");
            System.out.println("3 - Pesquisar elemento pelo valor");
            System.out.println("4 - Pesquisar elemento pela posicao");
            System.out.println("5 - Excluir elemento pelo valor");
            System.out.println("6 - Excluir elemento pela posicao");
            System.out.println("7 - Imprimir vetor");
            System.out.println("8 - Encerrar programa");
            System.out.print("Escolha uma opcao: ");

            try {

                opcao = scanner.nextInt();

                switch (opcao) {

                    case 1:
                        if (tamanhoAtual >= vetor.length) {
                            System.out.println("O vetor esta cheio!");
                        } else {
                            System.out.print("Digite o valor a inserir: ");
                            try {
                                int valor = scanner.nextInt();
                                vetor[tamanhoAtual] = valor;
                                tamanhoAtual++;
                                System.out.println("Elemento inserido com sucesso!");
                            } catch (NumberFormatException e) {
                                System.out.println("Valor inváido! Digite um numero inteiro.");
                            }
                        }
                        break;

                    case 2:
                        if (tamanhoAtual >= vetor.length) {
                            System.out.println("O vetor está cheio!");
                        } else {
                            System.out.print("Digite a posicao (0 a " + tamanhoAtual + "): ");
                            try {
                                int posicao = scanner.nextInt();
                                if (posicao < 0 || posicao > tamanhoAtual) {
                                    System.out.println("Posicao invalida!");
                                } else {
                                    System.out.print("Digite o valor a inserir: ");
                                    int valor = Integer.parseInt(scanner.nextLine());
                                    for (int i = tamanhoAtual; i > posicao; i--) {
                                        vetor[i] = vetor[i - 1];
                                    }
                                    vetor[posicao] = valor;
                                    tamanhoAtual++;
                                    System.out.println("Elemento inserido com sucesso!");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Valor invalido! Digite um número inteiro.");
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Digite o valor a pesquisar: ");
                        try {

                            int valorPesquisa = scanner.nextInt();
                            int posicaoEncontrada = -1;

                            for (int i = 0; i < tamanhoAtual; i++) {
                                if (vetor[i] == valorPesquisa) {
                                    posicaoEncontrada = i;
                                    break;
                                }
                            }
                            if (posicaoEncontrada == -1) {
                                System.out.println("Elemento nao encontrado.");
                            } else {
                                System.out.println("Elemento encontrado na posicao " + posicaoEncontrada);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Valor invalido! Digite um numero inteiro.");
                        }
                        break;

                    case 4:
                        System.out.print("Digite a posicao a consultar: ");
                        try {
                            int posConsulta = scanner.nextInt();
                            if (posConsulta < 0 || posConsulta >= tamanhoAtual) {
                                System.out.println("Posicao invalida!");
                            } else {
                                System.out.println("Elemento na posição " + posConsulta + ": " + vetor[posConsulta]);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Valor inválido! Digite um número inteiro.");
                        }
                        break;

                    case 5:
                        System.out.print("Digite o valor a excluir: ");
                        try {
                            int valorExcluir = scanner.nextInt();
                            int posExcluir = -1;
                            for (int i = 0; i < tamanhoAtual; i++) {
                                if (vetor[i] == valorExcluir) {
                                    posExcluir = i;
                                    break;
                                }
                            }
                            if (posExcluir == -1) {
                                System.out.println("Elemento não encontrado.");
                            } else {
                                for (int i = posExcluir; i < tamanhoAtual - 1; i++) {
                                    vetor[i] = vetor[i + 1];
                                }

                                tamanhoAtual--;

                                System.out.println("Elemento removido com sucesso!");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Valor inválido! Digite um número inteiro.");
                        }
                        break;

                    case 6:
                        System.out.print("Digite a posição a excluir: ");
                        try {
                            int posExcluirIndex = scanner.nextInt();
                            if (posExcluirIndex < 0 || posExcluirIndex >= tamanhoAtual) {
                                System.out.println("Posição inválida!");
                            } else {
                                for (int i = posExcluirIndex; i < tamanhoAtual - 1; i++) {
                                    vetor[i] = vetor[i + 1];
                                }
                                tamanhoAtual--;
                                System.out.println("Elemento removido com sucesso!");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Valor inválido! Digite um número inteiro.");
                        }
                        break;

                    case 7:
                        if (tamanhoAtual == 0) {
                            System.out.println("O vetor está vazio.");
                        } else {
                            System.out.println("\nELEMENTOS DO VETOR:");
                            for (int i = 0; i < tamanhoAtual; i++) {
                                System.out.println("Posicao " + i + ": " + vetor[i]);
                            }
                        }
                        break;
                    case 8:
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        System.out.println("Opçao inválida! Escolha uma opção de 1 a 8.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida! Digite um número.");
            }
        }
    }
}
