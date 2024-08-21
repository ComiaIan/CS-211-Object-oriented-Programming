public class Escseq {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++) {
            int m = i * 7;
            if (i % 2 == 0) {
                System.out.println("\t" + m);
            }
            else {
                System.out.println(m);
            }
        }
    }
}
