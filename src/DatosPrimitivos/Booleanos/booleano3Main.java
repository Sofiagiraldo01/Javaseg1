package DatosPrimitivos.Booleanos;

public class booleano3Main {
    public static void main(String[] args) {
        booleano3 x = new booleano3();
        x.edad = 55;
        if(x.edad>=55) {
            System.out.println("ud es un adulto mayor: " + true);
            ;
        }
        else {
            System.out.println("ud no pertenece a la tercera edad: " + false);;
        }
    }

}
