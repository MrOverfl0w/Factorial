import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author MrOverfl0w
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    static int a = 0;
    public static void main(String[] args) {
        int n;
        BigInteger f = BigInteger.ONE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Número:");
        try {
            n = (int) sc.nextInt();
            long time= System.nanoTime();
            f = fact(new BigInteger(""+n), f);
            System.out.println("Factorial: "+f.toString()+"\n El tiempo es " +(System.nanoTime()-time));
//            System.out.println(a);
        } catch (Exception ex) {
            System.out.println("Tiene que dijitar un número");
        }
    }
    
    static private BigInteger fact(BigInteger n, BigInteger f){
        for(int i = 2; i <= n; i++){
            BigInteger bi = BigInteger.valueOf(i);
            f = f.multiply(bi);
        }
        return f;
    }

}
