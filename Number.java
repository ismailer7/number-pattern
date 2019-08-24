public class Number {

    public static void main(String[] args) {
        
        // the hard way.

        /*
            1
            11
            111
            1111
            11111
        */

        int i = 0;
        int initial = 0;

        while (i < 5) {
            int result = (int) Math.pow(10, i) + initial; 
            System.out.println(result);
            initial = result;
            i++ ;
        }

         /*
            1
            12
            123
            1234
            12345

            we can make use of the first pattern.
        */


        int k = 0;

        int instance = 0;

        int init = 0;

        while (k < 5) {
            int out = ((int) Math.pow(10, k) + init) + instance;
            System.out.println(out);
            init = out - instance;
            instance = out;
            k ++;
        }

        System.out.println("////////////////////////////////////////////");

        // the easy way

        int s = 1;

        while (s < 6) {
            System.out.println((int)Math.pow(10, s) / 9);
            s ++;
        }

        int m = 1;
        int res = 0;
        while (m < 6) {
            res += (int) Math.pow(10, m) / 9;
            System.out.println(res);
            m ++;
        }


    }

}