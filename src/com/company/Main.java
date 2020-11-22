package com.company;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Quadrangle> quadrangleArrayList = new ArrayList<>();
        quadrangleArrayList.add(new Quadrangle(4, 9, 9, 9, 9, 5, 4, 5));
        quadrangleArrayList.add(new Quadrangle(3, 5, 5, 6, 6, 2, 1, 2));
        quadrangleArrayList.add(new Quadrangle(3, 5, 5, 6, 6, 2, 1, 2));
        quadrangleArrayList.add(new Quadrangle(3, 5, 5, 6, 6, 2, 1, 2));
        quadrangleArrayList.add(new Quadrangle(3, 5, 5, 6, 6, 2, 1, 2));
        quadrangleArrayList.add(new Quadrangle(3, 5, 5, 6, 6, 2, 1, 2));
        quadrangleArrayList.add(new Quadrangle(2, 7, 7, 7, 7, 3, 2, 3));
        quadrangleArrayList.add(new Quadrangle(3, 8, 8, 8, 8, 4, 3, 4));
        quadrangleArrayList.add(new Quadrangle(3, 8, 8, 8, 8, 4, 3, 4));

        quadrangleArrayList.removeIf(quadrangle -> !quadrangle.isExists());
        System.out.println("Четерехугольники:");
        System.out.println(quadrangleArrayList);
        System.out.println("");

        ArrayList<Quadrangle> maxArea = new ArrayList<>();
        Quadrangle quadrangle = Collections.max(quadrangleArrayList, Comparator.comparing(s -> s.findArea()));
        maxArea.add(quadrangle);
        quadrangleArrayList.remove(quadrangle);

        for (int i = 0; i < quadrangleArrayList.size(); i++) {
            Quadrangle currentQuadrangle = quadrangleArrayList.get(i);
            if (currentQuadrangle.findArea() == quadrangle.findArea()){
                maxArea.add(currentQuadrangle);
            }
        }
        System.out.println("");
        System.out.println("Максимальная площадь четырехугольников: " + quadrangle.findArea());
        System.out.println("Кол-фо четырехугольников с максимальной площадью: " + maxArea.size());

        ArrayList<IsoscelesTrapezoid> isoscelesTrapezoidArrayList = new ArrayList<>();
        isoscelesTrapezoidArrayList.add(new IsoscelesTrapezoid(-2,0,-1, 2, 1, 2, 2,0));
        isoscelesTrapezoidArrayList.add(new IsoscelesTrapezoid(-2,0,-1, 3, 1, 3, 2,0));
        isoscelesTrapezoidArrayList.removeIf(isoscelesTrapezoid -> !isoscelesTrapezoid.isIsoscelesTrapezoid());
        System.out.println("Равнобочные трапеции:");
        System.out.println(isoscelesTrapezoidArrayList);
        IsoscelesTrapezoid trapezoid = Collections.max(isoscelesTrapezoidArrayList, Comparator.comparing(s -> s.findDiagonalOne()));
        System.out.println("");
        System.out.println(trapezoid);

    }
}
