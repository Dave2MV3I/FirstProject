public class MainControl {

    public static void main(String[] args){
        // halloWelt();

        new Person("Peter", 70);
        new Person("Olaf", 40);
        new Person("Grace", 16);
        new Person("Kevin", 8);
        new Fahrzeug("Tesla", "Model Y", 4750, 1921, 1624);
        new Fahrzeug("Volkswagen", "ID4", 4582, 1852, 1632);
        new Fahrzeug("Lynk & Co", "01", 4541, 1857, 1694);

        int aPersonenM1 = 3; // Wieso kein private hier? Wegen main?
        int aFahrzeugeM1 = 2;

        /*for (int i = 0; i < aPersonenM1; i++){
            new Person("Peter", 15);
        }
        for (int i = 0; i < aFahrzeugeM1; i++){
            new Fahrzeug("Tesla", "Model Y", 4750, 1921, 1624);
        }*/
    }

    /* private static void halloWelt(){
        System.out.print("Hello World!");
        System.out.print("Hello World!");
        System.out.println(" Helloooo!");
        System.out.println("Hello World!");
    } */
}
