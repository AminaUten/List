public class Car {
    private String make;
    private String model;
    private int year;
    private int speed;

    Car(String m, String o, int y) {
        make = m;
        model = o;
        year = y;
    }


    public void setModel(String model2) {
        if (!(model2.equals(""))) {
            model = model2;
        } else {
            System.out.println("Модель не может быть пустой");
        }
    }

    public void setMake(String make1) {
        if (!(make1.equals(""))) {
            make = make1;
        } else {
            System.out.println("Марка не может быть пустой");
        }
    }

    public int setYear(int year1) {
        if (year1 > 1990) {
            year = year1;
        } else {
            System.out.println("Некорректный год выпуска");
        } return year;
    }

    public void printCarInfo() {
        System.out.println("Марка: " + make);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Текущая скорость: " + speed + " км/ч.");;
    }

    public void accelerate(int boost) {
        if (!(boost < 0)) {
            speed += boost;
            System.out.println("Автомобиль ускорился на " + boost + " км/ч.");
        } else {
            System.out.println("Значения ускорения должно быть положительным");
        }
    }

    public void brake(int decrease){
        if (!(decrease < 0) && decrease <= speed) {
            speed-=decrease;
            System.out.println("Автомобиль замедлился на " + decrease + " км/ч.");
        } else {
            System.out.println("Значение замедления должно быть положительным");
        }
    }



}
