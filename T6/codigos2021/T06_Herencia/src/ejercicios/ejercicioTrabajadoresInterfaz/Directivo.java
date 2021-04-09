package ejercicios.ejercicioTrabajadoresInterfaz;

public abstract class Directivo extends Persona {

    protected int beneficio;
    public Directivo(){};
    public Directivo(String dni, String nombre, String apellido, int beneficio) {
        super(dni, nombre, apellido);
        this.beneficio = beneficio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Beneficio: "+beneficio);
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
}
