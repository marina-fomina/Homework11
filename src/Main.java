import Transport.Car;
import Transport.Car.Insurance;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Класс "Человек"
        System.out.println("Класс Человек");

        Human maxim = new Human(" ", null, -1987, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "продакт-менеджер");
        Human artem = new Human("Артём", "Москва", 1995, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2001, "сейчас нигде не работает.");

        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir.getName() + ", которому " + vladimir.getAgeInYears() + " год, живёт в городе " + vladimir.getTown() + ", " + vladimir.getJob());


        // Класс "Автомобиль"
        System.out.println("");
        System.out.println("Класс Автомобиль");
        Car lada = new Car("Lada", null, 0,"жёлтый", 0, "Россия",
                "универсал", 5, "механическая", "А521ВХ963", false,
                new Car.Key("нет удалённого запуска двигателя", "нет бесключевого доступа"),
                new Car.Insurance(LocalDate.now().plusMonths(4), 1_000, "125367854"));
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020,
                null, "седан", 5, "автоматическая", "У633АХ458",
                true, new Car.Key("удалённый запуск двигателя", "бесключевой доступ"),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1_500, "569852310"));
        Car bmw = new Car("BMW", "Z8", 3.0, " ", 2021, "Германия",
                "родстер", 2, "автоматическая", "Е313МТ785", false,
                new Car.Key("удалённый запуск двигателя", "бесключевой доступ"),
                new Car.Insurance(LocalDate.now().plusMonths(2), 2_000, "854632107"));
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018,
                "Южная Корея", "внедорожник", 5, "механическая", "Т846УУ124",
                true, new Car.Key("удалённый запуск двигателя", "бесключевой доступ"),
                new Car.Insurance(LocalDate.now().plusMonths(1), 1_500, "741258963"));
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", "седан", 5, "автоматическая", "М664АА741",
                true, new Car.Key("удалённый запуск двигателя", "бесключевой доступ"),
                new Car.Insurance(LocalDate.now().plusMonths(6), 2_000, "652300487"));

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        lada.setSeasonTyres();
        audi.setSeasonTyres();
        System.out.println("Регистрационный номер Audi A8 введен верно - " + audi.checkRegistrationNumber() + ".");


//        if (car.getInsurance().isInsuranceValid()) {
//            System.out.println("Страховка действительна.");
//        } else {
//            System.out.println("Страховка просрочена.");
//        }



        // Класс "Цветок"
        System.out.println("");
        System.out.println("Класс Цветок");
        Flower rose = new Flower("роза", null, "Голландия", 35.59f, 0);
        Flower chrysanthemum = new Flower("хризантема", "", "", 15.00f, 5);
        Flower peony = new Flower("пион", "", "Англия", 69.90f, 1);
        Flower gypsophila = new Flower("гипсофила", null, "Турция", 19.50f, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);
        BunchOfFlowers bunch1 = new BunchOfFlowers(new Flower[] {rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum,
                chrysanthemum, chrysanthemum, gypsophila});
        System.out.println("Стоимость букета цветов составит " + bunch1.getCostOfBunch() + " рублей. Срок стояния букета - "
                + bunch1.getLifeSpanOfBunch() + " дня.");
    }
}