public class Produto{

    //atributos
    private String nome;
    private double preco;

    //construtores
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    //getters and setters

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }

    //metodo toString
    @Override
    public String toString(){
        return "Nome: " + nome + "\n" +
                "Preço: R$" + String.format("%.2f", preco);
    }
}