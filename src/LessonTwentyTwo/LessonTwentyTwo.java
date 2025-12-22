package LessonTwentyTwo;

public class LessonTwentyTwo {
    //Выполнить от 1 - 9
//1    +   public  void addEnd(int num);
//2    +   public  void print();
//3    -   public  void addStart(int num);
//4    -   public  int getFirst();
//5    -   public  boolean isHasValue(int num);
//6    -   public  int size();
//7    -   public  void clear();
//8    -   public  void removeByIndex(int index);
//9    +   public  void removeByValueFirst(int num);

    int[] arr;
    int size;

    {
        size = 0;
        arr = new int[size];
    }

    public void addEnd(int num) {
        int[] tmp = new int[size + 1];
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[i];
        }

        tmp[size] = num;
        size++;
        arr = tmp;
    }

    public void addStart(int num) {
        int[] tmp = new int[size + 1];//мы каждый раз создаем новый массив когда нам нужно увеличить его лишь на единицу
        for (int i = 0; i < size; i++) {//тем самым мы забиваем память бессмысленными оъектами, коотрые будет чистить ГК
            tmp[i] = arr[i];//на мой взгляд было бы проще использовать реализацию арэй листа, где массив увеличивается на 0,5 от его размера
        }
        tmp[0] = num;
        for (int i = 0; i < size; i++){
            tmp[i + 1] = arr[i];
        }
        size++;
        arr = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void removeByValueFirst(int num) {
        boolean isHas = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                isHas = true;
                break;
            }
        }

        if (isHas) {
            int[] tmp = new int[size - 1];
            for (int i = 0, j = 0; i < size; i++) {
                if (isHas && arr[i] == num) {
                    isHas = false;
                    continue;
                }

                tmp[j++] = arr[i];
            }

            size--;
            arr = tmp;
        }
    }


}
