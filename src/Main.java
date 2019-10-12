import taylorseries.SinXOverX;
import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        double x = 3;
        int k = 10;

        if (args.length == 2) {
            x = Double.parseDouble(args[0]);
            k = Integer.parseInt(args[1]);
        }

        BigDecimal computed = SinXOverX.compute(new BigDecimal(x), k);
        double approximated = SinXOverX.approximate(x);

        System.out.println("Approximated value:");
        System.out.println("\t" + approximated);
        System.out.println("Computed value:");
        System.out.println("\t" + computed);
    }
}
