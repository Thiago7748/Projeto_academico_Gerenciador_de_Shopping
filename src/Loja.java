public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos]; // Inicializa o array com o tamanho especificado
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos]; // Inicializa o array com o tamanho especificado
    }

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

    // Método de acesso para o estoqueProdutos
    public Produto[] getEstoqueProdutos() {
        return this.estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public double gastosComSalario(){
        if (this.salarioBaseFuncionario == -1){
            return -1.0;
        } else {
            return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
        }
    }

    public char tamanhoDaLoja(){
        if (this.quantidadeFuncionarios < 10){
            return 'P';
        } else if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30){
            return 'M';
        } else {
            return 'G';
        }
    }

    // Método para imprimir todos os produtos no estoque
    public void imprimeProdutos() {
        System.out.println("Produtos em estoque na loja " + this.nome + ":");
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null) {
                System.out.println(estoqueProdutos[i].toString());
            }
        }
    }

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

    @Override
    public String toString() {
        String info = "Loja: " + nome + "\n" +
                "Quantidade de Funcionários: " + quantidadeFuncionarios + "\n" +
                "Salário Base Funcionário: R$" + String.format("%.2f", salarioBaseFuncionario) + "\n" +
                "Endereço:\n" + endereco + "\n" +
                "Data de Fundação: " + dataFundacao + "\n" +
                "Capacidade do Estoque: " + estoqueProdutos.length + " produtos";
        return info;
    }
}