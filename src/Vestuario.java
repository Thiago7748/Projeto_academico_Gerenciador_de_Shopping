//->Extends quer dizer que a clase VESTUARIO irá herdar atributos metodos e etc da classe MAE (LOJA)
public class Vestuario extends Loja{

    //atributos
    private boolean produtosImportados;

    //constructor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    //metodos de acesso getters and setters
    public boolean getProdutosImportados(){
        return this.produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    //Sobrescrita do toString
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Produtos Importados: " + produtosImportados;
    }
}
