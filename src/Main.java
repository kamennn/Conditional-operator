public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1 первая задача//
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
        if (wagonCapacity >= 60 && wagonCapacity < 102) {
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
        int wagonCapacity1 = 120;
        if (wagonCapacity1 >= 102) {
            System.out.println("вагон уже полностью забит");
        } else if (wagonCapacity1 < 60) {
            System.out.println("В вагоне есть сидячии места");
        } else {
            System.out.println("В вагоне есть стоячии места");
        }
        //Домашнее задание - 3. Задание 1//
        int yearsOld = 25;
        if (yearsOld >= 2 && yearsOld <=6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        }else if (yearsOld>6 && yearsOld <=18) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        }else if (yearsOld>18 && yearsOld <=24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет");
        }else if (yearsOld>24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в работу");
        }
        //вторая задача//
        int toKid = 15;
        if (toKid > 14) {
            System.out.println("если рубенку " + toKid + " он может кататься без сопровождения взрослого");
        }else if (toKid >=5 && toKid<=14) {
            System.out.println("если рубенку " + toKid + " он может кататься только в сопровождении взрослого");
        }else {
            System.out.println("если рубенку " + toKid + " он не может кататься на аттракционе");
        }
        //третья задача//
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one>=three) {
            System.out.println(one + " большее из трех чисел");
        }else if (two >= one && two >=three) {
            System.out.println(two + " большее из трех чисел");
        }else{
            System.out.println(three + " большее из трех чисел");
        }
    }
}