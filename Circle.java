import java.util.Objects;

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
    public void calculateArea() {
        this.area = Math.PI * Math.sqrt(radio);
        System.out.println("El área del círculo es " + this.area);
    }
}