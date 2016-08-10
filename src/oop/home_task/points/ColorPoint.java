package oop.home_task.points;

/**
 * Created by Lida on 05.08.2016.
 */
public class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public boolean equals(Object o) {
            //if (super.equals(o)) {
                if(o.getClass() == this.getClass()){

                if (!(o instanceof ColorPoint)){
                    return false;
            }else if(this == o) return true;
        }
        return false;
    }
}
