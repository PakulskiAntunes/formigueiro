package formigas.formigacortadora;

public class FormigaCortadora {
    public String tipoFormi;
    public int idFormi;

    public FormigaCortadora(String tipoFormi, int idFormi) {
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
