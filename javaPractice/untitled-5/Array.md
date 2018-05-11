# 数组

## 数组的基本操作

1. 填充替换数组元素

        fill(int[] a,int value); //a是要填充的数组，value表示要填充的值
        fill(int[] a,int fromIndex,int toIndex,int valut);// 替换，fromIndex表示开始的索引值，toIndex表示结束的索引值，value表示替换进行的值

2. 数组排序

        Arrays.sort(arr); //进行升序排序

3. 复制数组

        copyOf(arr,int newlength); //newlength表示复制后的新数组长度；若长度大于原数组长度，整数型用0填充，char型用null填充；若小于原数组长度，则从数组arr第一个元素开始截取至满足新数组长度为止
        copyOfRange(arr,int fromIndex,int toIndex);

4. 数组查询

        binarySearch(Object[] a,Object key); //key表示要搜索的值
        binarySearch(Object[] a,int fromIndex,int toIndex,Object key); //在指定范围内搜索

## 数组排序算法

以冒泡排序为例

        public class BubbleSort{
            public static void main(String[] args){
                //创建一个乱序数组
                int[] array = {64,4,24,1,3,15};
                //创建冒泡排序类的对象
                BubbleSort sorter = new BubbleSort();
                //调用排序方法将数组排序
                sorter.sort(array);
            }
            public void sort(int[] array){
                for(int i = 1; i < array.length;i++){
                    //比较相邻的两个元素，较大的数往后冒泡
                    for(int j = 0; j < array.length-1;j--){
                        if(array[j] > array[j+1]){
                            int temp = array[j];//把第一个元素值保存到临时变量中
                            array[j] = array[j+1]; //把第二个元素保存到第一个元素单元中
                            array[j+1] = temp; //把临时变量（也就是第一个元素原值）保存到第二个元素中
                        }
                    }
                }
                showArray(array); //输出排序后的数组元素
            }
            public void showArray(int[] array){
                for(int i:array){
                    System.out.print(">" + i);
                }
                System.out.println();
            }
        }
