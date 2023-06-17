package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaoDoceTest {

    @Test
    public void deveRetornarPromocaoAtiva(){
        PaoDoce paoDoce = new PaoDoce();
        paoDoce.setKg(5.00);

        assertEquals("promocao ativa.", paoDoce.verificarPromocao());
    }

    @Test
    public void deveRetornarPromocaoNaoAtiva(){
        PaoDoce paoDoce = new PaoDoce();
        paoDoce.setKg(1.00);

        assertEquals("promocao nao ativa.", paoDoce.verificarPromocao());
    }

    @Test
    public void deveRetornarInfo(){
        PaoDoce paoDoce = new PaoDoce();
        paoDoce.setId(1);
        paoDoce.setKg(1);
        paoDoce.setNome("Pao doce");

        assertEquals( "Pao doce"+"{" +
                "id =" + 1 +
                ", nome='" + "Pao doce" + '\'' +
                ", preco=" + 1.5 +
                '}', paoDoce.getInfo());



    }


}