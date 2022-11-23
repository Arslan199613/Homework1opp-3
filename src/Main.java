import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "Россия", 1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", 3.0);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", 3.0);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", 1.6);

        Train lastochka = new Train("Ласточка", "В-901", 2011, "России", 301, 3500, "от Белорусского вокзала", "до станции Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "России", 270, 1700, "от Ленинградского о вокзала", "до станции Ленинград-Пассажирский", 8);

        Bus bus1 = new Bus("Большой", "автобус", 2015, "Россия", "красный", 200);
        Bus bus2 = new Bus("Маленький", "автобус", 2015, "Бразилия", "желтый", 200);
        Bus bus3 = new Bus("Средний", "автобус", 2015, "Германия", "белый", 200);

        System.out.println("Автомобили");
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
        System.out.println("Поезда");
        System.out.println(lastochka.toString());
        System.out.println(leningrad.toString());
        System.out.println("Автобусы");
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.println(bus3.toString());

    }
}