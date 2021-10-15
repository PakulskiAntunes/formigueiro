package entities;

public class Formigueiro {
    public int capacidade;
    public int capacidadeMax;
    public int posX = 0;
    public int posY = 0;
    public Campo campo;
    
    public Formigueiro(Campo campo) {
        this.campo = campo;
        posX = campo.getLinhas() / 2;
        posY = campo.getColunas() / 2;
        campo.campo[posX][posY] = campo.formigueiro;
        this.capacidade = 0;
        this.capacidadeMax = 200;
    }

    public void center() {
        campo.campo[posX][posY] = campo.formigueiro;        
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
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
