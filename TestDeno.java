package a01staticdemo2;

public class TestDeno {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.2, 2.6, 3.9, 4.8, 5.4};
        double str1 = ArrayUtil.getAverage(arr2);
        System.out.println(str1);
    }
}
