//-> Extends quer dizer que essa classe está HERDANDO funcionalidades da classe mae LOJA
public class Bijuteria extends Loja {

    //atributos
    private double metaVendas;

    //construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;
    }

    //metodos de acesso getters and setters
    public double getMetaVendas(){
        return this.metaVendas;
    }
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    //Sobrescrita do toString
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Meta de Vendas: R$ " + String.format("%.2f", metaVendas);
    }
}
