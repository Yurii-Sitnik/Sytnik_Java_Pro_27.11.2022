import java.util.Arrays;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
        };
        //String[][] array = new String[][]{
        //        {"1", "1", "1", "1"},
        //        {"1", "a", "1", "1"},
        //        {"1", "1", "1", "1"},
        //        {"1", "1", "1", "1"},
        // };

        //String[][] array = new String[][]{
        //        {"1", "1", "1","1"},
        //        {"1", "1", "1","1"},
        //        {"1", "1", "1","1"},
        //        {"1", "1", "1","1"},
        //        {"1", "1", "1","1"},
        //};

        try {
            System.out.println("Sum all elements of massive " + doCalc(array));
        } catch (ArraySizeException | ArrayDataException exception) {
            exception.printStackTrace();
        }
    }
    private static int doCalc(String[][] arrays) throws ArrayDataException, ArraySizeException {
        if (arrays.length != 4) {
            throw new ArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                try {
                    sum += Integer.parseInt(arrays[i][j]);
                } catch (NumberFormatException exception) {
                    throw new ArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}































