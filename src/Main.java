//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Task 1

    int age;
        age = 15;
        if (18 <= age) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {System.out.println("Если возраст человека равен " + age + ", " +
                "то он не достиг совершеннолетия, нужно немного подождать");
        }

//Task 2

    int degree = 4;

    if (degree > 5) {
        System.out.println("На улице " + degree + " градусов, можно идти без шапки");
    }
    else {
        System.out.println("На улице " + degree + " градусов, нужно надеть шапку");
    }
//Task 3

    int speed = 50;

    if (speed < 60){
        System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
    }
    else {
        System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
    }
//Task 4

    int personAge = 54;

    if (personAge >= 2 && personAge <= 6){
        System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
    }  else if (personAge >= 7 && personAge <= 17) {
        System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        }
    else if (personAge >= 18 && personAge <= 24) {
        System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет");

        }
    else {
        System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу");
    }
//Task 5

    int ageOfChild = 9;

    if (ageOfChild < 5){
        System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему нельзя кататься на аттракционе");
    }
    else if (ageOfChild >= 5 && ageOfChild <14) {
        System.out.println("Если возраст ребенка равен " + ageOfChild +
                ", то ему  можно кататься на аттракционе в сопровождении взрослого");
    }
    else {
        System.out.println("Если возраст ребенка равен " + ageOfChild +
                ", то ему можно кататься без сопровождения взрослого");
    }
//Task 6

    int totalCapacity = 102;

    int capacityOfSeats = 60;

    int capacityOfStandingPlaces = totalCapacity - capacityOfSeats;

    int countOfPassengers = 102;

    if (countOfPassengers < totalCapacity){
        if (countOfPassengers <= capacityOfSeats) {
            System.out.println("В вагоне осталось " + (totalCapacity - countOfPassengers) + " мест. Сидячих " +
                    (capacityOfSeats - countOfPassengers) + " мест. Стоячих " + capacityOfStandingPlaces + " мест");
        } else System.out.println("Сидячих мест нет. Стоячих осталось " +
                (capacityOfStandingPlaces - (countOfPassengers - capacityOfSeats)) + " мест");
    }
    else {
        System.out.println("В вагоне мест нет");
    }

//Task 7

    int one = 7;
    int two = 47;
    int three = 1;
    
    if (one > two && one > three){
        System.out.println("Первое самое большое " + one);
    } else if (two > one && two > three) {
        System.out.println("Второе самое большое " + two);
    }
    else {
        System.out.println("Третье самое большое " + three);
    }
    }
}