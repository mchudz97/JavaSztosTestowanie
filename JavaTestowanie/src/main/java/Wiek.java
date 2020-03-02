import java.util.HashMap;
import java.util.Map;

public class Wiek {

        public double planetarAge(String planet, int seconds) {

            if (seconds < 0) throw new IllegalArgumentException();

            String[] planets = new String[]{ "Ziemia", "Merkury", "Wenus", "Mars", "Jowisz",
                    "Saturn", "Uran", "Neptun" };

            double[] timers = new double[]{ 1.0, 0.2408467, 0.61519726, 1.8808158, 11.862615,
                    29.447498, 84.016846, 164.79132 };

            int earthYear = 31557600;

            double roundingTime = 0.0;

            for (int i = 0; i < planets.length; i++){

                if( planet == planets[i] ){

                    roundingTime = timers[i];
                    break;

                }

            }

            if (roundingTime == 0.0) throw new IllegalArgumentException();

            return seconds / (roundingTime * earthYear);


        }



}
