package com.mycompany.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa vitor = new Pessoa("Vitor", LocalDate.of(1995,7,7));
        Assertions.assertEquals(28, vitor.getIdade());
    }

    @Test
    void deveRetornarSeForMaiorDeIdade(){
        Pessoa vitor = new Pessoa("Vitor", LocalDate.of(1995,7,7));
        Assertions.assertTrue(vitor.eMaiorDeIdade());
    }
}
