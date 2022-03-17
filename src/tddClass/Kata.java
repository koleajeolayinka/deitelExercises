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


}