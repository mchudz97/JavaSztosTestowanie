public class RomanNumeral {
    private int num;

    public RomanNumeral(int num){
        this.num = num;
    }
    public String getRomanNumeral(){
        int val = num;
        return romanCalc(val);
    }
    private String romanCalc(int num){
        String romanVal = "";
        while(num != 0){

            if(num >= 1000){
                romanVal += "M";
                num -= 1000;
            }

            else if(num >= 900){
                romanVal += "CM";
                num -= 900;
            }

            else if(num >= 500){
                romanVal += "D";
                num -= 500;
            }

            else if(num >= 400){
                romanVal += "CD";
                num -= 400;
            }

            else if(num >= 100){
                romanVal += "C";
                num -= 100;
            }

            else if(num >= 90){
                romanVal += "XC";
                num -= 90;
            }

            else if(num >= 50){
                romanVal += "L";
                num -= 50;
            }

            else if(num >= 40){
                romanVal += "XL";
                num -= 40;
            }

            else if(num >= 10){
                romanVal += "X";
                num -= 10;
            }

            else if(num >= 9){
                romanVal += "IX";
                num -= 9;
            }

            else if(num >= 5){
                romanVal += "V";
                num -= 5;
            }

            else if(num >=4){
                romanVal += "IV";
                num -= 4;
            }

            else if (num >= 1){
                romanVal += "I";
                num -= 1;
            }

        }

        return romanVal;

    }

}
