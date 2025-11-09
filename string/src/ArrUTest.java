public class ArrUTest {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,};
        String str = ArrayUtil.printArray(array);
        System.out.println(str);
        double average = ArrayUtil.getAverage(array);
        System.out.println(average);

    }
}
