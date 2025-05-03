                       //-> extends quer dizer que HERDA da classe principal LOJA
public class Cosmetico extends Loja {

    //atributos
    private double taxaComercializacao;

    //Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    //metodos de acesso getters and setters
    public double getTaxaComercializacao() {
        return this.taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    //Sobrescrita do toString
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Taxa de Comercialização: " + String.format("%.2f%%", taxaComercializacao * 100);
    }
}