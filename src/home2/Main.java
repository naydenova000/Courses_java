package home2;
import java.util.*;




public class Main {
    public static void main(String[] args) {
        GeometricFigure cube = new Cube(2,50);

        System.out.printf("Объем куба = ", cube);

        GeometricFigure sphere = new Sphere(3, 50);
        GeometricFigure  sphere2= new Sphere(2,51);
        GeometricFigure  sphere3= new Sphere(3,52);
        GeometricFigure  sphere4= new Sphere(4,53);
        GeometricFigure  sphere5= new Sphere(5,54);
        GeometricFigure  sphere6= new Sphere(6,55);
        GeometricFigure  sphere7= new Sphere(7,56);
        GeometricFigure  sphere8= new Sphere(8,57);
        GeometricFigure  sphere9= new Sphere(9,58);
        GeometricFigure  sphere10= new Sphere(10,59);

        System.out.printf("Объем Сферы = ", sphere);

        int weight = 50;
        double volumeCube = cube.getVolume();
        double volumeSphere = sphere.getVolume();
        System.out.printf("Рассчет куба = ", GeometricFigure.formula((int)volumeCube,weight));
        System.out.printf("Рассчет сферы = ", GeometricFigure.formula((int)volumeSphere,weight));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(sphere);
        list.add(sphere2);
        list.add(sphere3);
        list.add(sphere4);
        list.add(sphere5);
        list.add(sphere6);
        list.add(sphere7);
        list.add(sphere8);
        list.add(sphere9);
        list.add(sphere10);


        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.get(weight)-1; i++) {
                if(list.get(weight) > list.get(weight)+1{
                    isSorted = false;

                    buf = list.get(i);
                    list.get(i) = list.get(i+1);
                    list.get(i+1) = buf;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}