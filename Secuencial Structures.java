/*En una construcción se demolió el 45% de sus pisos. Hacer un algoritmo que 
*lea el número de pisos iniciales 
*e imprima el número de pisos demolidos y el número de pisos después
*/

package algoritmos_java;
public class secuencial1{
  public static void main(String[] args){
    int pisosi = 100;
    double pisosdemolidos = pisosi*0.45;
    double pisosddemo = pisosi - pisosdemolidos;

    System.out.println("Pisos Iniciales =" + pisosi);
    System.out.println("Pisos demolidos =" + pisosdemolidos);
    System.out.println("Pisos después de demolidos =" + pisosddemo);
  }
}
