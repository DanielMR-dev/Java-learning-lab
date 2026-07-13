package week04oop.examples;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("El nombre no puede estar vacio");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("La edad no puede ser negativa");
            return;
        }
        this.age = age;
    }

    public void introduceYourself() {
        System.out.println("Hola, mi nombre es "  + this.name + " y tengo " + this.age + " años.");
    }

    public static void main(String[] args) {
        Person person = new Person("Daniel", 23);

        person.introduceYourself();

        person.setAge(24);
        System.out.println("Mi nueva edad es " +  person.getAge());
    }
}
