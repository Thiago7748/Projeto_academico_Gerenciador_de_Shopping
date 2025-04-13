public class Loja {

    // atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    // metodos construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
    }

    // getters e setters
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

    /* Métodos Comuns (ou Métodos de Instância):
    Têm nomes descritivos que indicam o que eles fazem(gastosComSalario,getNome, setNome, etc.).
    Possuem um tipo de retorno (como double, char, String, int, ou void)
    São usados para realizar ações, cálculos ou fornecer informações sobre um objeto que já existe.*/

    // metodo comum sem parametro
    public double gastosComSalario(){
        if (this.salarioBaseFuncionario == -1){
            return -1.0;
        } else {
            return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
        }
    }

    // metodo comum sem parametro
    public char tamanhoDaLoja(){
        if (this.quantidadeFuncionarios < 10){
            return 'P';
        } else if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30){
            return 'M';
        } else {
            return 'G';
        }
    }

    // metodo toString
    @Override
    public String toString() {
        return "Loja: " + nome + "\n" +
                "Quantidade de Funcionários: " + quantidadeFuncionarios + "\n" +
                "Salário Base Funcionário: R$" + String.format("%.2f", salarioBaseFuncionario);
    }
}