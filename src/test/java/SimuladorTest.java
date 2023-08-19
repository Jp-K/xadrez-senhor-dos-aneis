import Exceptions.PersonagemJaEstaNoMapaException;
import Exceptions.PersonagemNaoEncontradoNoMapaException;
import Exceptions.PosicaoOcupadaException;
import Exceptions.SauronDominaOMundoException;
import Mapa.Mapa;
import Simulador.Simulador;
import org.junit.Assert;
import org.junit.Test;
import Personagens.*;

public class SimuladorTest {
    @Test
    public void deveVencerSociedadeQuandoAragornELegolasBatalharemContraOrcEGoblim() {
        // Início:  "|A|L| | | | | |O| |M|"
        String resultadoEsperado = "| | | | |A| | | | |L|";

        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador();

        mapa.inserir(0, aragorn);
        mapa.inserir(1, legolas);
        mapa.inserir(7, orc);
        mapa.inserir(9, goblim);
        simulador.simular(mapa);

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test
    public void deveVencerSociedadeQuandoGandalfBatalharSozinhoContraSaruman() {
        // Início:  "|G| | | | | | | | |S|"
        String resultadoEsperado = "| | | | | | | | | |G|";

        Gandalf gandalf = new Gandalf();
        Saruman saruman = new Saruman();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador();

        mapa.inserir(0, gandalf);
        mapa.inserir(9, saruman);
        simulador.simular(mapa);

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoInimigosDerrotaremMembrosDaSociedade() {
        // Início: "|A| |I| | | | |U|O|G|"
        // Fim:    "| | | | | | |O|M| | |"

        Aragorn aragorn = new Aragorn();
        Gimli gimli = new Gimli();
        Urukhai urukhai = new Urukhai();
        Orc orc = new Orc();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador();

        mapa.inserir(0, aragorn);
        mapa.inserir(2, gimli);
        mapa.inserir(7, urukhai);
        mapa.inserir(8, orc);
        mapa.inserir(9, goblim);
        simulador.simular(mapa);
    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoLegolasBatalharSozinhoContraOrcEUrukhai() {
        // Início:  "|L| | | | | | | |U|O|"
        // Fim:     "| | | | | |U| | | | |";

        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Urukhai urukhai = new Urukhai();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador();

        mapa.inserir(0, legolas);
        mapa.inserir(8, urukhai);
        mapa.inserir(9, orc);
        simulador.simular(mapa);
    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoBoromirBatalharSozinhoContraUrukhai() {
        // Início:  "|B| | | | | | | | |U|"
        // Fim:     "| | | | |U| | | | | |";

        Boromir boromir = new Boromir();
        Urukhai urukhai = new Urukhai();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador();

        mapa.inserir(0, boromir);
        mapa.inserir(9, urukhai);
        simulador.simular(mapa);
    }

    @Test(expected = PosicaoOcupadaException.class)
    public void deveLancarPosicaoOcupadaExceptionQuandoJaExistirUmPersonagemNoMapa() {

        Boromir boromir = new Boromir();
        Urukhai urukhai = new Urukhai();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador();

        mapa.inserir(0, boromir);
        mapa.inserir(0, urukhai);
    }

    @Test(expected = PersonagemNaoEncontradoNoMapaException.class)
    public void deveLancarPersonagemNaoEncontradoNoMapaExceptionQuandoNaoEncontrarOPersonagemNoMapa() {

        Boromir boromir = new Boromir();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador();

        mapa.inserir(0, boromir);
        mapa.buscarPosicao(1);
    }

    @Test(expected = PersonagemJaEstaNoMapaException.class)
    public void deveLancarPersonagemJaEstaNoMapaExceptionQuandoOPersonagemJaEstiverNoMapa() {

        Boromir boromir = new Boromir();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador();

        mapa.inserir(0, boromir);
        mapa.inserir(1, boromir);
        mapa.buscarPosicao(1);
    }


}
