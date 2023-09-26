package com.mycompany.junit;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//ordem como discriminada nos metodos teste
//@TestMethodOrder(MethodOrderer.Random.class)
//ordem aleatoria
@TestMethodOrder(MethodOrderer.DisplayName.class)
//Mostra uma descrição para o teste
public class OrdenandoTestes {

    @DisplayName("Teste que faz uma validação X")
    @Order(4)
    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }
    @Order(3)
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }
    @Order(2)
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }
    @Order(1)
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}
