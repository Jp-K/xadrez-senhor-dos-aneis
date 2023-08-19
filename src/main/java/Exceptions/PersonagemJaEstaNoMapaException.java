package Exceptions;

public class PersonagemJaEstaNoMapaException extends RuntimeException{
    public PersonagemJaEstaNoMapaException() {
        super("personagem já está no mapa");
    }
}
