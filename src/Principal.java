import java.util.Scanner; // Necessário para ler entrada do teclado

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Loja lojaCriada = null;
        Produto produtoCriado = null;

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\nMENU:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    if (lojaCriada == null) {
                        System.out.println("\n--- Cadastro da Loja ---");
                        System.out.print("Nome da loja: ");
                        String nomeLoja = teclado.nextLine();
                        System.out.print("Quantidade de funcionários: ");
                        int qtFunc = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Salário base dos funcionários: ");
                        double salBase = teclado.nextDouble();
                        teclado.nextLine();

                        System.out.println("-- Endereço da Loja --");
                        System.out.print("Nome da rua: ");
                        String rua = teclado.nextLine();
                        System.out.print("Cidade: ");
                        String cidade = teclado.nextLine();
                        System.out.print("Estado: ");
                        String estado = teclado.nextLine();
                        System.out.print("País: ");
                        String pais = teclado.nextLine();
                        System.out.print("CEP: ");
                        String cep = teclado.nextLine();
                        System.out.print("Número: ");
                        String numero = teclado.nextLine();
                        System.out.print("Complemento: ");
                        String complemento = teclado.nextLine();

                        Endereco endLoja = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                        System.out.println("-- Data de Fundação --");
                        System.out.print("Dia da fundação: ");
                        int diaF = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Mês da fundação: ");
                        int mesF = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Ano da fundação: ");
                        int anoF = teclado.nextInt();
                        teclado.nextLine();

                        Data dataFundacao = new Data(diaF, mesF, anoF);

                        // Adicionar entrada para quantidadeMaximaProdutos
                        System.out.print("Capacidade máxima do estoque (número de produtos): ");
                        int quantidadeMaximaProdutos = teclado.nextInt();
                        teclado.nextLine();

                        // Usar o primeiro construtor com todos os argumentos
                        lojaCriada = new Loja(nomeLoja, qtFunc, salBase, endLoja, dataFundacao, quantidadeMaximaProdutos);
                        System.out.println("Loja '" + lojaCriada.getNome() + "' criada com sucesso!");

                    } else {
                        System.out.println("ERRO: Uma loja já foi criada neste cadastro.");
                    }
                    break;

                case 2:
                    if (produtoCriado == null) {
                        System.out.println("\n--- Cadastro do Produto ---");

                        System.out.print("Nome do produto: ");
                        String nomeProd = teclado.nextLine();

                        System.out.print("Preço do produto: ");
                        double precoProd = teclado.nextDouble();
                        teclado.nextLine();

                        System.out.println("-- Data de Validade --");
                        System.out.print("Dia da validade: ");
                        int diaV = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Mês da validade: ");
                        int mesV = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Ano da validade: ");
                        int anoV = teclado.nextInt();
                        teclado.nextLine();

                        Data dataValidade = new Data(diaV, mesV, anoV);

                        produtoCriado = new Produto(nomeProd, precoProd, dataValidade);
                        System.out.println("Produto '" + produtoCriado.getNome() + "' criado com sucesso!");

                    } else {
                        System.out.println("ERRO: Um produto já foi criado neste cadastro.");
                    }
                    break;

                case 3:
                    System.out.println("\nSaindo do sistema...");
                    break;

                default:
                    if(opcao != 0) {
                        System.out.println("\nOpção inválida. Por favor, escolha 1, 2 ou 3.");
                    }
                    break;
            }

        }

        System.out.println("\n--------- Verificação Final ---------");

        if (lojaCriada != null && produtoCriado != null) {
            System.out.println("Verificando validade do produto em relação a 20/10/2023...");
            Data dataComparacao = new Data(20, 10, 2023);

            if (produtoCriado.estaVencido(dataComparacao)) {
                System.out.println("Resultado: PRODUTO VENCIDO");
            } else {
                System.out.println("Resultado: PRODUTO NÃO VENCIDO");
            }

            System.out.println("\n--- Informações da Loja Criada ---");
            System.out.println(lojaCriada);

        } else {
            System.out.println("Não foi possível realizar a verificação final.");
            if (lojaCriada == null) System.out.println("- A loja não foi criada.");
            if (produtoCriado == null) System.out.println("- O produto não foi criado.");
        }

        teclado.close();
        System.out.println("\nPrograma encerrado.");

    }
}
