//-> extends quer dizer que HERDA da classe principal LOJA
public class Cosmetico extends Loja {
    //atributos
    private double taxaComercializacao;

    //Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;                                     // -> adição do novo atributo de loja segundo gpt, verificar
    }

    // Clase cosmeticos está herdando isso
    // super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao)
    // devo adicionar estoqueProtudos e quantidadeMaxima???

    public double getTaxaComercializacao() {
        return this.taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Taxa de Comercialização: " + String.format("%.2f%%", taxaComercializacao * 100);
    }
}