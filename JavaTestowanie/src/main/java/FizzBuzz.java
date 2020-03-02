public class FizzBuzz {

    public String print(int number){

        String print = "";

        if(number < 0){
            throw new IllegalArgumentException();
        }

        if(number % 3 == 0){
            print += "Fizz";
        }
        if (number % 5 == 0){
            print += "Buzz";
        }
        if (print == ""){
            return Integer.toString(number);
        }

        return print;
    }


}
