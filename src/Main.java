public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();

        c1.cor = "Vermelha";
        c2.cor = "Azul";

        c1.ponta = 0.5F;
        c2.ponta = 0.8F;

        c1.carga = 67;
        c2.carga = 94;

        c1.tampada = false;
        c2.tampada = false;

        c2.destampar();
        c1.tampar();
        c1.status();

        c1.rabisca();
        c2.rabisca();
    }
}