package transport;

import java.time.LocalDate;

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
    private Key key;
    private Insurance insurance;


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
               boolean winterTires,
               Key key,
               Insurance insurance) {
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
        } else {
            this.transmission = transmission;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000х000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (bodytype == null) {
            this.bodytype = "седан";
        } else {
            this.bodytype = bodytype;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance== null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
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
                true,
                new Key(),
                new Insurance()
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
        winterTires = !winterTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
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

    public static class Key {
        private final boolean remoteEnginesStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEnginesStart, boolean keylessAccess) {
            this.remoteEnginesStart = remoteEnginesStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEnginesStart() {
            return remoteEnginesStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
        public static class Insurance {
            private final LocalDate insuranceValidityPeriod;
            private final double cost;
            private final String number;

            public Insurance(LocalDate insuranceValidityPeriod, double cost, String number) {
                if (insuranceValidityPeriod == null) {
                    this.insuranceValidityPeriod = LocalDate.now().plusDays(365);
                } else {
                    this.insuranceValidityPeriod = insuranceValidityPeriod;
                }
                this.cost = cost;
                if (number == null) {
                    this.number = "112121";
                } else {
                    this.number = number;
                }
            }

            public Insurance() {
                this(null, 10_000, null);
            }

            public LocalDate getInsuranceValidityPeriod() {
                return insuranceValidityPeriod;
            }

            public double getCost() {
                return cost;
            }

            public String getNumber() {
                return number;
            }
            public void checkInsuranceValidiryPeriod() {
                if (insuranceValidityPeriod.isBefore(LocalDate.now()) || insuranceValidityPeriod.isEqual(LocalDate.now())) {
                }
            }

            public void chectNumber() {
                if (number.length() != 9) {
                    System.out.println("Номер страховки некорректный");
                }
            }
        }
    }


