import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cabo {
    private Militar informacao;
    private Sargento imediatoDele;
    private ArrayList<Soldado> subordinados; //aqui vou guardar uma lista de soldados que sao subordinados do cabo


    public Cabo(Militar informacao) {
        this.informacao = informacao;
        this.subordinados = new ArrayList<>(); //inicializar o arrayList 
    }

    public Militar getInformacao() {
        return informacao;
    }

    public void setInformacao(Militar informacao) {
        this.informacao = informacao;
    }

    //tem que colocar o get dele dele pq nao tem la na classe de Militar
    public Sargento getImediatoDele(){
        return imediatoDele;
    }

    //sempre que uso ArrayList eu faço isso, o "get" do array
    public List<Soldado> getSubordinados(){
        return List.copyOf(subordinados);
    }

    //caso troque de imediato, os subordinados do antigo imediato agora serao do novo imediato
    public void realocaSubordinado(Soldado soldado){
        soldado.setImediato(this);
        if (!this.subordinados.contains(soldado)) { //se esses subordinados (de cabo) nao tiverem soldados, 
            subordinados.add(soldado); //os subordinados do cabo agora terao soldados
        } //basicamente, se esse cabo (this) nao tiver nenhum soldado(subordinado), agora ele vai passar a ter.
    }


    //fazendo o mesmo qur fiz em soldados
    //caso mude de imediato
    public void setImediatoDele(Sargento imediatoDele){
        if (!(Objects.equals(this.imediatoDele, imediatoDele))) {
            this.imediatoDele = imediatoDele;
            this.imediatoDele.realocaSubordinados(this);
        }
    }

    @Override
    public String toString() {
        return "Quantidade de subordinados: " + subordinados + "\n" + "imediato do cabo: " + imediatoDele;
    }

}
