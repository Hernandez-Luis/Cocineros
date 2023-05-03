public class Agregar {
    public Cocinero [] cocineros(){
        Cocinero cocinero1 = new Cocinero("Diego Lopez",1);
        Cocinero cocinero2 = new Cocinero("Juan Zambrano",2);
        Cocinero cocinero3 = new Cocinero("Maria Herrera",1.3);
        Cocinero cocinero4 = new Cocinero("Alejandro Peralta ",2);
        Cocinero cocinero5 = new Cocinero("Gilberto Herrera",3);
        Cocinero cocinero6 = new Cocinero("Mario Matinez ",5);
        Cocinero [] lista = {cocinero1,cocinero2,cocinero3,cocinero4,cocinero5,cocinero6};
        return lista;
    }
}