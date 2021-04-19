package Lesson6.Package2;

public class Distance {
    public double distance;

    void print(){

    }

    static class Convertor{
        public double fromMToKm(double m){
            return m/1000;
        }

        public double fromKmToM(double km){
            return km * 1000;
        }
    }
}
