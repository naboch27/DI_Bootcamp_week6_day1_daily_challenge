public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Person person1 = new Person("Mouhamed",10,1000);

        Person person2 = new Person("Mouhamed",10);
        
        System.out.println(person.displayInfo());

        System.out.println(person1.displayInfo());

        if(person2.salaire == -1)

        System.out.println("Salaire non fourni");
    }
}
