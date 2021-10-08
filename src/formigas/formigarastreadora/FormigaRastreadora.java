package formigas.formigarastreadora;

public class FormigaRastreadora {
    public String tipoFormi;
    public int idFormi;

    public FormigaRastreadora(String tipoForm, int idForm) {
        this.tipoFormi = tipoForm;
        this.idFormi = idForm;
    }

    public String getTipo() {
        return tipoFormi;
    }
    public int idForm() {
        return idFormi;
    }
}
