public class App {
    public static void main(String[] args) throws Exception {
        Militar militarA = new Militar("André", 001);
        Soldado soldadoA = new Soldado(militarA);

        Militar militarB = new Militar("Thiago", 003);
        Soldado soldadoB = new Soldado(militarB);

        Militar militarC = new Militar("Paulo", 015);
        Cabo caboC = new Cabo(militarC);

        Militar militarD = new Militar("James", 030);
        Cabo caboD = new Cabo(militarD);


        caboC.realocaSubordinado(soldadoB); //vai ver se o caboC tem os subordinados soldadoB, se nao tiver ele vai adicionar, no caso realocar
        soldadoB.setImediato(caboC); //se nao for o mesmo imediato ele vai trocar, estou verificando se o soldadoB possui o imediatoC


        Militar militarE = new Militar("guilherme", 012);
        Sargento sargentoE = new Sargento(militarE);

        sargentoE.realocaSubordinados(caboD);
        caboD.setImediatoDele(sargentoE);


        System.out.println(militarA);
        System.out.println(militarB);
        System.out.println(militarC);
        System.out.println(militarD);
        System.out.println(militarE);

    }
}
