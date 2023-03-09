package home2;

import home2.GeometricFigure;

public class Sphere extends GeometricFigure {
    int radius;
    public Sphere(int radius, int weight){
        this.radius = radius;
        this.weight = weight;
    }
    public double getVolume() {
        return  (4 / 3 * 3.14 * Math.pow(radius, 3));
    }
}