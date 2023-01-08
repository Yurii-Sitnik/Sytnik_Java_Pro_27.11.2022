public class ValueCalculator {
    public static void main(String[] args) throws InterruptedException {
        myMethod(array);
    }

    private static int lengthArray = 1000000;
    private static float[] array = new float[lengthArray];
    private static int halfArray1 = lengthArray/ 2;
    private static int halfArray2 = array.length-halfArray1;

    public static void myMethod(float[] array) throws InterruptedException {
        for (int j = 0; j < array.length; j++) {
            array[j] = 1;
        }
        float[] newArray1 = new float[(lengthArray + 1) / 2];
        float[] newArray2 = new float[(lengthArray - newArray1.length)];

        System.arraycopy(array, 0, newArray1, 0, newArray1.length);
        System.arraycopy(array, newArray1.length, newArray2, 0, newArray2.length);
        MyTread myTread1 = new MyTread(newArray1, "newArray1");
        myTread1.start();
        myTread1.join();
        MyTread myTread2 = new MyTread(newArray2, "newArray2");
        myTread2.start();
        myTread2.join();

        float[] newArray3 = new float[newArray1.length + newArray2.length];

        System.arraycopy(newArray1, 0, newArray3, 0, newArray1.length);
        System.arraycopy(newArray2, 0, newArray3, newArray1.length, newArray2.length);
    }
}




