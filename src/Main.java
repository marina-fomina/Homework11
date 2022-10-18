public class Main {
    public static void main(String[] args) {
        // Класс "Человек"
        System.out.println("Класс Человек");

        Human maxim = new Human(" ", null, -1987, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "продакт-менеджер");
        Human artem = new Human("Артём", "Москва", 1995, "директор по развитию бизнеса");

        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);

        // Класс "Автомобиль"
        System.out.println("");
        System.out.println("Класс Автомобиль");
        Car lada = new Car("Lada", null, 0,"жёлтый", 0, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, null);
        Car bmw = new Car("BMW", "Z8", 3.0, " ", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}