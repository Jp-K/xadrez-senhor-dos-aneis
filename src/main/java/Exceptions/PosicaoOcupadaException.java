package Exceptions;

public class PosicaoOcupadaException extends RuntimeException{
    public PosicaoOcupadaException() {
        super("Já existe um personagem nesta posição");
    }
}
