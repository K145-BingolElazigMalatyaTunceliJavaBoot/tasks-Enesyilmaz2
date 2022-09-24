public class FindPrimeNumber {

    /**
     * 3 ile 100 arasında asal sayıların toplamını bulan program.
     */

    public static void main(String[] args) {
        for (int i = 3; i < 100; i++) {
            boolean findPrime=true;
            for(int j = 2; j < i; j++) {
                if(i%j==0) {
                    findPrime=false;
                    break;
                }
            }
            if(findPrime) {
                System.out.print(i+" ");
            }

        }
    }
}