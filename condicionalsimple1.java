/*Realizar un algoritmo que lea la edad y 
 * el nombre de una persona, y muestre un mensaje que diga 
 * puedes ingresas si eres mayor de edad y 
 * mensaje con bienvenida con el nombre de la persona 
 */
public class condicionalsimple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int edad; 
         String nombre;
         
         edad = 18;
         nombre = "Edward";
         
         if (edad>17) {
        	 System.out.println("Puedes Ingresar"); 
        	 System.out.println("Bienvenido"  + nombre);
         }
 
	}

}
