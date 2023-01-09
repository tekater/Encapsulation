public class Human {
    String name;
    int age;
    public static void printStatic() {
        System.out.println("Это статический метод");
    }
    public void changeName() {
        setName("Name static");
    }
    public void printInstance() {
        System.out.println("Это метод инстанса");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
