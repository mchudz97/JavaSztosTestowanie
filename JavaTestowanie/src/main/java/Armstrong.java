


import java.util.Scanner;

public class Armstrong {


    int num = 0;
    public boolean isArmstrong(String kordjasz)

    {
        if (!kordjasz.matches("-{0,1}[0-9]+")){
            throw new IllegalArgumentException();
        }
        int num = 0;
        for(int i = 0;i<kordjasz.length();i++) {
            num += (int) Math.pow(Character.getNumericValue(kordjasz.charAt(i)), kordjasz.length());

        }
        if(num == Integer.parseInt(kordjasz)) {
            return true;
        }

        return false;
    }



}







