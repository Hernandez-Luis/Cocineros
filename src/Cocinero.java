public class Cocinero {
    private int idCocinero;
    private String nombreCocinero;
    private double tiempoCocinar;
    private static double tiempoPorEquipo = 0;
    private static int contCocineros = 0;
    private static final String especialidadCocina = "Comida internacional";

    public Cocinero(String nombreCocinero, double tiempoCocinar) {
        this.idCocinero = ++ contCocineros;
        this.nombreCocinero = nombreCocinero;
        this.tiempoCocinar = tiempoCocinar;

        tiempoPorEquipo = tiempoPorEquipo + tiempoCocinar;
    }

    public int getIdCocinero() {
        return idCocinero;
    }
    public String getNombreCocinero() {
        return nombreCocinero;
    }
    public double getTiempoCocinar() {
        return tiempoCocinar;
    }
    public static double getTiempoPorEquipo() {
        return tiempoPorEquipo;
    }

    public static void  especialidad(){
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "\nLa especialidad de los cocineros es la " + especialidadCocina +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}

