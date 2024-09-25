public class Fahrzeug {

    // Attribute
    private String brand; // = "Tesla";
    private String model; // = "Model Y";
    private int length; // = 4750;
    private int width; // = 1921;
    private int height; // = 1624;

    // Referenzen

    // Konstruktor
    public Fahrzeug(String brand, String model, int length, int width, int height){
        this.brand = brand;
        this.model = model;
        this.length = length;
        this.width = width;
        this.height = height;
        datenAnzeigen();

    }

    // Methoden
    public void datenAnzeigen(){
        System.out.println("Hi. I'm your new " + brand + " " + model + " and my dimensions are " + length + " * " + width + " * " + height + ". For further information, look in the manual. Enjoy!");
    }

    // getter und setter
    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }
}
