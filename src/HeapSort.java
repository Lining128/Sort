/**
 * 堆排序
 * @author Lining
 * @date 2020/3/21
 */

public class HeapSort {
    public static void adjustHeap(int[] data,int i, int len) {
        int temp, j;
        temp = data[i];
        for (j = 2 * i; j < len; j *= 2) { //沿关键字较大的孩子结点向下筛选
            if (j < len && data[j] < data[j + 1]) {
                ++j; //j为关键字中较大记录的下标
            }
            if (temp >= data[j]) {
                break;
            }
            data[i] = data[j];
            i = j;
        }
        data[i] = temp;

    }


    public static void heapSort(int[] data) {
        int i;
        for (i = data.length / 2 - 1; i >= 0; i--) { //构建一个大顶堆
            adjustHeap(data, i, data.length - 1);
        }
        for (i = data.length - 1; i >= 0; i--) { //将堆顶记录和当前未经排序子序列的最后一个记录交换
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;
            adjustHeap(data, 0, i - 1); //将a中前i-1个记录重新调整为大顶堆
        }

    }
}
