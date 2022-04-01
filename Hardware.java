

public class Hardware {



    private int id;
    private String descricao;
    private String valor;
    private  String fabricante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public String getDetalhesHardware () {
        return "Id: " + getId() + "/n" +
                "Descrição: " + getDescricao() + "/n" +
                "Valor: " + getValor() + "/n" +
                "Fabricante: " + getFabricante() + "/n" ;



    }


}
