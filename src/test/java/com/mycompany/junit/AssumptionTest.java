package com.mycompany.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class AssumptionTest {

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.MAC, OS.LINUX })
    @EnabledOnJre(JRE.JAVA_20)
    void validarUsuario(){
        Assertions.assertEquals(10, 5+5);
    }
}
