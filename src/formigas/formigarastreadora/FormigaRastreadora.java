package formigas.formigarastreadora;

public class FormigaRastreadora {
    public String tipoForm;
    public int idForm;

    public FormigaRastreadora(String tipoForm, int idForm) {
        this.tipoForm = tipoForm;
        this.idForm = idForm;
    }

    public String getTipo() {
        return tipoForm;
    }
    public int idForm() {
        return idForm;
    }
}
