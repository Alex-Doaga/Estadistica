package es.uji.alexandru.estadistica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {

    @Test
    @DisplayName("Test de la media")
    void mediaAritmetica() {
        Estadistica obj=new Estadistica();
        double[] vectorPrueba1={1,2,3,4};
        double[] vectorPrueba2={5,5,5,5};
        double[] vectorPrueba3={-7,2,-4,6};
        double[] vectorPrueba4=new double[0];
        //Falta comprobar vector vacío y elementos negativos//
        assertEquals(2.5,obj.mediaAritmetica(vectorPrueba1));
        assertEquals(5,obj.mediaAritmetica(vectorPrueba2));
        assertEquals(-0.75,obj.mediaAritmetica(vectorPrueba3));
        assertEquals(0,obj.mediaAritmetica(vectorPrueba4));
    }

    @Test
    @DisplayName("Test de la varianza")
    void varianza() {
        Estadistica obj=new Estadistica();
        double[] vectorPrueba1={1,2,3,4};
        double[] vectorPrueba2={5,5,5,5};
        assertEquals(1.25,obj.varianza(vectorPrueba1));
        assertEquals(0,obj.varianza(vectorPrueba2));
    }

    @Test
    @DisplayName("Test de la desviación estándar")
    void desviacionEstandar() {
        Estadistica obj=new Estadistica();
        double[] vectorPrueba1={1,2,3,4};
        double[] vectorPrueba2={5,5,5,5};
        assertEquals(Math.sqrt(1.25),obj.desviacionEstandar(vectorPrueba1));
        assertEquals(0,obj.desviacionEstandar(vectorPrueba2));
    }
}