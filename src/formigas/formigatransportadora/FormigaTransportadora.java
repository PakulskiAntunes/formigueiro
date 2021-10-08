package formigas.formigatransportadora;

public class FormigaTransportadora {
    public String tipoFormi;
    public int idFormi;

    public FormigaTransportadora(String tipoFormi, int idFormi) {
        this.tipoFormi = tipoFormi;
        this.idFormi = idFormi;
    }

    public String getTipo() {
        return tipoFormi;
    }
    public int idFormi() {
        return idFormi;
    }
    
}
