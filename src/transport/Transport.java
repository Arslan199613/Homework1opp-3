package transport;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private  int year;
    private  String country;
    private String color;
    private double speed;

    public Transport(String brand, String model, int year, String country, String color, double speed) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
            this.year = year;
            if (country == null) {
                this.country = "default";
            } else {
                this.country = country;
            }
            if (color == null) {
                this.color = "белый";
            } else {
                this.color = color;
            }
            if (speed < 0) {
                this.speed = 0;
            } else {
                this.speed = speed;
            }
        }
    }

    public Transport(String brand, String model, int year, String country, double speed) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
            this.year = year;
            if (country == null) {
                this.country = "default";
            } else {
                this.country = country;
            }
            if (speed < 0) {
                this.speed = 0;
            } else {
                this.speed = speed;
            }
        }
    }
    public Transport(String brand, String model, int year, String country) {
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
        this.year = year;
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
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
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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

    public abstract void refill();

    @Override
    public String toString() {
        return brand + model + year + country + color + speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && Double.compare(transport.speed, speed) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, speed);
    }
}





