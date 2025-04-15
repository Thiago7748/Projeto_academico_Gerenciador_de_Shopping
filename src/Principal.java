import java.util.Scanner; // Necessário para ler entrada do teclado

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // Cria o objeto Scanner para ler a entrada

        // Variáveis para guardar a loja e o produto criados (inicializadas como null)
        Loja lojaCriada = null;
        Produto produtoCriado = null;

        int opcao = 0; // Variável para guardar a opção do menu escolhida pelo usuário

        System.out.println("----- Gerenciador de Lojas e Produtos -----");

        // Loop principal do menu (continua até o usuário digitar 3)
        while (opcao != 3) {
            // Exibe o menu
            System.out.println("\nMENU:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção do usuário
            opcao = teclado.nextInt();
            teclado.nextLine(); // <<< IMPORTANTE: Consome a quebra de linha deixada pelo nextInt()

            // Processa a opção escolhida
            switch (opcao) {
                case 1:
                    System.out.println("\n--- Criar Loja ---");
                    if (lojaCriada == null) {
                        // Lógica para pedir dados da Loja, Endereço e Data de Fundação
                        // ... (ver detalhes abaixo) ...
                        // lojaCriada = new Loja(...); // Cria a loja com os dados lidos
                        System.out.println("Loja criada com sucesso! (Implementação Pendente)"); // Placeholder
                    } else {
                        System.out.println("Uma loja já foi criada.");
                    }
                    break; // Sai do switch

                case 2:
                    System.out.println("\n--- Criar Produto ---");
                    if (produtoCriado == null) {
                        // Lógica para pedir dados do Produto e Data de Validade
                        // ... (ver detalhes abaixo) ...
                        // produtoCriado = new Produto(...); // Cria o produto com os dados lidos
                        System.out.println("Produto criado com sucesso! (Implementação Pendente)"); // Placeholder
                    } else {
                        System.out.println("Um produto já foi criado.");
                    }
                    break; // Sai do switch

                case 3:
                    System.out.println("\nSaindo do programa...");
                    break; // Sai do switch (e o while vai parar)

                default: // Caso o usuário digite algo diferente de 1, 2 ou 3
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break; // Sai do switch
            } // Fim do switch
        } // Fim do while

        // --- Lógica após sair do menu ---
        System.out.println("\n--- Verificação Final ---");

        // Verifica se ambos os objetos foram criados
        if (lojaCriada != null && produtoCriado != null) {

            // Cria a data de comparação (20/10/2023)
            Data dataComparacao = new Data(20, 10, 2023);
            // (O construtor da Data já valida se 20/10/2023 é válida)

            // Verifica se o produto está vencido usando o método da classe Produto
            if (produtoCriado.estaVencido(dataComparacao)) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }

            // Imprime as informações da loja (usando o toString da Loja)
            System.out.println("\nInformações da Loja Criada:");
            System.out.println(lojaCriada); // Chama lojaCriada.toString()

        } else {
            // Mensagem caso um ou ambos os objetos não tenham sido criados
            System.out.println("Não foi possível realizar a verificação final, pois a loja ou o produto não foram criados.");
        }

        teclado.close(); // Fecha o Scanner para liberar recursos
        System.out.println("Programa finalizado.");

    } // Fim do main
} // Fim da classe Principal
