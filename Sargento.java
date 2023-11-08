import java.util.ArrayList;

public class Sargento {
    private Militar informacao;
    private ArrayList<Cabo> subordinados;

    public Sargento(Militar informacao) {
        this.informacao = informacao;
        this.subordinados = new ArrayList<>();
    }

    public Militar getInformacao() {
        return informacao;
    }

    public void setInformacao(Militar informacao) {
        this.informacao = informacao;
    }

    public void realocaSubordinados(Cabo cabo){
        cabo.setImediatoDele(this);
        if (!this.subordinados.contains(cabo)) {
            subordinados.add(cabo);
        }
    }

    @Override
    public String toString(){
        return "subordinados do Sargento: " + subordinados;
    }
}
