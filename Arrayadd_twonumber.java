package arrayadd_twonumber;


public class Arrayadd_twonumber {

    public static void main(String[] args) {
        int a[][] = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int b[][] = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};
        int s[][] = new int[3][3];
        int r, c;
        for (r = 0; r < 3; r++) {
            for (c = 0; c < 3; c++) {
                s[r][c] = a[r][c] + b[r][c];
            }

        }

        for (r = 0; r < 3; r++) {
            for (c = 0; c < 3; c++) {
                System.out.print(s[r][c] + " ");
            }
            System.out.println("");

        }
    }

}
