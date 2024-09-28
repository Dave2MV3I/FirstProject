public class MainControl {

    // Main-Methode
        public static void main(String[] args){
            new MainControl(); // Die Klasse ruft sich selbst auf
        }

    // Attribute


    // Referenzen
        private Person person1, person2, person3;
        private Fahrzeug fahrzeug1;

    // Konstruktor
        public MainControl(){
            person1 = new Person("Peter", 70);
            person2 = new Person("Jack", 80);
            //person3 = new Person("Mary", 90);

            //person2.halloSagen(); // Mit Punktnotation nur etwas aus eigener Klasse aufrufen, das Aufgerufenes private ist /++/ halloSagen() natürlich die Werte von person2
            //System.out.println(person1); // Ausgabe: Person@3fb6a447
            //System.out.println(person3); // Ausgabe, da Referenz namens person3 auf kein Objekt zeigt: null

            fahrzeug1 = new Fahrzeug("Tesla", "Model Y", 4750, 1921, 1624);

            fahrzeug1.setFahrer(person1); // Ganzes Objekt weitergeben
            fahrzeug1.setBeifahrer(person2);

            fahrzeug1.nenneBesatzung(person1.getName(), person2.getName()); // Strings werden eingesetzt
        }
}