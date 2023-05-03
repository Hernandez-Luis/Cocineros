import java.lang.module.Configuration;

public class OpMain {
    public void op(){
        Agregar agregar = new Agregar();
        ImprimirCocinerosDatos imprimirCocinerosDatos = new ImprimirCocinerosDatos();

        imprimirCocinerosDatos.datos(agregar.cocineros());
        Cocinero.especialidad();
        imprimirCocinerosDatos.tiempoTotal();
    }
}