
public class Memoria extends Hardware {


    private String frequencia;
    private String capacidade;
    private String tipo;

    public Memoria() {

    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Memoria(String frequencia, String capacidade, String tipo) {
        this.frequencia = frequencia;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }
    public  String getDetalhesHardware() {
        return super.getDetalhesHardware() +
                "Frequência: " + getFrequencia() + "/n" +
                "Capacidade: " + getCapacidade() + "/n" +
                "Tipo: " + getTipo() + "/n/n";

    }
}
