public class Data{

    //atributos
    private int dia;
    private int mes;
    private int ano;

    // metodo comum sem parametro
    public boolean verificaAnoBissexto(){
        boolean condicao1 = (this.ano % 4 == 0) && (this.ano % 100 != 0);
        boolean condicao2 = (this.ano % 400 == 0);
        return condicao1 || condicao2;
    }   /*Um ano é bissexto se UMA das seguintes condições for verdadeira:
        É divisível por 4 E NÃO é divisível por 100.
        É divisível por 400.*/

    //construtor
    public Data(int dia, int mes, int ano) {
        boolean dataValida = true;
        int diasNoMes = 0; // Inicializa com 0

        // Validação básica do mês e ano
        if (mes < 1 || mes > 12 || ano <= 0) {
            dataValida = false;
        } else {
            // Determina os dias no mês (precisa do ano para bissexto)
            if (mes == 2) { // Fevereiro
                // Verifica se o ano fornecido (parâmetro 'ano') é bissexto
                boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                if (ehBissexto) {
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasNoMes = 30;
            } else {
                diasNoMes = 31;
            }

            // Valida o dia
            if (dia < 1 || dia > diasNoMes) {
                dataValida = false;
            }
        }

        // Atribuição final baseada na validação
        if (dataValida) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Erro: A data " + dia + "/" + mes + "/" + ano + " é inválida. Atribuindo data padrão 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    //getters and setters
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia(){
        return this.dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }
    public int getMes(){
        return this.mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }

    // metodo toString no formato dia/mes/ano
    @Override
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}