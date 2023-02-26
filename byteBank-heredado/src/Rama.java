public class Rama {

    public static void main(String[] args) {
        int gol_visitante = 3;
        int gol_local = 1;
        int resultado = 0;
        String equipo_visitante = "a";
        String equipo_local = "b";

//operaviones logicas

            if (gol_visitante == gol_local){
                System.out.println("empataron");
            }else if (gol_local< gol_visitante){
                System.out.println("ganan los VISITANTES");
            } else {
                System.out.println("ganan los LOCALES");
            }


//        if (gol_visitante - gol_local == 0) {
//            System.out.println("Empate entre " + "a " + "y" + " b");
//        } else if (gol_visitante - gol_local == 1) {
//            System.out.println("Equipo ganador, gano por la minima diferencia");
//        } else if (gol_local - gol_visitante == 1) {
//            System.out.println("Equipo ganador, gano por la minima diferencia");
//        } else if (gol_visitante - gol_local == 2) {
//            System.out.println("Equipo ganador, fue jsta victoria");
//        } else if (gol_local - gol_visitante == 2) {
//            System.out.println("Equipo ganador, fue justa victoria");
//        } else if (gol_visitante - gol_local >= 3) {
//            System.out.println("Equipo ganador, goleada");
//        } else if (gol_local - gol_visitante >= 3) {
//            System.out.println("Equipo ganador, goleada");
//        }

    }
}