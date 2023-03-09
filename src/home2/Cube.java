package home2;

public class Cube extends GeometricFigure {
    int side;
    public Cube(int side, int weight){
        this.side = side;
        this.weight = weight;
    }
    public double getVolume() {
        return  Math.pow(side, 3);
    }
}