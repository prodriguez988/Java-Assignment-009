import java.math.BigInteger;
public class Big {

    public static void factorialLoop(int x){
        BigInteger fact=BigInteger.valueOf(1);
        for(int i=0;i<=x;i++){
            if (i==0){
                System.out.println(i+"   1");}
            else{
                BigInteger newI=BigInteger.valueOf(i);
            fact=fact.multiply(newI);
            System.out.println(i+"   "+ fact);}
        }
    }

    public static void main(String[] args) {
        System.out.println("x   x!");
        factorialLoop(30);
    }
}