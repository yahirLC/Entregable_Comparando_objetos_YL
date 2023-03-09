
/**
 * Representa un objeto circulo que implementa las interfaces Draw y Shape
 * por lo tanto, está oblidada a implementar los métodos que estas definen
 *
 */
public class Circle implements Draw, Calculate, Cloneable, Comparable<Circle> {
    int x, y;
    int radio;
    double area;

    public Circle(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    /***
     * Sobreescribe los métodos definidos en la interfaz Draw
     */
    @Override
    public void paint() {
        System.out.println("Círculo dibujado con centro en (" + this.x + ", " + this.y + ") y radio de " + this.radio);
    }

    @Override
    public void fill() {
        System.out.println("Círculo coloreado!");
    }

    /****/

    /**
     * Sobreescribe al método definido en la interfaz Shape
     */
    @Override
    public double calculateArea() {
        this.area = Math.PI * Math.sqrt(radio);
        return area;
    }

    /**
     * sobrescribe el metodo definido en la interfaz comparable
     *
     */

    @Override
    public int compareTo(Circle objeto) {

        if (objeto.calculateArea() == this.calculateArea()) {
            return 0;

        } else {
            if (objeto.calculateArea() > this.calculateArea()) {
                return 1;
            } else {
                return -1;
            }
        }

    }
}