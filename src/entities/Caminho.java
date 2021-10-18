package entities;

public class Caminho {
    public Campo campo;
    public Formigueiro formigueiro;
    public Reservatorio reservatorio;
    public int posAtualX = 0;
    public int posAtualY = 0;
    public int posAntX;
    public int posAntY;

    public Caminho(Campo campo, Formigueiro formigueiro) {
        this.campo = campo;
        this.formigueiro = formigueiro;
        this.posAtualX = formigueiro.posX;
        this.posAtualY = formigueiro.posY;
        this.posAntX = formigueiro.posX;
        this.posAntY = formigueiro.posY;
    }

    public void reservaProxima() {
        int posX;
        int posY;
        int menorX;
        int menorY;
        int menorPX= menorPX = campo.getListaPosX(1) - formigueiro.posX;
        int menorPY=0;

        for (int x = 0; x < campo.positionX.size(); x++) {
            for (int y = 0; y < campo.positionY.size(); y++) {
                menorX = campo.getListaPosX(x) - formigueiro.posX;
                menorY = campo.getListaPosY(y) - formigueiro.posY;
                if (campo.getListaPosX(x + 1) <= campo.positionX.size()) {
                    menorPX = campo.getListaPosX(x + 1) - formigueiro.posX;
                    menorPY = campo.getListaPosY(y + 1) - formigueiro.posY;
                }
                if (menorX < 0) {
                    if (menorY < 0) {
                        if (menorX <= menorPX) {
                            if (menorY <= menorPY) {
                                posX = campo.getListaPosX(x);
                                posY = campo.getListaPosY(y);
                            }                            
                        }
                    }
                }
            }
        }
    }
}
