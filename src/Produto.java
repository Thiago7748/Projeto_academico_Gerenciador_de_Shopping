public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataParaComparar) {
        int anoValidade = this.dataValidade.getAno();
        int mesValidade = this.dataValidade.getMes();
        int diaValidade = this.dataValidade.getDia();

        int anoComparar = dataParaComparar.getAno();
        int mesComparar = dataParaComparar.getMes();
        int diaComparar = dataParaComparar.getDia();

        if (anoValidade < anoComparar) {
            return true;
        } else if (anoValidade == anoComparar) {
            if (mesValidade < mesComparar) {
                return true;
            } else if (mesValidade == mesComparar) {
                if (diaValidade < diaComparar) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return this.preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    public Data getDataValidade() {
        return this.dataValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Preço: R$" + String.format("%.2f", preco) + "\n" +
                "Data de Validade: " + dataValidade;

    }
}