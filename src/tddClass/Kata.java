package tddClass;

public class Kata {

    private int numbers;

    public int numbers(int numbers) {
        int above = numbers;
        if(numbers >= 1 && numbers <= 4){numbers = numbers*2000;}
       else if(numbers >= 5 && numbers <= 9){numbers = numbers*1800;}
       else if(numbers >= 10 && numbers <= 29){numbers = numbers*1600;}
       else if(numbers >= 30 && numbers <= 49){numbers = numbers*1500;}
       else if(numbers >= 50 && numbers <= 99){numbers = numbers*1300;}
       else if(numbers >= 100 && numbers <= 199){numbers = numbers*1200;}
       else if(numbers >= 200 && numbers <= 499){numbers = numbers*1100;}
       else if(numbers >= 500){numbers = numbers*1000;}
       return numbers;

    }


    public boolean isEvenNumber(int number) {
        if(number % 2 == 0) return true;
        return false;
    }



    public int maxInt(int number1, int number2, int number3, int number4, int number5) {
        if(number1>number2 && number1>number3 && number1>number4 && number1>number5) return number1;
        if(number2>number1 && number2>number3 && number2>number4 && number2>number5) return number2;
        if(number3>number1 && number3>number2 && number3>number4 && number3>number5) return number3;
        if(number4>number1 && number4>number3 && number4>number3 && number4>number5) return number4;
        if(number5>number1 && number5>number2 && number5>number3 && number5>number4) return number5;
        return 0;
    }


    public int numInt(int factors)  {
    if(numbers <= 2) return numbers;
    return 0;
    }


    public boolean isPrimeNumber(int digit) {
        if( digit<=2) return true;
        return false;
    }


}
