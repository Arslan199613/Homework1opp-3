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

        System.out.println("Машины:");
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

        System.out.println("Поезда:");
        printInfoTrains(lastochka);
        printInfoTrains(leningrad);

        System.out.println("Автобусы:");
        printInfoBuses(bus1);
        printInfoBuses(bus2);
        printInfoBuses(bus3);

        System.out.println();
        System.out.println("Абстрактные методы:");
        System.out.println("Автомобиль:");
        lada.refill();
        System.out.println("Поезд:");
        lastochka.refill();
        System.out.println("Автобус:");
        bus1.refill();

    }

    public static void printInfo(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() + ",год выпуска" + car.getYear() + ",страна сборки - " +
                        car.getCountry() + ", цвет кузова-" + car.getColor() + ", объем двигателя-" + car.getEngineVolume() +
                        ", коробка передач : " + car.getTransmission() + ",тип кузова: " + car.getBodytype() + ", регистрационный номер " + car.getRegistrationNumber() +
                        "количество мест:" + car.getNumberOfSeats() + ", " + (car.getWinterTires() ? "летняя" : "зимняя") + "резина");
    }

    public static void printInfoTrains(Train train) {
        System.out.println("Поезд- "+train.getBrand()+
                ", Модель-"+train.getModel()+","+train.getYear()+
                " год выпуска в "+train.getCountry()+",скорость передвижения-"
                +train.getSpeed()+" км/ч"+",цена поездки-"+train.getCostOfTrip()+
                ",отходит -"+train.getNameOfStartPoint()+", и следует-"+train.getNameOfEndPoint()+
                ", в поезде "+train.getNumberOfWagons()+" вагонов");
    }

    public static void printInfoBuses(Bus bus) {
        System.out.println(bus.getBrand()+","+bus.getModel()+"," +bus.getYear()+
                ","+bus.getCountry()+","+bus.getSpeed());
    }
}