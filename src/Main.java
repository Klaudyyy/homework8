import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < 12; i++) {
            System.out.println(weight[i]);
        }
        double[] weights = {1.57, 7.654, 9.986, 12, 16, 223, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        int[] numbers = {43, 65, 404, 72, 56, 22, 77, 5, 0, 0, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] number = new int[10];
        for (int index = 0; index < number.length; index++) {
            number[index] = index + 1;
        }
        System.out.println(Arrays.toString(number));
        int[] size = new int[10];
        for (int index = 0; index < size.length; index++) {
            size[index] = size.length - index;
        }
        System.out.println(Arrays.toString(size));

        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
            System.out.println(Arrays.toString(arr));
    }
}

