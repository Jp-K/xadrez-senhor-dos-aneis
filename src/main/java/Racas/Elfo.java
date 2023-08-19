package Racas;

public class Elfo extends Raca{
    private String frase;

    private String fraseElfica;

    public Elfo(String frase, String fraseElfica) {
        this.frase = frase;
        this.fraseElfica = fraseElfica;
    }

    public String falar() {
        return frase;
    }

    public String falarElfico() {
        return fraseElfica;
    }
}
