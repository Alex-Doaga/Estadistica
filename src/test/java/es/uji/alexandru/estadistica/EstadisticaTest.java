package es.uji.alexandru.estadistica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {

    @Test
    @DisplayName("Test de la media")
    void mediaAritmetica() {
        Estadistica obj=new Estadistica();
        double vectorPrueba1=[1,2,3,4];
        double vectorPrueba2=[5,5,5,5];
        assertEquals(2.5,obj.mediaAritmetica(vectorPrueba1));
        assertEquals(5,obj.mediaAritmetica(vectorPrueba2));

    }

    @Test
    @DisplayName("Test de la varianza")
    void varianza() {
    }

    @Test
    @DisplayName("Test de la desviación estándar")
    void desviacionEstandar() {
    }
}