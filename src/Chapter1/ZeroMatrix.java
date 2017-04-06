package Chapter1;

/**
 * Created by srujithpoondla on 4/5/17.
 */
public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3,4},{3,4,5,6},{1,2,3,4},{1,2,3,5}};
        int[][] res = zeroMatrix(matrix);
        for (int[] re : res) {
            for (int i : re) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }

    private static int[][] zeroMatrix(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] columns= new int[matrix[0].length];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if(anInt==0){
                    row[anInt]=0;

                }
            }

        }
        return matrix;
    }
}
