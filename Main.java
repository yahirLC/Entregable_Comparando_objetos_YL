
public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(10, 10, 20);
        Circle circle2 = new Circle(15, 15, 21);

        int resultCircles = circle1.compareTo(circle2);

        Rectangle rec1 = new Rectangle(10, 10, 20, 20);
        Rectangle rec2 = new Rectangle(30, 30, 50, 50);

        int resultRecs = rec1.compareTo(rec2);

        // SI LOS OBJETOS SON IGUALES ENTRE SI EL RESULTADO DEBERIA DE SER 0
        // SI EL AREA DEL OBJETO A COMPARAR ES MAYOR AL COMPARANDO EL R= 1
        // SI EL AREA DEL OBJETO A COMPARAR ES MENOR AL COMPARANDO EL R = -1

        System.out.println("\nResultado circulo: " + resultCircles);
        System.out.println("\nResultado rectangulo: " + resultRecs);

        // AGREGUE CIRCULO3 IGUAL A CIRCULO 1 PARA COMPARARLOS EL RESULTADO DEBERIA DE
        // SER 0

        Circle circle3 = new Circle(10, 10, 20);
        resultCircles = circle1.compareTo(circle3);

        System.out.println("\nResultado circulo: " + resultCircles);

        // AGREGUE UN REC3 MENOR QUE REC1, EL RESULTADO DEBERIA SER -1

        Rectangle rec3 = new Rectangle(5, 5, 10, 10);
        resultRecs = rec1.compareTo(rec3);

        System.out.println("\nResultado rectangulo: " + resultRecs);

    }

}
