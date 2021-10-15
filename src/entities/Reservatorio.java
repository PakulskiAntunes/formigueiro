package entities;

import java.util.Random;

public class Reservatorio {
    public Campo campo;
    public String reserva;
    public int capacidade;
    public int posX;
    public int posY;
    public int quantReservas = 4;
    private int nome;
    
    // criar quantidade aleatoria de carga
    Random gera = new Random();
    int capaci = gera.nextInt(120);
    
    public Reservatorio(Campo campo) {
        this.campo = campo;
        this.nome = campo.reservatorio;
    }
    public void sortearReserva(Campo campo) {
        for (int x = 0; x < quantReservas; x++) {
            Random random = new Random();
            int i = random.nextInt(campo.getLinhas()) + 0;
            int j = random.nextInt(campo.getColunas()) + 0;
            if (campo.verificaCelula(i, j)) {
                campo.defineCell(i, j, nome);
            } else {
                x--;
            }
        }
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
