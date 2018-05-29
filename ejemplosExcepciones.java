import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * Ejemplos del Bloque (II): captura y tratamiento. 
 */
public class ejemplosExcepciones
{
    private ArrayList<String> listaEjemplo;

    /**
     * Constructor for objects of class ejemplo1
     */
    public ejemplosExcepciones()
    {
        /**
        listaEjemplo = new ArrayList<>();
        listaEjemplo.add("Aprende a programar");
        listaEjemplo.add("es el futuro decian...");
        listaEjemplo.add("¿Recuerdas los coches voladores del 5º elemento?");
        listaEjemplo.add("Pues entonces esto te sonara:");
        listaEjemplo.add("- Todo el mundo hablara algun lenguaje de programacion.");
        listaEjemplo.add("( ͡° ͜ʖ ͡°) ");
         */
    }

    /**
     * Ejemplo 01 estructura y funcionamiento bloque try-catch.
     * 
     *      **mala praxis**
     * 
     * 
     */
    public void ejemplo01()
    {
        int num1 = 19;
        int num2 = 6;

        try{
            System.out.println(num1/num2);
        }
        catch(Exception e){
            System.out.println("Ha ocurrido un error inesperado: " + e);
        }
        /**
        finally{
        System.out.println("Revisa tu codigo, melon.");
        }
         */

    }

    /**
     * Ejemplo 02 estructura y funcionamiento bloque try-catch.
     * 
     *      **mala praxis**
     * 
     * 
     */
    public void ejemplo02()
    {
        int posMensaje = 0;

        try{
            System.out.println(listaEjemplo.get(posMensaje));
        }
        catch(NullPointerException e){
            System.out.println("Inicializa el array pedazo de mendrugo... " + e.getMessage());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Procura no salirte de los limites de tu array, tolai... " + e);
        }

    }

    /**
     * Ejemplo 01 estructura y funcionamiento bloque try-catch.
     * 
     *      **mala praxis**
     * 
     * Extracto modificado del metodo que teniamos en el analizador de accesos
     * a un servidor. Le pasamos el nombre de un archivo en la carpeta del proyecto
     * al scanner de forma que podamos ir analizando linea a linea la informacion
     * en dicho archivo.
     * 
     */
    public void ejemplo03(String nombreDelArchivo)
    {
        listaEjemplo.clear();

        File archivoALeer = new File(nombreDelArchivo);
        try {
            Scanner sc = new Scanner(archivoALeer);
            while (sc.hasNextLine()) {
                String lineaActual = sc.nextLine();

                listaEjemplo.add(lineaActual);
            }

            for(String cadena : listaEjemplo){
                System.out.println(cadena);
            }

            sc.close(); //  <--- ???
        }
        catch (Exception e) {   //  excepcion generica
            System.out.println("Ocurrio algun error al leer el archivo.");
        }
    }

    /**
     * Ejemplo 03 finally, return y la ejecucion del programa.
     * 
     *      **Avanzado**
     * 
     * 
     */
    public String ejemplo04()
    {
        String aDevolver = "";

        //  trillones de operaciones y lineas de codigo como en las peliculas

        aDevolver = "WOOOOOOOOOOOSH!!!";

        try {
            return aDevolver;
        }
        finally {
            System.out.println("¡Ostras tu, que esto sigue vivo!");
        }
    }
}
