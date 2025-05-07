# Sistema de Gerenciamento de Lojas - Laboratório I

Para a disciplina de Laboratório I, estou desenvolvendo um sistema em Java que gerencia lojas em um shopping center com 20 espaços comerciais. O projeto aplica conceitos de orientação a objetos e está estruturado em etapas progressivas.

## Implementações
- Classes fundamentais como `Loja`, `Produto`, `Endereço` e `Data`, com seus atributos e métodos.
- Associações entre classes, permitindo que lojas tenham endereço e data de fundação.
- Hierarquia de classes com herança, criando tipos específicos de lojas (Cosméticos, Vestuário, Bijuteria, Alimentação e Informática).
- Na classe `Loja`, adicionei o atributo `estoqueProdutos`, um array de `Produto`, cujo tamanho é definido por parâmetro nos construtores, inicializando espaço para armazenar produtos (ainda sem itens no estoque). Criei métodos de acesso para esse atributo e atualizei o método `toString` para refletir as mudanças.
- Métodos na classe `Loja` para gerenciar o estoque:
  - `imprimeProdutos`: Imprime a informação de todos os produtos da loja.
  - `insereProduto`: Insere um produto na primeira posição livre do array `estoqueProdutos`, retornando `true` se bem-sucedido ou `false` se não houver espaço.
  - `removeProduto`: Remove um produto pelo nome do array `estoqueProdutos`, retornando `true` se removido ou `false` se não encontrado.

## Funcionalidades
O sistema permite gerenciar informações sobre as lojas, seus produtos e funcionários, classificar lojas por tamanho e verificar a validade de produtos, com o gerenciamento de estoque agora mais robusto graças às novas funcionalidades.

## Próximas Etapas
[Em desenvolvimento...]
