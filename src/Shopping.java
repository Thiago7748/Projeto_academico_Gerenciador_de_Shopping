import java.util.Arrays;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    private int quantidadeMaxLojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeMaxLojas = quantidadeMaxLojas;
        this.lojas = new Loja[quantidadeMaxLojas];
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public int getQuantidadeMaxLojas() {
        return quantidadeMaxLojas;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        // Verifica se o tipo é válido
        if (!tipo.equals("Cosmético") && !tipo.equals("Vestuário") &&
                !tipo.equals("Bijuteria") && !tipo.equals("Alimentação") &&
                !tipo.equals("Informática")) {
            return -1;
        }

        int contador = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                if ((tipo.equals("Cosmético") && loja instanceof Cosmetico) ||
                        (tipo.equals("Vestuário") && loja instanceof Vestuario) ||
                        (tipo.equals("Bijuteria") && loja instanceof Bijuteria) ||
                        (tipo.equals("Alimentação") && loja instanceof Alimentacao) ||
                        (tipo.equals("Informática") && loja instanceof Informatica)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaComMaiorSeguro = null;
        double maiorValorSeguro = 0;

        for (Loja loja : lojas) {
            if (loja != null && loja instanceof Informatica) {
                Informatica lojaInfo = (Informatica) loja;
                double valorSeguro = lojaInfo.getSeguroEletronicos();

                if (lojaComMaiorSeguro == null || valorSeguro > maiorValorSeguro) {
                    lojaComMaiorSeguro = lojaInfo;
                    maiorValorSeguro = valorSeguro;
                }
            }
        }

        return lojaComMaiorSeguro;
    }

    @Override
    public String toString() {
        return "Shopping: " + nome + "\n" +
                "Endereço: " + endereco + "\n" +
                "Quantidade máxima de lojas: " + quantidadeMaxLojas + "\n" +
                "Lojas: " + Arrays.toString(lojas);
    }
}

