package transport;

import java.util.Objects;

public class Train extends Transport {
    private double costOfTrip;
    private String timeOfTrip;
    private String nameOfStartPoint;
    private String nameOfEndPoint;
    private int numberOfWagons;

    public Train(String brand, String model, int year, String country, double speed, double costOfTrip, String nameOfStartPoint, String nameOfEndPoint, int numberOfWagons) {
        super(brand, model, year, country, speed);
        if (costOfTrip < 0) {
            this.costOfTrip = 0;
        } else {
            this.costOfTrip = costOfTrip;
        }
        if (nameOfStartPoint == null) {
            this.nameOfStartPoint = "default";
        } else {
            this.nameOfStartPoint = nameOfStartPoint;
        }
        if (nameOfEndPoint == null) {
            this.nameOfEndPoint = "default";
        } else {
            this.nameOfEndPoint = nameOfEndPoint;
        }
        if (numberOfWagons < 0) {
            this.numberOfWagons = 0;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }
    public Train(String brand, String model, int year, String country, double speed, double costOfTrip, String timeOfTrip, String nameOfStartPoint, String nameOfEndPoint, int numberOfWagons) {
        super(brand, model, year, country, speed);
        if (costOfTrip > 0) {
            this.costOfTrip = 0;
        } else {
            this.costOfTrip = costOfTrip;
            if (timeOfTrip == null) {
                this.timeOfTrip = "default";
            } else {
                this.timeOfTrip = timeOfTrip;
            }
        }
        if (nameOfStartPoint == null) {
            this.nameOfStartPoint = "default";
        } else {
            this.nameOfStartPoint = nameOfStartPoint;
        }
        if (nameOfEndPoint == null) {
            this.nameOfEndPoint = "default";
        } else {
            this.nameOfEndPoint = nameOfEndPoint;
        }
        if (numberOfWagons > 0) {
            this.numberOfWagons = 0;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    public double getCostOfTrip() {
        return costOfTrip;
    }

    public void setCostOfTrip(double costOfTrip) {
        if (costOfTrip > 0) {
            this.costOfTrip = 0;
        } else {
            this.costOfTrip = costOfTrip;
        }
    }

    public String getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(String timeOfTrip) {
        if (timeOfTrip == null) {
            this.timeOfTrip = "default";
        } else {
            this.timeOfTrip = timeOfTrip;
        }
    }

    public String getNameOfStartPoint() {
        return nameOfStartPoint;
    }

    public void setNameOfStartPoint(String nameOfStartPoint) {
        if (nameOfStartPoint == null) {
            this.nameOfStartPoint = "default";
        } else {
            this.nameOfStartPoint = nameOfStartPoint;
        }
    }

    public String getNameOfEndPoint() {

        return nameOfEndPoint;
    }

    public void setNameOfEndPoint(String nameOfEndPoint) {
        if (nameOfEndPoint == null) {
            this.nameOfEndPoint = "default";
        } else {
            this.nameOfEndPoint = nameOfEndPoint;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons > 0) {
            this.numberOfWagons = 0;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");

    }

    @Override
    public String toString() {
        return  "Поезд- "+getBrand()+
                ", Модель-"+getModel()+","+getYear()+
                " год выпуска в "+getCountry()+",скорость передвижения-"
                +getSpeed()+" км/ч"+",цена поездки-"+costOfTrip+
                ",отходит -"+nameOfStartPoint+", и следует-"+nameOfEndPoint+
                ", в поезде "+numberOfWagons+" вагонов";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Train train = (Train) o;
        return Double.compare(train.costOfTrip, costOfTrip) == 0 && numberOfWagons == train.numberOfWagons && Objects.equals(timeOfTrip, train.timeOfTrip) && Objects.equals(nameOfStartPoint, train.nameOfStartPoint) && Objects.equals(nameOfEndPoint, train.nameOfEndPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), costOfTrip, timeOfTrip, nameOfStartPoint, nameOfEndPoint, numberOfWagons);
    }
}