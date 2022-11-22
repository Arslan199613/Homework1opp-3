package transport;

import java.time.LocalDate;

public class Car extends Transport {


    private double engineVolume;
    private String transmission;
    private String bodytype;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean winterTires;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, int year, String country, double engineVolume, String transmission, String bodytype, String registrationNumber, int numberOfSeats, boolean winterTires, Key key, Insurance insurance) {
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
            if (key == null) {
                this.key = new Key();
            } else {
                this.key = key;
            }
            if (insurance == null) {
                this.insurance = new Insurance();
            } else {
                this.insurance = insurance;
            }

        }
    }

    public Car(String brand, String model, int year, String country, double engineVolume) {
        super(brand, model, year, country);
        this.engineVolume = engineVolume;
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
        System.out.println("Можно заряжать на специальных электропарках, если это электрокар");
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
        return false;
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
                    this.number = "112121111";
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


            public void checkNumber() {
                if (number.length() != 9) {
                    System.out.println("Номер страховки некорректный");
                }
            }
        }
    }


