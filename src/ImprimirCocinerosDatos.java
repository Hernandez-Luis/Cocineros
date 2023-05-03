public class ImprimirCocinerosDatos {
    public void datos(Cocinero [] cocineros){
        System.out.println("\t\t- - D A T O S  D E  C O C I N E R O S - -\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (Cocinero cocinero:cocineros) {
            System.out.println("Id: " + cocinero.getIdCocinero() + "    Nombre: " + cocinero.getNombreCocinero() + "\nTiempo: " + cocinero.getTiempoCocinar() + " horas");
            System.out.println("---------------------------------------------------");
        }
    }

    public void tiempoTotal(){
        System.out.println("Se necesitan " + Cocinero.getTiempoPorEquipo() + " horas para cocinar a 400 personas");
    }
}