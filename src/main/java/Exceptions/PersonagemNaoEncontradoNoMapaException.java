package Exceptions;

public class PersonagemNaoEncontradoNoMapaException extends NullPointerException{
    public PersonagemNaoEncontradoNoMapaException() {
        super("O personagem não foi encontrado");
    }
}
