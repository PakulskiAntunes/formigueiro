package formigueiro;

public class Formigueiro {
    public String formigueiro;
    public int capacidade;
    public int capacidadeMax;
    
    public Formigueiro() {
        this.formigueiro = "F";
        this.capacidade = 0;
        this.capacidadeMax = 200;
    }
    
    public String getFormigueiro() {
        return formigueiro;
    }
    public int getCapacidade(){
        return capacidade;
    }

    public int getCapcMax() {
        return capacidadeMax;
    }

    public void setCapacidade(int capaci) {
        capacidade += capaci;
    }

    public String toString() {
        
        int aux = (capacidade * 100) / capacidadeMax;
        return "Formigueiro está com " + capacidade +" isso corresponde a "+ aux+"% de Capacidade";
    }
}
