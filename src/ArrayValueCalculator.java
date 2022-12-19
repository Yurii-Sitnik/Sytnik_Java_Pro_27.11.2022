import java.util.Arrays;

public class ArrayValueCalculator {
    public static <ArrayDataException> void main(String[] args) {
        String[][] array = new String[4][4];
        array[0][0] = "1";
        array[0][1] = "1";
        array[0][2] = "1";
        array[0][3] = "1";

        array[1][0] = "1";
        array[1][1] = "1";
        array[1][2] = "1";
        array[1][3] = "1";

        array[2][0] = "1";
        array[2][1] = "1";
        array[2][2] = "1";
        array[2][3] = "1";

        array[3][0] = "1";
        array[3][1] = "1";
        array[3][2] = "1";
        array[3][3] = "1";

        int res = 0;
        res = doCalk(array);
        try {
            System.out.println(res);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
        }
    }
    public static int doCalk(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                sum += Integer.parseInt(array[i][j]);
        }
        return sum;
    }

}


