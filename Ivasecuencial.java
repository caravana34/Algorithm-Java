/*realizar un algoritmo que determine el valor a pagar de un producto que tiene 
 * un descuento del 5% y se le sume el iva del 19% 
 */
public class Ivasecuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int valorp;
        double descuento, iva,total;
        
        valorp = 50000;
        descuento = valorp*0.05;
        iva = valorp*0.19;
        total = valorp - descuento + iva;
        
        System.out.println ("Valor producto = " + valorp);
        System.out.println ("descuento = " + descuento);
        System.out.println ("Iva = " + iva);
        System.out.println ("total = " + total);
	}

}
