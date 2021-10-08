package formigas.formigatransportadora;

public class FormigaTransportadora {
    public String tipoFormi;
    public int cargaFormi;

    public FormigaTransportadora() {
        this.tipoFormi = "Ft";
        this.cargaFormi = 0;
    }

    public String getTipo() {
        return tipoFormi;
    }
    public int getCarga() {
        return cargaFormi;
    }

    public void setCarga(int cargaFormi) {
        this.cargaFormi = cargaFormi;
    }
    
}
