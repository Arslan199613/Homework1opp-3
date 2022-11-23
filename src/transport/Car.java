package transport;


import java.util.Objects;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String bodytype;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean winterTires;

    public Car(String brand, String model, int year, String country, double engineVolume, String transmission, String bodytype, String registrationNumber, int numberOfSeats, boolean winterTires) {
        super(brand, model, year, country);
        this.engineVolume = engineVolume;
        if (transmission == null) {
            this.transmission = "МККП";
        } else {
            this.transmission = transmission;
        }
        if (bodytype == null) {
            this.bodytype = "седан";
        } else {
            this.bodytype = bodytype;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000х000";
        } else {
            this.registrationNumber = registrationNumber;
            this.numberOfSeats = numberOfSeats;
            this.winterTires = true;
        }
    }

    public Car(String brand, String model, int year, String country, double engineVolume) {
        super(brand, model, year, country);
        this.engineVolume = engineVolume;

    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else
            this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000х000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public String getBodytype() {
        return bodytype;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void changeTyres() {
        winterTires = !winterTires;
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;

        }
        return false;

    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
        System.out.println("Можно заряжать на специальных электропарках, если это электрокар");

    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ",год выпуска-" + getYear() + ",страна сборки - " +
                getCountry() + ", объем двигателя-" + getEngineVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && numberOfSeats == car.numberOfSeats && winterTires == car.winterTires && Objects.equals(transmission, car.transmission) && Objects.equals(bodytype, car.bodytype) && Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, transmission, bodytype, registrationNumber, numberOfSeats, winterTires);
    }
}



