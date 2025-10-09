public class Person implements Comparable<Person> {
    private int age;
    private String lastName, firstName;

    public Person(String firstName, String lastName, int age) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Person other) {
        if(this.age < other.age) {
            return -1;
        }
        else if (this.age > other.age) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Person p = new Person("John","Doe",12);
        Person me = new Person("Mark","Benders",21);

        System.out.println(p.compareTo(me));
    }
}