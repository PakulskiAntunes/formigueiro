package formigueiro;

public class Formigueiro {
    public String formigueiro;
    public int capacidade;
    
    public Formigueiro() {
        this.formigueiro = "F";
        this.capacidade = 0;
    }
    
    public String getFormigueiro() {
        return formigueiro;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capaci){
        capacidade+=capaci;
    }
}
