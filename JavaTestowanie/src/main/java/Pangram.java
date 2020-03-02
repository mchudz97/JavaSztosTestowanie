public class Pangram {


    public boolean[] arePangrams(String[] pangrams){

        boolean[] pangbools = new boolean[pangrams.length];
        for (int i=0; i<pangrams.length; i++) {

            pangbools[i] = isPangram(pangrams[i]);

        }

        return pangbools;

    }




    public boolean isPangram(String str) {

        if(str == null ){

            throw new IllegalArgumentException();

        }

        if(str == ""){

            throw new IllegalArgumentException();

        }

        boolean[] truth = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {

                truth[(int) str.charAt(i) - 65] = true;//65-90

            }


            if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {

                truth[(int) str.charAt(i) - 97] = true;

            }

        }



        for (int i = 0; i < truth.length; i++) {

            if (truth[i] != true) {

                return false;

            }


        }
        return true;
    }


}
