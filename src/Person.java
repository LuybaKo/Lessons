public class Person {
    private String name; //объявляем поля
    private int apples;

    public Person(String name, int apples) {
        this.name = name;
        this.apples = apples;
    }

    public int coutDifference(Person person){
        return this.apples - person.getApples();
    }

    public String getName() {
        return name;
    }

    public int getApples() {
        return apples;
    }
}
