package Partido;

public class Entrada {
    public static void main(String[] args) {
        Partido partido= new Partido();
        Partido.Equipo equipoLocal=partido.new Equipo(2,"RM","local");
        Partido.Equipo equipoVisitante= partido.new Equipo(2,"Barsa","visitante");

        partido.jugarPartido();
        partido.puntos();

        System.out.println(equipoLocal.getPuntos());
        System.out.println(equipoVisitante.getPuntos());



    }
}
