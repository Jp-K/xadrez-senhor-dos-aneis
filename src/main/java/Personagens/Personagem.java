package Personagens;
import Classes.Classe;
import Mapa.Mapa;
import Racas.*;

public abstract class Personagem {
    private int forca;

    private int agilidade;

    private int inteligencia;

    private int constituicao;

    private boolean isSociedadeAnel;

    private Raca raca;

    private Classe classe;

    public Personagem(int forca, int agilidade, int inteligencia, int constituicao, boolean isSociedadeAnel, Raca raca, Classe classe) {
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.constituicao = constituicao;
        this.isSociedadeAnel = isSociedadeAnel;
        this.raca = raca;
        this.classe = classe;
    }

    public int getForca() {
        return forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public boolean isSociedadeAnel() {
        return isSociedadeAnel;
    }

    public Raca getRaca() {
        return raca;
    }

    public Classe getClasse() {
        return classe;
    }

    public void fazerAcao(Mapa mapa) {
        this.classe.fazerAcao(this, mapa);
    }
}
