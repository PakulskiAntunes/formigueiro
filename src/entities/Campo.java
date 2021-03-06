package entities;

import java.util.ArrayList;

public class Campo {

    private int linhas = 15;
    private int colunas = 20;
    public int campo[][] = new int[linhas][colunas];
    public int vazio = 1;
    public int formigueiro = 2;
    public int reservatorio = 3;
    public int obstaculo = 4;
    public int caminho = 5;
    public int formigaRastreadora = 6;
    public int formigaCortadora = 7;
    public int formigaTransportadora = 8;
    public int todasFormigasEReservatorio = 9;
    public int formigaRastreadoraEReservatorio = 10;
    public int formigaRastreadoraECortadoraEReservatorio = 11;
    public int formigaTransportadoraEAlimento = 12;
    public int formigaCortadoraEAlimento = 13;
    public int reservatorioSemEstoque = 14;
    public int formigueiroRastreadora = 15;
    public int formigueiroCortadora = 16;
    public int formigueiroTransportadora = 17;

    ArrayList<Integer> positionX=new ArrayList<Integer>();
    ArrayList<Integer> positionY=new ArrayList<Integer>();

    public Campo() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                this.campo[i][j] = vazio;
            }
        }
    }

    public boolean verificaCelula(int i, int j) {
        if (campo[i][j] == vazio) {
            return true;
        } else {
            return false;
        }
    }

    public int verificaStatus(int i, int j) {
        return campo[i][j];
    }

    public void defineCell(int i, int j, int valor) {
        this.campo[i][j] = valor;
        positionX.add(i);
        positionY.add(j);
    }

    public int getListaPosX(int i) {
        return positionX.get(i);
    }

    public int getListaPosY(int i) {
        return positionY.get(i);
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public String imprimeCampo() {
        String legenda = "\n\nR = Reservatorio | - = Obstaculo | F = Formigueiro | # = Caminho " +
                "| Y = Formiga Rastreadora | W = Formiga Cortadora | \nT = Formiga transportadora | A = Alimento | R V = Reservatorio sem estoque\n\n";
        String textReturn = "";
        for (int i = 0; i < linhas; i++) {
            textReturn += "|";
            for (int j = 0; j < colunas; j++) {
                switch (campo[i][j]) {
                    case 1: //vazio
                        textReturn += "        ";
                        break;
                    case 2: //formigueiro
                        textReturn += "   F    ";
                        break;
                    case 3: //reservatorio
                        textReturn += " R      ";
                        break;
                    case 4: //obstaculo
                        textReturn += "   -    ";
                        break;
                    case 5: //caminho
                        textReturn += "   #    ";
                        break;
                    case 6: //Formiga Rastreadora
                        textReturn += "   Y    ";
                        break;
                    case 7: //Formiga Cortadora
                        textReturn += "   W    ";
                        break;
                    case 8: //Formiga Transportadora
                        textReturn += "   T    ";
                        break;
                    case 9: //TodasAsFormigas
                        textReturn += "R W T Y ";
                        break;
                    case 10: //formiga rastreadora e reservatorio
                        textReturn += "  R Y   ";
                        break;
                    case 11: //rastreadora, cortadora e reservatorio
                        textReturn += " R Y W  ";
                        break;
                    case 12: //formiga transportadora e alimento
                        textReturn += "   T A  ";
                        break;
                    case 13: //Formiga cortadora e alimento
                        textReturn += "   W A  ";
                        break;
                    case 14: //Formigueiro e Rastreadora
                        textReturn += "  F Y   ";
                        break;
                    case 15: //Formigueiro e Cortadora
                        textReturn += "  F W   ";
                        break;
                    case 16: //Formigueiro e Transportadora
                        textReturn += "  F T   ";
                        break;
                }
                textReturn += "|";
            }
            textReturn += "\n";
        }
        return legenda + textReturn;
    }  
}