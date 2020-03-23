/**
 * @author Lining
 * @date 2020/3/23
 */
public class selectionSort{
    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
        int temp = array[minIndex];
        array[minIndex] = array[i];//交换位置
        array[i] = temp;
        }
        return array;
    }
}