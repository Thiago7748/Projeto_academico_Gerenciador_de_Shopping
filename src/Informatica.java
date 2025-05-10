public class Informatica extends Loja{

    //atributos
    private double seguroEletronicos;

    //construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    //metodos de acesso getters and setters
    public double getSeguroEletronicos(){
        return this.seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    //Sobrescrita do toString
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Pagamento seguro Eletrônico: R$ " + String.format("%.2f", seguroEletronicos);
    }
}
