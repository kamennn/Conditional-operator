public class Main {
    public static void main(String[] args) {
        //первая задача//
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздраваляем  с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Мы вас поздравим позже");
        }
        //вторая задача//
        int child = 7;
        if (child >= 7) {
            System.out.println("Ребенок идет в школу");
        }
        if (child < 7) {
            System.out.println("Ребенек не может идти в школу");
        }
        int teenager = 18;
        if (teenager >= 18) {
            System.out.println("Подросток уже закончил школу и может отправляться в университет");
        }
        if (teenager < 18) {
            System.out.println("Должен закончить школу");
        }
        int adult = 24;
        if (adult >= 24) {
            System.out.println("Взрослый окончил университет и ему пора искать первую работу");
        }
        if (adult < 24) {
            System.out.println("Должен закончить университет");
        }
        //третья задача//
        int wagonCapacity = 30;
        if (wagonCapacity >= 102) {
            System.out.println("Вагон уже полностью забит");
        }
        if (wagonCapacity < 102) {
            System.out.println("В вагоне есть стоячии места");
        }
        if (wagonCapacity < 60) {
            System.out.println("В вагоне есть сидячии места");
        }
        //Домашнее задание - 2. Задание 1//
        int age1 = 11;
        if (age1 >= 18) {
            System.out.println("Поздраваляем  с совершеннолетием");
        } else {
            System.out.println("Мы вас поздравим позже");
        }
        //втрорая задача//
        int child1 = 5;
        if (child1 >= 7) {
            System.out.println("Ребенок идет в школу");
        } else {
            System.out.println("Ребенек не может идти в школу");
        }
        int teenager1 = 15;
        if (teenager1 >= 18) {
            System.out.println("Подросток уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Должен закончить школу");
        }
        int adult1 = 23;
        if (adult1 >= 24) {
            System.out.println("Взрослый окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Должен закончить университет");
        }
        //третья задача//
        int wagonCapacity1 = 49;
        if (wagonCapacity1 >= 102) {
            System.out.println("вагон уже полностью забит");
        } else {
            System.out.println("В вагоне есть стоячии места");
        }
        //Домашнее задание - 3. Задание 1//
        int ageСhild = 1;
        if (ageСhild >= 2 && ageСhild <= 6) {
            System.out.println("нужно ходить в детский сад");
        } else {
            System.out.println("не ходит в детский сад");
        }
        int ageTeenager = 9;
        if (ageTeenager >= 7 && ageTeenager <= 18) {
            System.out.println("нужно ходить в школу");
        } else {
            System.out.println("не нужно ходить в школу");
        }
        int adultYears = 25;
        boolean timeToWork = adultYears > 24;
        if (adultYears >= 18 || adultYears < 24) {
            System.out.println("его место в университете");
        }
        if (timeToWork) {
            System.out.println("пора ходить на работу");
        }
        //вторая задача//
        int toKid = 15;
        boolean accompaniedByAnAdult = toKid >5 && toKid<14;
        if (toKid>14) {
            System.out.println("он может кататься без сопровождения взрослого");
        }
        if (accompaniedByAnAdult) {
            System.out.println("он может кататься только в сопровождении взрослого");
        }else {
            System.out.println("он не может кататься на аттракционе");
        }
    }
}