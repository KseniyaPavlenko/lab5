import java.util.Random;
/**
 * Вариант 4
 *Создать класс квадрат, члены класса – длина стороны. Предусмотреть в классе методы
 * вычисления и вывода сведений о фигуре – диагоналей, периметр, площадь. Создать производный класс
 * – правильная пирамида с апофемой h (апофема – высота какой-либо боковой стороны), добавить в
 * класс метод определения объема фигуры, перегрузить методы расчета площади и вывода сведений о
 * фигуре. Написать программу, демонстрирующую работу с классом: дано N квадратов и M пирамид, найти
 * квадрат с минимальной площадью и количество пирамид с высотой более числа a (a вводить).
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(5) + 1;
        Squares squares = new Squares();
        squares.fillRandom(n);
        System.out.println(squares);
        squares.MinArea();

        n = r.nextInt(5) + 1;
        Pyramids pyramids = new Pyramids();
        pyramids.fillRandom(n);
        System.out.println(pyramids);
        pyramids.NumofPyramids();
    }
}
