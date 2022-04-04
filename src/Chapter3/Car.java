package Chapter3;

public class Car {
    static String CarModel;
    String CarYear;
    double CarPrice;


    public Car(String model, String year, double price) {
     this.CarModel = model;
     this.CarYear = year;
     this.CarPrice = price;
    }

    public String getCarModel() {

        return CarModel;
    }

    public String getCarYear() {

        return CarYear;
    }

    public double getCarPrice() {

        return CarPrice;
    }

    public double getDiscount(double percentage) {
        percentage =  (percentage / 100 * (CarPrice));
        return percentage;
    }

    public static class Car2 {
        String SecondCarModel;
        String SecondCarYear;
        double SecondCarPrice;


        public Car2(String secondModel, String ModelYear, double Secondprice) {
            this.SecondCarModel = secondModel;
            this.SecondCarYear =  ModelYear;
            this.SecondCarPrice = Secondprice;
        }


        public String getSecondCarModel() {
            return SecondCarModel;
        }

        public String getSecondCarYear() {
            return SecondCarYear;

        }

        public double getSecondCarPrice() {
            return SecondCarPrice;
        }

        public double getDiscount(double SecondPercentage) {
            SecondPercentage = (SecondPercentage / 100) * SecondCarPrice;

            return  SecondPercentage;

        }
    }
}
