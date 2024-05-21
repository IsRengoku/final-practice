import java.util.ArrayList;

public class herramientas {
    
    public void portatiles(ArrayList<E_ingenieria> ingeniera){
        ArrayList<C_portatil> computadores = new ArrayList<>();
        ArrayList<E_ingenieria> ingenierias = new ArrayList<>();
        C_portatil pc = new C_portatil("FF3020", "HP", 55, 1200000, "Windows 7", "AMD Ryzen");
        computadores.add(pc);
        C_portatil pc2 = new C_portatil("FA1010", "HP", 50, 1000000, "Windows 7", "Intel® Core™ i5");
        computadores.add(pc2);
        C_portatil pc3 = new C_portatil("AB1000", "Lenovo", 60, 1800000, "Windows 11", "Intel® Core™ i5");
        computadores.add(pc3);
        C_portatil pc4 = new C_portatil("FA1010", "Lenovo", 58, 1600000, "Windows 11", "AMD Ryzen");
        computadores.add(pc4);
        C_portatil pc5 = new C_portatil("FA1010", "ASUS", 70, 2500000, "Windows 10", "Intel® Core™ i5");
        computadores.add(pc5);
        C_portatil pc6 = new C_portatil("FA1010", "ASUS", 65, 2000000, "Windows 10", "MAD Ryzen");
        computadores.add(pc6);
        ingenierias = ingeniera;
        menu_ing menu = new menu_ing();
        menu.menu(ingenierias, computadores);
    }

    public void tabletas(){
        ArrayList<T_grafica> tablets = new ArrayList<>();
        T_grafica tabla = new T_grafica("FF0130", "Wacom", 10, 950000, "512 GB", 3 );
        tablets.add(tabla);
        T_grafica tabla2 = new T_grafica("BB3322", "Huion", 7.5, 720000, "256 GB", 2.3 );
        tablets.add(tabla2);
        T_grafica tabla3 = new T_grafica("AA2107", "Gaomon", 12, 1350000, "1 TB", 4.5 );
        tablets.add(tabla3);
        T_grafica tabla4 = new T_grafica("AC0010", "Ugee", 10, 950000, "512 GB", 3.2 );
        tablets.add(tabla4);
        T_grafica tabla5 = new T_grafica("ED7771", "XP-Pen", 5.8, 950000, "256 GB", 1.8 );
        tablets.add(tabla5);
        T_grafica tabla6 = new T_grafica("EE9988", "Wacom", 15, 950000, "1 TB", 5.2 );
        tablets.add(tabla6);
    }
}
