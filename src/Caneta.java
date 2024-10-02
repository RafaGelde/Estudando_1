public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada = false;

    public void rabisca(){
        if (this.tampada == true)
        {
            System.out.println("Error não posso rabiscar!");
        }
        else {
            System.out.println("Estou Rabiscando");
        }
    }

    public void tampar (){
        this.tampada = true;
    }

    public void destampar (){
        this.tampada = false;
    }
    void status (){
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Carga : " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public boolean isTampada() {
        return tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
