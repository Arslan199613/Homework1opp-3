public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    public Car(String brand,String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

    }
    void tellTheCar() {
        System.out.println(brand+" "+ model+","+ year+" года выпуска, сборка - "+country+", цвет -"+ color+", объем двигателя-"+engineVolume+".");
    }

}
