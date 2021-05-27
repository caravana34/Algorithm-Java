/*En una tienda dan un 10% de descuento si al comprar un articulo supera los 250.000	
 * imprimir el valor articulo y el total a pagar
 * 
 */
public class condicionaldoble1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorart;
		double desc,total;
		
		valorart = 221000;
		
		if (valorart>250000) {
			desc = valorart*0.1;
			total = valorart - desc;
			System.out.println("el  articulo vale = " + valorart);
			System.out.println("el descuento es = " + desc);
			System.out.println("el valor total es = " + total);
			
		}else {
			System.out.println("el valor total es = " + valorart);
			System.out.println("no obtuvo descuento" );

		}
	}
}

