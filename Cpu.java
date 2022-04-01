
public class Cpu extends Hardware {

    private int Clock;
    private String modelo;

    public Cpu() {

    }


    public int getClock() {
        return Clock;
    }

    public void setClock(int clock) {
        Clock = clock;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cpu(int clock, String modelo) {
        Clock = clock;
        this.modelo = modelo;
    }

    public  String getDetalhesHardware() {
        return super.getDetalhesHardware() +
                "Clock: " + getClock() + "/n" +
                "Modelo: " + getModelo() + "/n";

    }
}
