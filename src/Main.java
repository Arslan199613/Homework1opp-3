import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        lada.setRegistrationNumber("в431оу1199");
        System.out.println(lada.isCorrectRegNumber());
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        audi.setTransmission("автомат");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        bmw.setWinterTires(false);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

    }

    public static void printInfo(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + "," + car.getYear() + " года выпуска, сборка - " +
                car.getCountry() + ", цвет -" + car.getColor() + ", объем двигателя-" + car.getEngineVolume() +
                ", коробка передач : "+car.getTransmission()+ ", тип кузова: "+car.getBodytype()+", количество мест- "+
                car.getNumberOfSeats()+", "+(car.getWinterTires()? "летняя" : "зимняя")+"резина");
    }
}