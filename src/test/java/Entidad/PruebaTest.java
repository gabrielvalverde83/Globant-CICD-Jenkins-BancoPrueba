package Entidad;

import Entidades.Prueba;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class PruebaTest {
    @Test
    public void instanciaTest() {
        Prueba prueba = new Prueba();
        assertTrue(prueba instanceof Prueba );
    }


}