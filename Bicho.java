import java.util.Scanner;
public class Bicho {
    private String nombre;
    private int salud;
    public Bicho(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public Bicho(int salud) {
        this.salud = salud;
    }

    public void setSalud(int salud) {
            this.salud = salud;
    }

    public int getSalud() {
        return this.salud;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override

    public String toString() {
        return this.nombre + "" + this.salud;
    }

    public static void llenarTabla(Bicho[][] bichos) {
        int aleatorio = 0;
        aleatorio = (int) (Math.random() * 9 + 1);
        System.out.println(aleatorio); //
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < aleatorio; i++) {
            int aleatorio2 = 0;
            aleatorio2 = (int) (Math.random() * 3 + 1);
            System.out.println(aleatorio2);
            if (columna > 2) {
                columna = 0;
                fila++;
            }
            if (aleatorio2 == 1) {
                bichos[fila][columna] = new BichoNormal();
            }
            if (aleatorio2 == 2) {
                bichos[fila][columna] = new BichoAlien();
            }
            if (aleatorio2 == 3) {
                bichos[fila][columna] = new BichoEspacial();
            }
            columna++;

        }
    }

    public static void imprimirInformacion(Bicho[][] bichos) {
        for (int fila = 0; fila < bichos.length; fila++) {
            System.out.println("-------------------");
            for (int columna = 0; columna < bichos[fila].length; columna++) {
                if (bichos[fila][columna] != null) {
                    System.out.print("|" + bichos[fila][columna].toString());

                } else {
                    System.out.print("|" + "     ");
                }
            }
            System.out.println("|");
        }
        System.out.println("-------------------");
    }

    public static void Disparo(Bicho[][] bichos) {
        System.out.println("Ingrese la posicion a la que desea disparar");
        Scanner sc = new Scanner(System.in);
        int reducirSalud = sc.nextInt();
        if (reducirSalud == 1 || reducirSalud == 2 || reducirSalud == 3 || reducirSalud == 4 || reducirSalud == 5 || reducirSalud == 6 || reducirSalud == 7 || reducirSalud == 8 || reducirSalud == 9) {
            if (reducirSalud == 1) {
                bichos[0][0].setSalud(bichos[0][0].getSalud() - 5);
                if (bichos[0][0].getSalud() == 0) {
                    bichos[0][0] = null;
                }
            }
            if (reducirSalud == 2) {
                bichos[0][1].setSalud(bichos[0][1].getSalud() - 5);
                if (bichos[0][1].getSalud() == 0) {
                    bichos[0][1] = null;
                }
            }
            if (reducirSalud == 3) {
                bichos[0][2].setSalud(bichos[0][2].getSalud() - 5);
                if (bichos[0][2].getSalud() == 0) {
                    bichos[0][2] = null;
                }
            }
            if (reducirSalud == 4) {
                bichos[1][0].setSalud(bichos[1][0].getSalud() - 5);
                if (bichos[1][0].getSalud() == 0) {
                    bichos[1][0] = null;
                }
            }
            if (reducirSalud == 5) {
                bichos[1][1].setSalud(bichos[1][1].getSalud() - 5);
                if (bichos[1][1].getSalud() == 0) {
                    bichos[1][1] = null;
                }
            }
            if (reducirSalud == 6) {
                bichos[1][2].setSalud(bichos[1][2].getSalud() - 5);
                if (bichos[1][2].getSalud() == 0) {
                    bichos[1][2] = null;
                }
            }
            if (reducirSalud == 7) {
                bichos[2][0].setSalud(bichos[2][0].getSalud() - 5);
                if (bichos[2][0].getSalud() == 0) {
                    bichos[2][0] = null;
                }
            }
            if (reducirSalud == 8) {
                bichos[2][1].setSalud(bichos[2][1].getSalud() - 5);
                if (bichos[2][1].getSalud() == 0) {
                    bichos[2][1] = null;
                }
            }
            if (reducirSalud == 9) {
                bichos[2][2].setSalud(bichos[2][2].getSalud() - 5);
                if (bichos[2][2].getSalud() == 0) {
                    bichos[2][2] = null;
                }
            }
        }else{
            Bicho.Disparo(bichos);
        }
    }

    public static void eliminarbicho(Bicho[][] bichos) {
        int fila = 0;
        int columna = 0;
        while (true) {
            fila = (int) (Math.random() * 3);
            columna = (int) (Math.random() * 3);
            System.out.println(fila + "," + columna);
            if (bichos[fila][columna] != null) {
                bichos[fila][columna] = null;
                break;
            }
        }
    }

    public static void subirSalud(Bicho[][] bichos) {
       int fila= Bicho.encontarmenor(bichos)[0];
       int columna= Bicho.encontarmenor(bichos)[1];
       bichos[fila][columna].setSalud(bichos[fila][columna].getSalud()*2);
    }

    public static void cambiarTipodeBicho(Bicho[][] bichos) {
        int fila1= encontarmenor(bichos)[0];
        int columna1=encontarmenor(bichos)[1];
        int tempSalud = bichos[fila1][columna1].getSalud();
        PrincipalBicho.bichos[fila1][columna1] = new BichoEspacial();
        PrincipalBicho.bichos[fila1][columna1].setSalud(tempSalud);
        System.out.println(columna1);
        System.out.println(fila1);
    }

    public static void intercambioPosicion(Bicho[][] bichos) {
        int fila1 = 0;
        fila1 = (int) (Math.random() * 3);
        int columna1 = 0;
        columna1 = (int) (Math.random() * 3);
        int fila2 = 0;
        fila2 = (int) (Math.random() * 3);
        int columna2 = 0;
        columna2 = (int) (Math.random() * 3);
        System.out.println(fila1 + "," + columna1);
        System.out.println("bicho2");
        System.out.println(fila2 + "," + columna2);
        if (bichos[fila1][columna1] != null && bichos[fila2][columna2] != null && bichos[fila1][columna1] != bichos[fila2][columna2]) {
            Bicho bichoTemp = bichos[fila1][columna1];
            bichos[fila1][columna1] = bichos[fila2][columna2];
            bichos[fila2][columna2] = bichoTemp;
        } else {
            int numeroB = Bicho.contarBicho(bichos);
            if (numeroB != 1) {
                Bicho.intercambioPosicion(bichos);
            }else{
                System.out.println("No hay otro bicho Existente para intercambiar de posición");
            }
        }
    }

    public static void EliminarFila(Bicho[][] bichos) {
        int aleatorio = 0;
        aleatorio = (int) (Math.random() * 3);
        System.out.println(aleatorio);
        if (bichos[aleatorio][0] != null || bichos[aleatorio][1] != null || bichos[aleatorio][2] != null) {
            bichos[aleatorio][0] = null;
            bichos[aleatorio][1] = null;
            bichos[aleatorio][2] = null;
        } else{
            Bicho.EliminarFila(bichos);
    }
    }

    public static void promedio(Bicho[][] bichos) {
        int numeroBichos = 0;
        int suma = 0;
        for (int fila = 0; fila < bichos.length; fila++) {
            for (int columna = 0; columna < bichos[fila].length; columna++) {
                if (bichos[fila][columna] != null) {
                    suma = suma + bichos[fila][columna].getSalud();
                    numeroBichos = numeroBichos + 1;
                }
            }
        }
        double promedio = suma / numeroBichos;
        System.out.println(promedio);
    }

    public static int contarBicho(Bicho[][] bichos) {
        int numeroBichos = 0;
        for (int fila = 0; fila < bichos.length; fila++) {
            for (int columna = 0; columna < bichos[fila].length; columna++) {
                if (bichos[fila][columna] != null) {
                    numeroBichos = numeroBichos + 1;
                }
            }
        }
        return numeroBichos;
    }

    public static int[] encontarmenor(Bicho[][] bichos) {
        int saludBichomenor = 100000;
        int fila = 0;
        int columna = 0;
        int fila1 = 0;
        int columna1 = 0;
        for (fila =0; fila < bichos.length; fila++) {
            for (columna = 0; columna < bichos[fila].length; columna++) {
                if (bichos[fila][columna] != null) {
                    if(saludBichomenor>bichos[fila][columna].salud) {
                        saludBichomenor = bichos[fila][columna].salud;
                        fila1 = fila;
                        columna1 = columna;
                    }
                }
            }
        }
        int[] numeros = {fila1, columna1};
        return numeros;
    }
}
