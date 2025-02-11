package es.uji.alexandru.estadistica;

public class Estadistica {

    //Método para calcular la media
    public static double mediaAritmetica (double []v){
        if(v.length == 0)
            return 0;
        double suma = 0;
        for (double value : v) suma += value;

        return suma/v.length;
    }

    //Método para calcular la varianza
    public static double varianza (double []v) throws Exception {
        if(v.length == 0)
            throw new Exception("Error");
        double suma = 0;
        double media = mediaAritmetica(v);

        for (double value : v){
            suma += Math.pow(value - media, 2);
        }
        return suma / v.length;
    }

    //Método para calcular la desviación estándar
    public static double desviacionEstandar (double []v){
        return Math.sqrt(varianza(v));
    }
}
