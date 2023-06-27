package org.factoriaf5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }
    @Test
    void testImc(){
        float pesoKg = 80.0f;
        float estaturaCm = 180f;
        float esperado = 24.69f;
        float obtenido = Imc.computeImc(pesoKg, estaturaCm);
        assertEquals(esperado, obtenido);
    }
    @Test
    void testgetImcDelgadezSevera(){
        float imc = 14f;
        String esperado = "Delgadez severa";
        String obtenido = Imc.getImcString(imc);
        assertEquals(esperado, obtenido);
    }
    @Test
    void testgetImcDelgadezLeve(){
        float imc = 17.5f;
        String esperado = "Delgadez leve";
        String obtenido = Imc.getImcString(imc);
        assertEquals(esperado, obtenido);
    }
    @Test
    void testgetImcSobrepeso(){
        float imc = 25.5f;
        String esperado = "Sobrepeso";
        String obtenido = Imc.getImcString(imc);
        assertEquals(esperado, obtenido);
    }
    @Test
    void testgetImcObesidadMorbida(){
        float imc = 45.5f;
        String esperado = "Obesidad morbida";
        String obtenido = Imc.getImcString(imc);
        assertEquals(esperado, obtenido);
    }
}
