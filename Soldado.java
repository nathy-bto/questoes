import java.util.Objects;

public class Soldado {
    private Militar informacao;
    private Cabo imediato; //aqui nao precisa ser um arrayList pois varios subordinados tem so um imediato


    public Soldado(Militar informacao){
        this.informacao = informacao;
    }

    public Militar getInformacao(){
        return informacao;
    } 
    public void setInformacao(){
        this.informacao = informacao;
    }

    //quando um imediato é trocado, os subordinados precisam ser removidos do imediato antigo
    public void setImediato(Cabo imediato){ 
        if (!(Objects.equals(this.imediato, imediato))) { //se nao for o mesmo imediato entra na condicao
            this.imediato = imediato; //agora eu to recebendo o novo imediato, aquele que nao era igual 
            this.imediato.realocaSubordinado(this); //agora esse novo imediato recebe os subordinados nessa funcao realocaSubordinados
        }

    }

    @Override
    public String toString() {
        return "Imediato do soldado: " + imediato;
    }


}
