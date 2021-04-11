package Partido;

public class Partido {
    private Equipo equipoLocal, equipoVisitante;
    private boolean jugado;
    int golesLocal, golesVisitante;


    public Partido(boolean jugado, int golesLocal, int golesVisitante) {
        this.jugado = jugado;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public boolean jugarPartido() {

        System.out.println("el partido comineza");
        for (int i = 0; i < 2; i++) {
            agregarGolesVisitante();
            agregarGolesLocal();


        }
        System.out.println("final de la primer parte");
        mostrarResultado();

        for (int i = 0; i < 2; i++) {
            agregarGolesVisitante();
            agregarGolesLocal();
        }
        System.out.println("final del partido");
        mostrarResultado();
        jugado = true;

        return jugado;



    }


    public Partido() {
    }


    public void mostrarResultado(){
        System.out.println("Goles del equipo : "+equipoLocal.getNombre() +":" +golesLocal);
        System.out.println("Goles equipo: "+equipoVisitante.getNombre()+":"+golesVisitante);

    }

    public void puntos(){
        if (isJugado()==true) {
            if (golesLocal > golesVisitante) {
                equipoLocal.setPuntos(equipoLocal.puntos += 3);
            } else if (golesVisitante > golesLocal) {
                equipoVisitante.setPuntos(equipoVisitante.puntos += 3);
            } else {
                equipoLocal.setPuntos(equipoLocal.puntos += 1);
                equipoVisitante.setPuntos(equipoVisitante.puntos += 1);
            }
        }
    }



    public void agregarGolesLocal(){
        golesLocal+= (Math.random()*2);
    }
    public void agregarGolesVisitante(){
        golesVisitante+= (Math.random()*2);
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    class Equipo{
        int puntos;
        String nombre,localOvis;

        public Equipo(int puntos, String nombre, String localOvis) {
            this.puntos = puntos;
            this.nombre = nombre;
            this.localOvis = localOvis;
            if (localOvis.equals("local")){
                setEquipoLocal(this);
            }else if (localOvis.equals("visitante")){
                setEquipoVisitante(this);
            }
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getLocalOvis() {
            return localOvis;
        }

        public void setLocalOvis(String localOvis) {
            this.localOvis = localOvis;
        }
    }
}
