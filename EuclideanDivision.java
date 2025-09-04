/**
 * @author Lainalyn Valena
 */
public class EuclideanDivision {
    public static void main(String[] args) {

        System.out.print("Enter a dividened");
        int dividened = input.nextInt();

        System.out.println("Enter divisor");
        int divisor = input.nextInt();

        System.out.println(dividened);
        System.out.println(divisor);
        int quotient = dividened / divisor;
        int remainder = dividened % divisor;

        System.out.println(remainder);
        System.out.println(quotient);
        System.out.println(dividened + "=" divisor + "*" + quoutient + "+" remainder);

        input.close();
    }
}