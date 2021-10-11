package reservatorio;

import java.util.Random;

public class Reservatorio {
    public String reserva;
    public int capacidade;
    public int posX;
    public int posY;

    // criar quantidade aleatoria de carga
    Random gera = new Random();
    int capaci=gera.nextInt(120);

    public Reservatorio(int posX,int posY) {
        this.posX=posX;
        this.posY=posY;
        reserva = "  R";
        capacidade = capaci;
    }

    public String getReserva() {
        return reserva;
    }

    public int getCapac() {
        return capacidade;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setCapac(int capaci) {
        capacidade -= capaci;
    }

    public String toString() {
        return " está com " + capacidade + " de Alimentos";
    }
}
