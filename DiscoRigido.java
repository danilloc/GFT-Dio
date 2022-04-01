public class DiscoRigido extends Hardware {

    private int Capacidade;
    private int velocidade;
    private String tipo;

    public DiscoRigido() {

    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public DiscoRigido(int capacidade, int velocidade, String tipo) {
        Capacidade = capacidade;
        this.velocidade = velocidade;
        this.tipo = tipo;
    }
    public  String getDetalhesHardware() {
        return super.getDetalhesHardware() +
                "Capacidade: " + getCapacidade() + "/n" +
                "Velocidade: " + getVelocidade() + "/n" +
                "Tipo: " + getTipo() + "/n/n";
    }
}
