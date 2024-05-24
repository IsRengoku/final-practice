import java.util.ArrayList;

public class Herramientas {

    public void portatiles(ArrayList<E_ingenieria> ingeniera, boolean entrar){
        ArrayList<C_portatil> computadores = new ArrayList<>();
        ArrayList<E_ingenieria> ingenierias = new ArrayList<>();
        C_portatil pc = new C_portatil("FF3020", "HP", 55, 1200000, "Windows 7", "AMD Ryzen", "no");
        computadores.add(pc);
        C_portatil pc2 = new C_portatil("FA1010", "HP", 50, 1000000, "Windows 7", "Intel® Core™ i5", "no");
        computadores.add(pc2);
        C_portatil pc3 = new C_portatil("AB1000", "Apple", 60, 1800000, "Windows 11", "Intel® Core™ i5", "no");
        computadores.add(pc3);
        C_portatil pc4 = new C_portatil("CC1021", "Lenovo", 58, 1600000, "Windows 11", "AMD Ryzen", "no");
        computadores.add(pc4);
        C_portatil pc5 = new C_portatil("EF3040", "ASUS", 70, 2500000, "Windows 10", "Intel® Core™ i5", "no");
        computadores.add(pc5);
        C_portatil pc6 = new C_portatil("AD0070", "ASUS", 65, 2000000, "Windows 10", "MAD Ryzen", "no");
        computadores.add(pc6);
        if(entrar){
            Herramientas apoyo = new Herramientas();
            apoyo.inventario_ing(computadores);
        }
        else{
            ingenierias = ingeniera;
            menu_ing menu = new menu_ing();
            menu.menu(ingenierias, computadores);
        }
    }

    public void tabletas(ArrayList<E_diseño> diseño, boolean entrar){
        ArrayList<E_diseño> designers = new ArrayList<>();
        designers = diseño;
        ArrayList<T_grafica> tablets = new ArrayList<>();
        T_grafica tabla = new T_grafica("FF0130", "Wacom", 10, 950000, "512 GB", 3, "no");
        tablets.add(tabla);
        T_grafica tabla2 = new T_grafica("BB3322", "Huion", 7.5, 720000, "256 GB", 2.3, "no" );
        tablets.add(tabla2);
        T_grafica tabla3 = new T_grafica("AA2107", "Gaomon", 12, 1350000, "1 TB", 4.5, "no" );
        tablets.add(tabla3);
        T_grafica tabla4 = new T_grafica("AC0010", "Ugee", 10, 950000, "512 GB", 3.2, "no" );
        tablets.add(tabla4);
        T_grafica tabla5 = new T_grafica("ED7771", "XP-Pen", 5.8, 950000, "256 GB", 1.8, "no" );
        tablets.add(tabla5);
        T_grafica tabla6 = new T_grafica("EE9988", "Wacom", 15, 950000, "1 TB", 5.2, "no" );
        tablets.add(tabla6);
        if (entrar) {
            Herramientas apoyo = new Herramientas();
            apoyo.inventario_dis(tablets);
        }
        else{
            menu_dis menu = new menu_dis();
            menu.menu(designers, tablets);
        }
    }

    public void inventario_ing(ArrayList<C_portatil> portatiles){
        ArrayList<C_portatil> computadores = new ArrayList<>();
        computadores = portatiles;
        Inventarios inventario = new Inventarios();
        inventario.inventario_ing(computadores);
    }

    public void inventario_dis(ArrayList<T_grafica> tablets){
        ArrayList<T_grafica> tabletas = new ArrayList<>();
        tabletas = tablets;
        Inventarios inventario = new Inventarios();
        inventario.inventario_dis(tabletas);
    }
}
