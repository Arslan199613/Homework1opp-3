package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private String bodytype;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean winterTires;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodytype,
               String registrationNumber,
               int numberOfSeats,
               boolean winterTires) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.engineVolume = engineVolume;
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        this.year = year;
        if (transmission == null) {
            this.transmission = "МККП";
        }else {
            this.transmission = transmission;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000х000";
        }else{
            this.registrationNumber = registrationNumber;
        }
        if (bodytype == null) {
            this.bodytype = "седан";
        }else{
            this.bodytype = bodytype;
        }

        this.numberOfSeats = numberOfSeats;
        this.winterTires = true;

    }
    public Car(String brand, String model, double engineVolume, String color, int year, String country) {

        this(
                brand,
                model,
                engineVolume,
                color,
                year,
                country,
                "МКПП",
                "х000х000",
                "седан",
                5,
                true
        );

        this.transmission = "МКПП";
        this.registrationNumber = "х000х000";
        this.bodytype = "седан";
        this.numberOfSeats = numberOfSeats;
        this.winterTires = true;

    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
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
        if (registrationNumber ==null) {
            this.registrationNumber = "х000х000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
        public boolean getWinterTires () {
            return winterTires;

    }
    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodytype() {
        return bodytype;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void changeTyres() {
        winterTires =!winterTires;
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }
}
