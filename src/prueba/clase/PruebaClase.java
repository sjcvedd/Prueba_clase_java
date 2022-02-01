package prueba.clase;

class examen{
    void ejercicio1 (){
        int[] arreglo = new int[8];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i*3;
            System.out.println(arreglo[i]);
        }
        int sumatoria = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumatoria += arreglo[i];
        }
        System.out.println("el resultado de la sumatoria es: " + sumatoria);
    }
}

public class PruebaClase {

    public static void main(String[] args) {
        examen ex = new examen();
        ex.ejercicio1();
    }
    
}
