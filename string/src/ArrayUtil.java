public class ArrayUtil {
    private ArrayUtil() {
    }

    public static String printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
            } else {
                sb.append(array[i]).append(", ");
            }


        }
        sb.append("]");
        return sb.toString();
    }
    public static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        double avg = sum / array.length;
        return avg;
    }
}