public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    // atributos iniciais ^^^^

    private Endereco endereco;
    private Data dataFundacao;
    // atributos segundarios ^^^^

    private Produto[] estoqueProdutos;
    private int quantidadeMaximaProdutos;

    // Clase cosmeticos está herdando isso
    // super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao)
    // devo adicionar estoqueProtudos e quantidadeMaxima???
                                                                                                                            //-> adicição do atributo com orientação do gpt, verificar veracidade
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        // retorno dos atributos inicais ^^^^

        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.quantidadeMaximaProdutos = quantidadeMaximaProdutos;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos]; // Inicializa o array com o tamanho especificado
    }
    // criação do primeiro construtor ^^^^
                                                         //-> verificar essa informação, o enunciado pede inicialmente para passar apenas os atributos iniciais
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        // retorno dos atributos inicais ^^^^

        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos]; // Inicializa o array com o tamanho especificado
    }
    // criação do segundo construtor ^^^^


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    }
    // metodos de acesso para os atributos iniciais ^^^^


    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return this.dataFundacao;
    }
    public void setDataFundacao(Data dataDeFundacao) {
        this.dataFundacao = dataDeFundacao;
    }
    // metodos de cesso para os atributos segundarios ^^^^

    // ENTENDER ESSE TRECHO DE CÓDIGO
    // Método de acesso para o estoqueProdutos
    public Produto[] getEstoqueProdutos() {
        return this.estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }
    // ENTENDER ESSE TRECHO DE CÓDIGO

    public double gastosComSalario(){
        if (this.salarioBaseFuncionario == -1){
            return -1.0;
        } else {
            return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
        }
    }
    // esse metodo está OK ^^^^

    public char tamanhoDaLoja(){
        if (this.quantidadeFuncionarios < 10){
            return 'P';
        } else if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30){
            return 'M';
        } else {
            return 'G';
        }
    }
    // esse metodo está OK ^^^^

    // ENTENDER ESSE TRECHO DE CÓDIGO
    // Método para imprimir todos os produtos no estoque
    public void imprimeProdutos() {
        System.out.println("Produtos em estoque na loja " + this.nome + ":");
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null) {
                System.out.println(estoqueProdutos[i].toString());
            }
        }
    }
    // ENTENDER ESSE TRECHO DE CÓDIGO

    // ENTENDER ESSE TRECHO DE CÓDIGO
    // Método para inserir um produto no estoque
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true; // Produto inserido com sucesso
            }
        }
        return false; // Não há espaço disponível no estoque
    }
    // ENTENDER ESSE TRECHO DE CÓDIGO

    // ENTENDER ESSE TRECHO DE CÓDIGO
    // Método para remover um produto do estoque pelo nome
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true; // Produto removido com sucesso
            }
        }
        return false; // Produto não encontrado no estoque
    }
    // ENTENDER ESSE TRECHO DE CÓDIGO

    @Override
    public String toString() {
        return "Loja: " + nome + "\n" +
                "Quantidade de Funcionários: " + quantidadeFuncionarios + "\n" +
                "Salário Base Funcionário: R$" + String.format("%.2f", salarioBaseFuncionario) + "\n" +
                "Endereço:\n" + endereco + "\n" +
                "Data de Fundação: " + dataFundacao + "\n" +
                // toString com informações iniciais ^^
                "Capacidade do Estoque: " + estoqueProdutos.length + " produtos";
    }
}