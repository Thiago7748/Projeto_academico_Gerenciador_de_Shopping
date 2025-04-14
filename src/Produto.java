public class Produto{

    //atributos
    private String nome;
    private double preco;
    private Data dataValidade;

    //construtores
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataParaComparar) {
        // Pega os componentes da data de validade do produto (this)
        int anoValidade = this.dataValidade.getAno();
        int mesValidade = this.dataValidade.getMes();
        int diaValidade = this.dataValidade.getDia();

        // Pega os componentes da data recebida como parâmetro
        int anoComparar = dataParaComparar.getAno();
        int mesComparar = dataParaComparar.getMes();
        int diaComparar = dataParaComparar.getDia();

        // Compara ano, depois mês, depois dia
        if (anoValidade < anoComparar) {
            return true; // Vencido (ano anterior)
        } else if (anoValidade == anoComparar) {
            // Anos iguais, compara o mês
            if (mesValidade < mesComparar) {
                return true; // Vencido (mês anterior no mesmo ano)
            } else if (mesValidade == mesComparar) {
                // Anos e meses iguais, compara o dia
                if (diaValidade < diaComparar) {
                    return true; // Vencido (dia anterior no mesmo mês e ano)
                }
            }
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

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    public Data getDataValidade(){
        return this.dataValidade;
    }

    //metodo toString
    @Override
    public String toString(){
        return "Nome: " + nome + "\n" +
                "Preço: R$" + String.format("%.2f", preco);
    }
}