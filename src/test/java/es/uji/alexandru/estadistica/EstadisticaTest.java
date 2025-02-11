package es.uji.alexandru.estadistica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {

    @Test
    @DisplayName("Test de la media")
    void mediaAritmetica() {
        Estadistica obj=new Estadistica();
        double[] vectorVacio=new double[0];
        double[] vectorUnElemento={10};
        double[] vectorPositivos={1,2,3,4};
        double[] vectorPositivos2={5,5,5,5};
        double[] vectorNegativos={-7,2,-4,6};
        double[] vectorDecimales = {0.5,2.6,8,1.5};
        //Falta comprobar vector vacío y elementos negativos//
        assertThrows(IllegalArgumentException.class, () -> obj.mediaAritmetica(vectorVacio));
        assertEquals(10,obj.mediaAritmetica(vectorUnElemento));
        assertEquals(2.5,obj.mediaAritmetica(vectorPositivos));
        assertEquals(5,obj.mediaAritmetica(vectorPositivos2));
        assertEquals(-0.75,obj.mediaAritmetica(vectorNegativos));
        assertEquals(3.15,obj.mediaAritmetica(vectorDecimales));
    }

    @Test
    @DisplayName("Test de la varianza")
    void varianza() {
        Estadistica obj=new Estadistica();
        double[] vectorVacio=new double[0];
        double[] vectorUnElemento={10};
        double[] vectorPositivos={1,2,3,4};
        double[] vectorPositivos2={5,5,5,5};
        double[] vectorNegativos={-7,2,-4,6};
        double[] vectorDecimales = {0.5,2.6,8,1.5};
        assertThrows(IllegalArgumentException.class, () -> obj.varianza(vectorVacio));
        assertEquals(0,obj.varianza(vectorUnElemento));
        assertEquals(1.25,obj.varianza(vectorPositivos));
        assertEquals(0,obj.varianza(vectorPositivos2));
        assertEquals(25.6875,obj.varianza(vectorNegativos));
        assertEquals(8.3925,obj.varianza(vectorDecimales),0.0001);
    }

    @Test
    @DisplayName("Test de la desviación estándar")
    void desviacionEstandar() {
        Estadistica obj=new Estadistica();
        double[] vectorVacio=new double[0];
        double[] vectorUnElemento={10};
        double[] vectorPositivos={1,2,3,4};
        double[] vectorPositivos2={5,5,5,5};
        double[] vectorNegativos={-7,2,-4,6};
        double[] vectorDecimales = {0.5,2.6,8,1.5};
        assertThrows(IllegalArgumentException.class, () -> obj.desviacionEstandar(vectorVacio));
        assertEquals(0,obj.desviacionEstandar(vectorUnElemento));
        assertEquals(Math.sqrt(1.25),obj.desviacionEstandar(vectorPositivos));
        assertEquals(0,obj.desviacionEstandar(vectorPositivos2));
        assertEquals(Math.sqrt(25.6875),obj.desviacionEstandar(vectorNegativos));
        assertEquals(Math.sqrt(8.3925),obj.desviacionEstandar(vectorDecimales),0.0001);
    }
}