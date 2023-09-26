package com.mycompany.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoa {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2000,1,1)));
    }

    @AfterEach
    void removeDados(){
        BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2000,1,1)));
    }

    @Test
    void validarRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void fnalizaConexao(){
        BancoDeDados.finalizarConexao();
    }

}
