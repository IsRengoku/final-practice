import java.util.ArrayList;

public class Estudiantes {
    
    public void ingenieria(){
        ArrayList<E_ingenieria> ingenieria = new ArrayList<>();
        E_ingenieria estudiante = new E_ingenieria("1234", "samuel", "garcia", "317", 3, 4, "0001");
        ingenieria.add(estudiante);
        E_ingenieria estudiante2 = new E_ingenieria("5678", "isabel", "londono", "320", 5, 3.5, "0002");
        ingenieria.add(estudiante2);
        E_ingenieria estudiante3 = new E_ingenieria("0102", "maximiliano", "gonzalez", "310", 1, 3.1, "0003");
        ingenieria.add(estudiante3);
        E_ingenieria estudiante4 = new E_ingenieria("9098", "luz", "garcia", "319", 9, 4.6, "0004");
        ingenieria.add(estudiante4);
        E_ingenieria estudiante5 = new E_ingenieria("2580", "messi", "ronaldo", "107", 7, 5, "0005");
        ingenieria.add(estudiante5);
        herramientas obj = new herramientas();
        obj.portatiles(ingenieria);
    }

    public void diseño(){
        ArrayList<E_diseño> diseño = new ArrayList<>();
        E_diseño estudiante = new E_diseño("2020", "batman", "renteria", "311", "presencial", 4, 1001);
        diseño.add(estudiante);
        E_diseño estudiante2 = new E_diseño("3124", "beckham", "david", "700", "virtual", 6, 1010);
        diseño.add(estudiante2);
        E_diseño estudiante3 = new E_diseño("1015", "andres", "garcia", "300", "virtual", 2, 1000);
        diseño.add(estudiante3);
        E_diseño estudiante4 = new E_diseño("1970", "lokillo", "flores", "500", "presencial", 5, 1201);
        diseño.add(estudiante4);
        E_diseño estudiante5 = new E_diseño("1520", "juan", "martinez", "450", "presencial", 7, 1020);
        diseño.add(estudiante5);
        E_diseño dis = new E_diseño();
        dis.menu_dis();
    }
}
