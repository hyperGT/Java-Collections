package Collections.Lists.Exercicio;

public class TemperaturaSemestral {

    private String mes;
    private Double temperaturaMedia;

    public TemperaturaSemestral(String mes, Double temperaturaMedia) {
        this.mes = mes;
        this.temperaturaMedia = temperaturaMedia;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    @Override
    public String toString() {
        return "TemperaturaSemestral{" +
                "mes='" + mes + '\'' +
                ", temperaturaMedia=" + temperaturaMedia +
                '}';
    }
}
