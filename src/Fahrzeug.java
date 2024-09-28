public class Fahrzeug {

    // Attribute
        private String brand; // = "Tesla";
        private String model; // = "Model Y";
        private int length; // = 4750;
        private int width; // = 1921;
        private int height; // = 1624;

    // Referenzen
        private Person fahrer, beifahrer;

    // Konstruktor
        public Fahrzeug(String brand, String model, int length, int width, int height){
            this.brand = brand;
            this.model = model;
            this.length = length;
            this.width = width;
            this.height = height;
            //datenAnzeigen();

        }

    // Methoden
        public void datenAnzeigen(){
            System.out.println("Hi. I'm your new " + brand + " " + model + " and my dimensions are " + length + " * " + width + " * " + height + ". For further information, look in the manual. Enjoy!");
        }

        // getter und setter Auto
            public void setBrand(String brand){
                this.brand = brand;
            }

            public String getBrand(){
                return this.brand;
            }

            public void setModel(String model){
                this.model = model;
            }

            public String getModel(){
                return this.model;
            }


        // getter und setter Besatzung
            public void setFahrer(Person fahrer){
                this.fahrer = fahrer;
            }

            public void setBeifahrer(Person beifahrer){
                this.beifahrer = beifahrer; // Das erhaltene Objekt wird der ersten Referenz zugewiesen, danit man später über die Referenz auf das Objekt zugreifen kann
            }

        public void  nenneBesatzung(String fahrerName, String beifahrerName){
            System.out.println("");
            System.out.println("Fall 1: " + this.fahrer + " sitzt am Steuer von Fahrzeug 1 und " + this.beifahrer + " fährt Shotgun.");
            System.out.println("Fall 2: " + fahrerName + " sitzt am Steuer von Fahrzeug 1 und " + beifahrerName + " fährt Shotgun.");
            System.out.println("Fall 3: " + this.fahrer.getName() + " sitzt am Steuer von Fahrzeug 1 und " + this.beifahrer.getName() + " fährt Shotgun.");

            // Wenn die Besatzung genannt werden soll, bevor setFahrer() und setBeifahrer() die Referenzen fahrer und beifahrer gesetzt haben, passiert folgendes:
            // Fall 1-- Keine Referenz auf einen Speicherort des Objektes, also Ausgabe "null" anstelle der Person. Ausgabe: "Fall 1: null sitzt am Steuer von Fahrzeug 1 und null fährt Shotgun."
            // Fall 2-- Namen der Besatzung wurden unabhängig der Referenzen fahrer und beifahrer aus MainControl als Parameter mitgegeben und werden verwendet. Ausgabe: "Fall 2: Peter sitzt am Steuer von Fahrzeug 1 und Jack fährt Shotgun."
            // Fall 3-- Es wird die Methode getName() eines unbekannten Objektes aufgerufen, also gibt es eine Fehlermeldung als Ausgabe.
        }

}
