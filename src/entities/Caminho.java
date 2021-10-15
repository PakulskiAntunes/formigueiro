package entities;

public class Caminho {
    public int posX;
    public int posY;
    public String caminho;

    public Caminho(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        caminho = "  #  ";
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String getCaminho() {
        return caminho;
    }
    
}
