

public class Les1 {

    public static void main(String[] args) {
        print(calculate());
    }

    public static int calculate() {
        int total = 15, Peta = 10;
        int x = total - Peta;
        return x;
    }

    public static void print(int apples){
        System.out.println(apples);
    }

    public static int countDifferenceBetweenPersons(Person p1, Person p2){
        return p1.getApples() - p2.getApples();
    }

}
