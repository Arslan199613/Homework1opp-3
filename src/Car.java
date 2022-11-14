public class Car {
    public String brand;
    public String model;
    public String engineVolume;
    public String color;
    public int year;
    public String country;

    void tellTheCar() {
        System.out.println(brand+","+ year+" года выпуска, сборка - "+country+", цвет -"+ color+", объем двигателя-"+engineVolume);
    }

}
