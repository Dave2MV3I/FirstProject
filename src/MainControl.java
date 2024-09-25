public class MainControl {

    // Atribute


    // Referenzen
    private Person person1, person2, person3;
    private Fahrzeug fahrzeug1;

    // Main-Methode
    public static void main(String[] args){
        new MainControl(); // Die Klasse ruft sich selbst auf
    }

    // Konstruktor
    public MainControl(){
        person1 = new Person("Peter", 70);
        person2 = new Person("Jack", 80);
        //person3 = new Person("Mary", 90);

        person2.halloSagen(); // Mit Punktnotation nur etwas aus eigener Klasse aufrufen, das Aufgerufenes private ist /++/ halloSagen() natürlich die Werte von person2
        System.out.println(person1); // Ausgabe: Person@3fb6a447
        System.out.println(person3); // Ausgabe, da Referenz names person3 auf kein Objekt zeigt: null

        fahrzeug1 = new Fahrzeug("Tesla", "Model Y", 4750, 1921, 1624);
    }
}

/* Alte Code-Teile zum Lernen

    new Person("Peter", 70);
    new Person("Olaf", 40);
    new Person("Grace", 16);
    new Person("Kevin", 8);
    new Fahrzeug("Tesla", "Model Y", 4750, 1921, 1624);
    new Fahrzeug("Volkswagen", "ID4", 4582, 1852, 1632);
    new Fahrzeug("Lynk & Co", "01", 4541, 1857, 1694);


    int aPersonenM1 = 3;
    int aFahrzeugeM1 = 2;

    for (int i = 0; i < aPersonenM1; i++){
        new Person("Peter", 15);
    }
 */