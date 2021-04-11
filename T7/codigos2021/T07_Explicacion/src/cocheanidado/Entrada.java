package cocheanidado;

public class Entrada {


    public static void main(String[] args) {
        Coche coche = new Coche("ford","focus",12345);

        Coche.Motor motor=coche.new Motor("ford",100,1500);
        Coche coche2= new Coche("seat","ibiza",2323);
        Coche.Motor motor2= coche2.new Motor("seat",75,1000);
        coche.mostrarDatos();
        motor.mostrarDatops();
        coche.reprogramar();
        motor.mostrarDatops();
    }

}
