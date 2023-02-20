package home2;

public class Main {
    public static void main(String[] args) {
        GeometricFigure cube = new Cube(2,50);

        System.out.printf("Объем куба = ", cube);

        GeometricFigure sphere = new Sphere(3, 50);

        System.out.printf("Объем Сферы = ", sphere);

        int weight = 50;
        double volumeCube = cube.getVolume();
        double volumeSphere = sphere.getVolume();
        System.out.printf("Рассчет куба = ", GeometricFigure.formula((int) volumeCube,weight));
        System.out.printf("Рассчет сферы = ", GeometricFigure.formula((int) volumeSphere,weight));

    }
}