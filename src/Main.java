public class Main {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.brand = "Lada Granta";
        lada.year = 2015;
        lada.country = "Россия";
        lada.color = "желтый";
        lada.engineVolume = "1,7 л.";
        lada.tellTheCar();

        Car audi = new Car();
        audi.brand = "Audi A8 50 L TDI quattro";
        audi.year = 2020;
        audi.country = "Германия";
        audi.color = "черный";
        audi.engineVolume = "3,0 л.";
        audi.tellTheCar();

        Car bmw = new Car();
        bmw.brand = "BMW Z8";
        bmw.year = 2021;
        bmw.country = "Германия";
        bmw.color = "черный";
        bmw.engineVolume = "3,0 л.";
        audi.tellTheCar();

        Car kia = new Car();
        kia.brand = "Kia Sportage 4-го поколения";
        kia.year = 2018;
        kia.country = "Южная Корея";
        kia.color = "красный";
        kia.engineVolume = "2,4 л.";
        kia.tellTheCar();

        Car hyundai = new Car();
        hyundai.brand = "Hyundai Avante";
        hyundai.country = "Южная Корея";
        hyundai.color = "оранжевый";
        hyundai.engineVolume = "1,6 л.";
        hyundai.year = 2016;
        hyundai.tellTheCar();
    }
}