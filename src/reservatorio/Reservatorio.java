package reservatorio;

import java.util.Random;

public class Reservatorio {
    public String reserva;
    public int capacidade;

    // criar quantidade aleatoria de carga
    Random gera = new Random();
    int capaci=gera.nextInt(80);

    public Reservatorio() {
        this.reserva = "R";
        capacidade = capaci;
    }

    public String getReserva() {
        return reserva;
    }

    public int getCapac() {
        return capacidade;
    }

    public void setCapac(int capaci) {
        capacidade -= capaci;
    }
}
