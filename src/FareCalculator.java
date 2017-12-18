public class FareCalculator {
    double initialCharge = 2.25;
    double costPerBlock = .25;
    double tipPercentage = .04;

    FareCalculator(){

    }

    public double CalculateFare(int blocks){

        double result;
        result = initialCharge + ((blocks*costPerBlock)*(1 + tipPercentage));

        return result;
    }

}
