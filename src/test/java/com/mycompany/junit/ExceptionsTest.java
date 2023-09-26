package com.mycompany.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarTransferencia(){
        TransferenciaEntreContas t1 = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            t1.transfere(-1);
        });

        Assertions.assertDoesNotThrow(() -> {
            t1.transfere(200);
        });
    }
}
