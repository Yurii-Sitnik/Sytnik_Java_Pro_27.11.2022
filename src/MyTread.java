public class MyTread extends Thread {
    private float[] array;
    private String arrayName;


    public MyTread(float[] array, String arrayName) {
        this.array = array;
        this.arrayName = arrayName;

    }

    @Override
    public void run() {
        System.out.println("Running tread " + arrayName);
        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long finish = System.currentTimeMillis();

        System.out.println(finish - start + " ms");
    }
}