import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Point {
    public double x;
    public double y;

    public Point (double x, double y){

        this.x = x;
        this.y = y;

    }

    public Point show (){

        System.out.println(this.x + " " + this.y);
        return this;

    }

    public Point translate (double x, double y){

        return new Point(this.x + x, this.y +y);

    }

    public Point scale(double sca){

        return new Point(this.x * sca, this.y * sca);

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }


}