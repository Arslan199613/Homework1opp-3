public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    public Car(String brand,String model, double engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        }else{
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        }else{
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        }else{
            this.color = color;
        }
        if (year == 0) {
            this.year = 200;
        }else {
            this.year = year;
        }
        this.country = country;

    }
    void tellTheCar() {
        System.out.println(brand+" "+ model+","+ year+" года выпуска, сборка - "+country+", цвет -"+ color+", объем двигателя-"+engineVolume+".");
    }

}
