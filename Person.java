/**
 * Person
 */
public class Person {

    String nom;
    int age;
    double salaire ;

    Person() {
    }

    Person(String nom, int age, double salaire) {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
    }

    Person(String nom, int age) {
        this.nom = nom;
        this.age = age;
       this.salaire = -1;

    }

    public String displayInfo() {

        return "Person [nom=" + nom + ", age=" + age + ", salaire "+salaire+"]";

    }



}