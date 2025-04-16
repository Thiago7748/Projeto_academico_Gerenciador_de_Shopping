public class Endereco{

    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void setNomeDaRua(String nomeDaRua){
        this.nomeDaRua = nomeDaRua;
    }
    public String getNomeDaRua(){
        return this.nomeDaRua;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return this.cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return this.estado;
    }

    public void setPais(String pais){
        this.pais = pais;
    }
    public String getPais(){
        return this.pais;
    }

    public void setCep(String cep){
        this.cep = cep;
    }
    public String getCep(){
        return this.cep;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumero(){
        return this.numero;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public String getComplemento(){
        return this.complemento;
    }

    @Override
    public String toString() {
        return "Nome rua: " + nomeDaRua + "\n" +
                "Cidade: " + cidade + "\n" +
                "Estado: " + estado + "\n" +
                "Pais: " + pais + "\n" +
                "Cep: " + cep + "\n" +
                "Número: " + numero + "\n" +
                "Complemento: " + complemento;
    }
}