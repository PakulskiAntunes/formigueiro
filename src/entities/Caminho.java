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

    public void caminhaForm(int enderecoX, int enderecoY, int Formiga) {
        int fim = 0;
        boolean sobiOuDesce = false;
        int counter = 0;

        do {
            System.out.println("Counter: " + counter + " | Atual (" + posAtualX + "," + posAtualY + ") | Destino ("
                    + enderecoX + "," + enderecoY + ")" + " | Anterior (" + posAntX + "," + posAntY + ")");
            if (!sobiOuDesce) {

            }
        } while (fim == 0);

    }
    
    public boolean precisaSubir(int destinoX) {
        return posAtualX > destinoX;
    }

    public boolean precisaDescer(int destinoX) {
        return posAtualX < destinoX;
    }

    public boolean precisaDireita(int destinoY) {
        return posAtualY < destinoY;
    }

    public boolean precisaEsquerda(int destinoY) {
        return posAtualY > destinoY;
    }

    public int sobe(int posAtualX, int posAtualY, int qualFormiga) {
        if (posAtualX - 1 >= 0) {
            if (campo.verificaCelula(posAtualX - 1, posAtualY)) {
                this.posAntX = posAtualX;
                this.posAntY = posAtualY;
                this.posAtualX = posAtualX - 1;
                campo.campo[this.posAtualX][posAtualY] = qualFormiga;
                return -1;
            }
            return campo.verificaStatus(posAtualX - 1, posAtualY);
        }
        return 0;
    }

    public int desce(int posAtualX, int posAtualY, int qualFormiga) {
        if (posAtualX + 1 < campo.getLinhas()) {
            if (campo.verificaCelula(posAtualX + 1, posAtualY)) {
                this.posAntX = posAtualX;
                this.posAntY = posAtualY;
                this.posAtualX = posAtualX + 1;
                if (campo.verificaStatus(posAntX, posAtualY) != campo.formigueiro) {
                    campo.campo[posAntX][posAntY] = campo.caminho;
                }
                campo.campo[this.posAtualX][posAtualY] = qualFormiga;
                return -1;
            }
            return campo.verificaStatus(posAtualX + 1, posAtualY);
        }
        return 0;
    }

    public int direita(int posAtualX, int posAtualY, int qualFormiga) {
        if (posAtualY + 1 < campo.getLinhas()) {
            if (campo.verificaCelula(posAtualX, posAtualY + 1)) {
                this.posAntX = posAtualX;
                this.posAntY = posAtualY;
                this.posAtualY = posAtualY + 1;
                if (campo.verificaStatus(posAntX, posAntY) == qualFormiga) {
                    campo.campo[posAntX][posAntY] = campo.caminho;
                }
                campo.campo[posAtualX][this.posAntY] = qualFormiga;
                return -1;
            }
            this.posAtualY = posAtualY + 1;
            return campo.verificaStatus(posAtualX, posAtualY + 1);
        }
        return 0;
    }

    public int esquerda(int posAtualX, int posAtualY, int qualFormiga) {
        if (posAtualY - 1 >= 0) {
            if (campo.verificaCelula(posAtualX, posAtualY - 1)) {
                this.posAntX = posAtualX;
                this.posAntY = posAtualY;
                this.posAtualY = posAtualY - 1;
                campo.campo[posAtualX][this.posAtualY] = qualFormiga;
                return -1;
            }
            this.posAtualY = posAtualY - 1;
            return campo.verificaStatus(posAtualX, posAtualY - 1);
        }
        return 0;
    }
    
    public void rastro(){
        boolean naoOcupaFormigueiro = !(formigueiro.posX == this.posAntX) & !(formigueiro.posY == this.posAntX);
        if (naoOcupaFormigueiro) {
            campo.campo[this.posAntX][this.posAntY] = campo.caminho;            
        }
    }
        
}