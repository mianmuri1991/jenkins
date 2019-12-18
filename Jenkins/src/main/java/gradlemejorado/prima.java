
package gradlemejorado;

/**
* @author  Miguel Murillo
* @version 1.0
* @since   2019-11-20
*/

import java.util.Scanner;

/**
* @author  Miguel Murillo
* @version 1.0
* @since   2019-11-20
*/

public class prima {
	  /**
	    * 
	    *
	    * @author Miguel Murillo
	    */

    public static Scanner lector;
    
	/**
     * @param edad
     * 
     * @param puntos
     * @param prima
     * @return 
     */
    
    public prima() {
    	lector = null;
    }

    /**
    * 
    *
    * @author Miguel Murillo
    */
  
    public String calcularPrima(int edad,  final int puntos, int prima) {
        if (edad >= 18 && edad < 25) {
            if (puntos >= 29) {
                prima = (int) (500 * 2.8 - 50);
            } else {
                prima = (int) (500 * 2.8);
            }
        }
        if (edad >= 25 && edad < 35) {
            if (puntos >= 27) {
                prima = (int) (500 * 1.8 - 50);
            } else {
                prima = (int) (500 * 1.8);
            }
        }
        if (edad >= 35 && edad < 45) {
            if (puntos >= 25) {
                prima = (int) (500 - 100);
            } else {
                prima = 500;
            }
        }
        if (edad >= 45 && edad < 65) {
            if (puntos >= 23) {
                prima = (int) (500 * 0.8 - 150);
            } else {
                prima = (int) (500 * 0.8);
            }
        }
        if (edad >= 65 && edad <= 90) {
            if (puntos >= 25) {
                prima = (int) (500 * 1.5 - 200);
            } else {
                prima = (int) (500 * 1.5);
            }
        }
        return "Usted debe pagar " + prima + " por su prima.";
    }
    

    /**
    * 
    *
    * @author Miguel Murillo
    */
    public static void main(String[] args) {
        String edads = null;
        int puntos = 0;
        final int prima = 0;
        int edad = 0;
        String puntoss = null;
        lector = new Scanner(System.in);
    	while (true) {
            try {
                System.out.println("Ingrese su edad: ");
                edads = lector.nextLine();
                edad = Integer.parseInt(edads);
                if (edad < 18 || edad > 90) {
                    System.out.println("Usted no puede sacar un seguro de autos.");
                    System.exit(0);
                }
                break;
            } catch (NumberFormatException falla) {
                System.out.println("Ha ingresado un dato no numerico.");
                System.exit(0);
            }
        }
        while (true) {
            try {
                System.out.println("Ingrese sus puntos: ");
                puntoss = lector.nextLine();
                puntos = Integer.parseInt(puntoss);
                if (puntos < 1 || puntos > 30) {
                    System.out.println("Debe tener maximo 30 puntos o minimo 1");
                    System.exit(0);
                }
                break;
            } catch (NumberFormatException falla) {
                System.out.println("Ha ingresado un dato no numerico.");
                System.exit(0);
            }
        }
        final prima p = new prima();
        System.out.println(p.calcularPrima(edad,puntos,prima));
    }
    
}

