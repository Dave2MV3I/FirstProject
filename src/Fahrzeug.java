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

            public Person getFahrer(){
                return this.fahrer;
            }

            public void setBeifahrer(Person beifahrer){
                this.beifahrer = beifahrer; // Das erhaltene Objekt wird der ersten Referenz zugewiesen, danit man später über die Referenz auf das Objekt zugreifen kann
            }

            public Person getBeifahrer(){
                return this.beifahrer;
            }

        public void  nenneBesatzung(){
            System.out.println("");
            System.out.println(this.fahrer.getName() + " sitzt am Steuer von Fahrzeug 1 und " + this.beifahrer.getName() + " fährt Shotgun.");

            // Wenn die Besatzung genannt werden soll, bevor setFahrer() und setBeifahrer() die Referenzen fahrer und beifahrer gesetzt haben, passiert folgendes:
            // Es wird die Methode getName() eines unbekannten Objektes aufgerufen, also gibt es eine Fehlermeldung als Ausgabe.
        }

}
