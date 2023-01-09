public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        Example outClass = new Example();
        Example ourNewClass = new Example();
        Example example2 = new Example();
        example2.counter = 2;

        outClass.setCounter(15);
        ourNewClass.setCounter(10);

        int exampleInt = outClass.getCounter();
        int exampleInt2 = ourNewClass.getCounter();

        System.out.println("Значения Example:");
        System.out.println(example.getCounter());
        System.out.println(exampleInt);
        System.out.println(exampleInt2);
        System.out.println("--------------------");

        outClass.setName("Johan");
        ourNewClass.setName("Bober");


        System.out.println("Имена:");
        System.out.println(example.getName());
        System.out.println(outClass.getName());
        System.out.println(ourNewClass.getName());
        System.out.println(example2.getCounter());
        System.out.println("--------------------");








/// X
        Point2D point0 = new Point2D();
        Point2D point1 = new Point2D();
        point1.setX(15);
      //float pointFloat1 = point1.getX();
      //float pointFloat2 = point2.getX();
        System.out.println("Заданное значение X:");
        System.out.println(point1.getX());
        System.out.println("Изначальное значение X:");
        System.out.println(point0.getX());
        System.out.println("--------------------");
      //System.out.println(pointFloat1);
      //System.out.println(pointFloat2);




/// Y
        point1.setY(20);
      //float pointFloat3 = point1.getY();
      //float pointFloat4 = point1.getY();
        System.out.println("Заданное значение Y:");
        System.out.println(point1.getY());
        System.out.println("Изначальное значение Y:");
        System.out.println(point0.getY());
        System.out.println("--------------------");
      //System.out.println(pointFloat3);
      //System.out.println(pointFloat4);


        // Инициализирую объект (класс) Constructor - Start
        System.out.println("Сумма значений конструктора:");
        Constructor constructor = new Constructor(1,2, "3","4");
        System.out.println(constructor.Sum());
        System.out.println("--------------------");


        // Инициализирую объект
        System.out.println("Итог значений комплекса:");
        Complex complex = new Complex(5,6, "4","5");
        System.out.println(complex.Sum2());
        System.out.println("--------------------");


        // Различия между методами instance и static - Start
        Human peter = new Human();
        peter.printInstance();
        peter.changeName();
        System.out.println(peter.getName());


        // Различия между методами instance и static - End
        }
    }

