public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
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

    @Override
    public String toString() {
        String info = "Loja: " + nome + "\n" +
                "Quantidade de Funcionários: " + quantidadeFuncionarios + "\n" +
                "Salário Base Funcionário: R$" + String.format("%.2f", salarioBaseFuncionario) + "\n" +
                "Endereço:\n" + endereco + "\n" +
                "Data de Fundação: " + dataFundacao;
        return info;
    }
}