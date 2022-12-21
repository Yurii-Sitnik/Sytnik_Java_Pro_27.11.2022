public class ArrayDataException extends NumberFormatException {

    public ArrayDataException(int i, int j) {
        System.out.println("the error occurs in the: row " + i + " column " + j);
    }
}
