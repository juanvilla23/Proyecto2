public class BichoEspacial extends Bicho{
    public BichoEspacial(String nombre,int salud){
        super(nombre,salud);
    }
    public BichoEspacial(int salud){
        super(salud);
    }
    public BichoEspacial(){
        this("BE-",30);
    }
}
