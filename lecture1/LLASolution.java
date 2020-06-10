/** Write a method flatten that takes in a 2-D array x and returns a 1-D array
 * that contains all of the arrays in x concatenated together.
 * @author guialong
 */
public class LLASolution {
    public static int[] flatten(int[][] x){
        int totalLength = 0;
        for (int i = 0;i < x.length;i ++) {
            totalLength += x[i].length;
        }
        int[] a = new int[totalLength];
        int aIndex = 0;
        for (int i = 0;i < x.length; i++) {
            for (int j = 0;j < x[i].length;j ++){
                a[aIndex] = x[i][j];
                aIndex +=1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {}, {7, 8}};
        int[] b = flatten(a);
        for (int i = 0;i < b.length;i ++){
            System.out.println(b[i]);
        }
    }
}
