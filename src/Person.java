public class Person {

    // Atribute
    private String name; // = "Peter";
    private int age; // = 15;

    // Referenzen

    // Konstruktor
    public Person(String name,int age){ // Einzige Mothode, deren Bezeichner großgeschrieben wird // Datentyp obligatorisch
        this.name = name;
        this.age = age;
        halloSagen();
    }

    // Methoden
    public void halloSagen(){
        System.out.println("Well, hello there! My name is " + name + " and I'm " + age + " years old.");
    }
}
