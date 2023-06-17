package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaoDeFormaTest {

    @Test
    public void deveRetornarPromocaoAtiva(){
        PaoDeForma paoDeForma = new PaoDeForma();
        paoDeForma.setKg(7.00);

        assertEquals("promocao ativa.", paoDeForma.verificarPromocao());
    }

    @Test
    public void deveRetornarPromocaoNaoAtiva(){
        PaoDeForma paoDeForma = new PaoDeForma();
        paoDeForma.setKg(1.5);

        assertEquals("promocao nao ativa.", paoDeForma.verificarPromocao());
    }

    @Test
    public void deveRetornarInfoPaoDeForma(){
        PaoDeForma paoDeForma = new PaoDeForma();
        paoDeForma.setId(2);
        paoDeForma.setKg(2);
        paoDeForma.setNome("pao de forma panco");

        assertEquals("Pao de forma"+"{" +
                "id =" + 2 +
                ", nome='" + "pao de forma panco" + '\'' +
                ", preco=" + 3.0 +
                '}', paoDeForma.getInfo());
    }


}