package cocheanidado;

public class Coche {
    private String marca, modelo;
    private int valocidad, numBastidor;
    private Motor motor;

    public Coche(String marca, String modelo,  int numBastidor) {
        this.marca = marca;
        this.modelo = modelo;

        this.numBastidor = numBastidor;
    }
    public void mostrarDatos(){
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("velocidad: "+valocidad);
        System.out.println("bastidor: "+numBastidor);
        System.out.println("motor: "+motor);
    }
    public void reprogramar(){
        motor.setCv(motor.getCv()+20);
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getValocidad() {
        return valocidad;
    }

    public void setValocidad(int valocidad) {
        this.valocidad = valocidad;
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }



    class Motor{
        private String fabricante;
        private int cv;
        private double cc;

        public Motor(String fabricante, int cv, double cc) {
            this.fabricante = fabricante;
            this.cv = cv;
            this.cc = cc;
            setMotor(this);
        }

        public void mostrarDatops(){
            System.out.println("fabricante: "+fabricante);
            System.out.println("CC: "+cc);
            System.out.println("CV: "+cv);
        }

        public String getFabricante() {
            return fabricante;
        }

        public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
        }

        public int getCv() {
            return cv;
        }

        public void setCv(int cv) {
            this.cv = cv;
        }

        public double getCc() {
            return cc;
        }

        public void setCc(double cc) {
            this.cc = cc;
        }
    }

}
