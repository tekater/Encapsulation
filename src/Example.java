public class Example {
    int counter = 20; // fields поля класса
    String name = "Moshka";
    public Example() {
        this.counter = counter;
        this.name = name; // Внутри класса можно и без this. однако лучше с ней)

    }
    // setter метод для изменения поля класса
    public void setCounter(int counter) {
        this.counter = counter;
    }
    // getter метод для получения поля класса
    public int getCounter() {
        return this.counter;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

