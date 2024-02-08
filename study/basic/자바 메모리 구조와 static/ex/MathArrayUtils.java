package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils(){

    }
    public static int sum(int[] arr){
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

    public static double average(int[] arr) {
        return (double)sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int temp = arr[0];
        for (int i : arr) {
            if(i < temp) {
                temp = i;
            }
        }
        return temp;
    }

    public static int max(int[] arr) {
        int temp = arr[0];
        for(int i : arr) {
            if(i> temp) {
                temp = i;
            }
        }
        return temp;
    }


}
