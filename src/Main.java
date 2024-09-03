import java.util.Objects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fraction fr1 = new Fraction(1,3);
        Fraction fr2 = new Fraction(1,3);
        Fraction fr3 = fr2.clone();

        System.out.println(fr1.equals(fr2));
        System.out.println(fr2.equals(fr3));
    }
}
