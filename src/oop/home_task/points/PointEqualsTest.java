package oop.home_task.points;

/**
 * Created by Lida on 05.08.2016.
 */
public class PointEqualsTest {
    public static void main(String[] args) {
        System.out.println("Сравниваем обычную точку и цветную точку:");
        Point p1 = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        System.out.println("p equals cp = " + p1.equals(cp));
        System.out.println("cp equals p = " + cp.equals(p1));

    }
}