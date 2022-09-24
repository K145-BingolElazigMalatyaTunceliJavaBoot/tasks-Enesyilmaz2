public class indivisible {


    public static void main(String[] args) {
        int total=0;
        for (int i = 200; i < 500; i++) {
            if (i % 3!= 0) {
                total+=i;

            }

        }
        System.out.println(total);
    }

}