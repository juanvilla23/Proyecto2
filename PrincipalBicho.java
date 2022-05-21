import java.util.Scanner;
public class PrincipalBicho {
    public static Bicho [][] bichos = new Bicho[3][3];
    public static void main(String [] args) {
        Bicho.llenarTabla(bichos);
        while (true) {
            int numeroB = Bicho.contarBicho(bichos);
            if ( numeroB != 0){
                Bicho.imprimirInformacion(bichos);
                System.out.println("Ingrese 1 para disparar");
                System.out.println("Ingrese 2 para activar bomba atomica aletoria");
                System.out.println("Ingre 3 para activar bicho muntante ");
                System.out.println("Ingrese 4 intercambiar las posiciones de los bichos");
                System.out.println("Ingrese 5 para cambiar el tipo de sangre del bicho más débil");
                System.out.println("Ingrese 6 para activar matar los bichos de una fila");
                System.out.println("Ingrese 7 para mostrar el promedio de salud de todos los brichos");
                System.out.println("Ingrese 8 La frase de abuela");
                Scanner sc = new Scanner(System.in);
                int opcion = sc.nextInt();
                if (opcion == 1) {
                    try {
                        Bicho.Disparo(bichos);
                    }catch (Exception e){
                        System.out.println("No hay vichos en esa posición");
                    }

                }
                if (opcion == 2) {
                    Bicho.eliminarbicho(bichos);
                }
                if (opcion == 3) {
                    Bicho.subirSalud(bichos);
                }
                if (opcion == 4) {
                    Bicho.intercambioPosicion(bichos);
                }
                if (opcion == 5) {
                    Bicho.cambiarTipodeBicho(bichos);
                }
                if (opcion == 6) {
                    Bicho.EliminarFila(bichos);

                }
                if (opcion == 7) {
                    Bicho.promedio(bichos);
                }
                if (opcion == 8) {
                    System.out.println("Mijo mate ese, hechele Raid");
                }
            }else{
                break;
            }
        }
        Bicho.imprimirInformacion(bichos);
        System.out.println("Fin del Juego");
    }
}