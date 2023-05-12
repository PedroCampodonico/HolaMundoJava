public class MathematicOperations {

    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Redondea un número entero hacia arriba
        System.out.println(Math.ceil(x));

        //Redondea un número entero hacia abajo
        System.out.println(Math.floor(x));

        //Devulve un número elevado a otro número
        System.out.println(Math.pow(x,y));

        //Compara que número es mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de una esfera
        // 4 * PI * R2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        // (4/3)* PI * R3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }

}
