package validation;


public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException {
        if (name == null || name.length() == 0 || name.length() > 40)
            throw new IllegalArgumentException();
        this.name = name;
        if (age < 0 || age > 120)
            throw new IllegalArgumentException();
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
