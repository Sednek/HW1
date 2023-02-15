package homeworks;

public class Homework_13_02_2023 {
    public static void Task1(){
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Task 1:");
        System.out.printf("| dog: %.2f  | cat: %.2f | paper: %d |\n", dog, cat, paper);
        System.out.println(" ");
    }
    public static void Task2(){
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Task 2:");
        System.out.printf("| dog: %.2f | cat: %.2f | paper: %d |\n", dog + 4, cat + 4, paper + 4);
        System.out.println(" ");
    }
    public static void Task3(){
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Task 3:");
        System.out.printf("| dog: %.2f  | cat: %.2f | paper: %d |\n", dog - 3.5, cat - 1.6, paper - 7639);
        System.out.println(" ");
    }
    public static void Task4(){
        var friend = 19;

        friend = (friend + 2) / 7;

        System.out.println("Task 4:");
        System.out.println("Friend - " + friend);
        System.out.println(" ");
    }
    public static void Task5(){
        var frog = 3.5;

        System.out.println("Task 5:");
        System.out.println("Frog = " + frog);

        frog = frog * 10;

        System.out.println("Multiply by 10 = " + frog);

        frog = frog / 3.5;

        System.out.println("Divide by 3.5 = " + frog);

        frog = frog  + 4;

        System.out.println("Plus 4 = " + frog);
        System.out.println(" ");
    }
    public static void Task6(){
        var mikeTyson = 78.2;
        var nikValuev = 82.7;
        var totalWeight = 0.0;
        var weightDifference = 0.0;

        totalWeight = mikeTyson + nikValuev;
        weightDifference = nikValuev - mikeTyson;

        System.out.println("Task 6:");
        System.out.println("Total weight of fighters = " + totalWeight + " kg");
        System.out.println("Weight difference = " + weightDifference + " kg");
        System.out.println(" ");
    }
    public static void Task7(){
        var mikeTyson = 78.2;
        var nikValuev = 82.7;
        var weightDifference = 0.0;

        System.out.println("Task 7:");

        weightDifference = nikValuev - mikeTyson;

        System.out.println("Weight difference using minus = " + weightDifference + " kg");

        weightDifference = nikValuev % mikeTyson;

        System.out.println("Weight difference using mod = " + weightDifference + " kg");
        System.out.println(" ");

    }
    public static void Task8(){
        var totalHours = 640;
        var hoursPerPerson = 8;
        var totalPersons = 0;

        totalPersons = totalHours / hoursPerPerson;

        System.out.println("Task 8:");
        System.out.println("Всего работников в компании — " + totalPersons + " человек");

        totalPersons = totalPersons + 94;
        totalHours = totalPersons * hoursPerPerson;

        System.out.println("Если в компании работает " + totalPersons + " человека, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}