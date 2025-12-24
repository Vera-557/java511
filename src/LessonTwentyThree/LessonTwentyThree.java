package LessonTwentyThree;

public class LessonTwentyThree {
    //10   -    public  void reverse();
//11   +    public  boolean isEmpty();
//12   +    public  int get(int index);
//13   +    public  int indexOf(int num);
//14   +    public  int lastIndexOf(int num);
//15   +    public  int getLast();
//16   +    public  void addByIndex(int index, int num);
//17   +    public  void removeByValueLast(int num);
    int[] arr;
    int size;

    {
        size = 0;
        arr = new int[size];
    }
    public  void reverse(){}
    public  boolean isEmpty(){
        if (arr.length ==0){
            return true;
        }else return false;
    }
    public  int get(int index){
        return arr[index];
    }
    public  int getLast(int num){
        for (int i = arr.length-1; i >=0; i--){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
    public  int lastIndexOf( int num){
        for (int i = arr.length-1; i>=0; i--){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
   public  int indexOf(int num){
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
    public  void removeByValueLast(int num){
        if (isHasValue(num)){
            int [] temp = new int[size-1];
            boolean isFind = false;
            for (int i = arr.length-1,j=temp.length-1; i >=0; i --){
                if (arr[i] == num && !isFind){
                    isFind = true;
                   continue;
                }
                temp[j--] = arr[i];
            }
            size--;
            arr=temp;
        }
    }
    public  void addByIndex(int index, int num){
        int [] temp = new int[size + 1];
        if (index <= 0){
            addStart(num);
        } else if (index >= arr.length) {
            addEnd(num);
        }else {
            int [] tmp = new int[size + 1];
            for (int i = 0, j = 0; i < size; i ++){
                if (i == index){
                    tmp[i] = num;
                }
                tmp[i] = arr[j++];
            }
            size++;
            arr=tmp;
        }
    }
    //---------
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
        int[] tmp = new int[size + 1];
        for (int i = 0; i < size; i++) {
            tmp[i + 1] = arr[i];
        }
        tmp[0] = num;
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
    public  int getFirst(){
        if (arr.length == 0){
            System.out.println("Здравствуйте! Ваш массив пустой, до свидания.");
        }
        return arr[0];
    }
    public  boolean isHasValue(int num){
        for (int i = 0; i< arr.length; i ++){
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
    public  int size(){
        return arr.length;
    }
    public  void clear(){
        arr = null;
        size = 0;
    }
    public  void removeByIndex(int index){
        if (index < 0 || index >= size) {
            System.out.println("Упс! Что-то пошло не так. Введен не правильный индекс");
            return;
        }
        int [] temp = new int[arr.length - 1];
        for (int i=0, j = 0; i < arr.length; i ++){
            if (i == index) {
                continue;
            }
            temp[j] = arr[i];
            j++;
        }
        arr = temp;
    }
}
