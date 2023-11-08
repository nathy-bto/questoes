public class Militar {
    private String nome;
    private int numeroIdentificacao;
    private int tempoServico;

    public Militar(String nome, int numeroIdentificacao){
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.tempoServico = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void tempoServico(){
        this.tempoServico++;
    }

    @Override
    public String toString(){
        return "nome do militar: "+ nome +"\n" + "número de identificação: " + numeroIdentificacao + "\n" + "tempo de serviço: " + tempoServico;
    }

}
