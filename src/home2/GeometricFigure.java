package home2;

abstract class GeometricFigure {
    int weight;
    abstract double getVolume();
    public static int formula(int v, int m) {
        return v / m;
    }
}