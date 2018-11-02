import java.util.Arrays;


//сортировка пузырьком

//public class Application {
//    public static void main(String[] args) {
//        int[] a = {3,2,6,7,9,4};
//        bubleSort(a);
//
//    }
//
//    public static void bubleSort(int[] arr){
//        for(int i=arr.length - 1; i>0; i--){
//            for (int j = 0; j < i; j++) {
//                if(arr[j]>arr[j+1]){
//                    int tmp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1] = tmp;
//                }
//
//            }
//            System.out.println(Arrays.toString(arr));
//            System.out.println();
//        }
//        System.out.println("Sorted array " + Arrays.toString(arr));
//    }


//сортировка
//public class Application {
//    public static void main(String[] args) {
//        int[] a = {99,87,-12,87,12,23,-100};
//        bubleSort(a);
//
//    }
//
//    public static void bubleSort(int[] arr){
//        for(int i=arr.length - 1; i>0; i--){
//            for (int j = 0; j < i; j++) {
//                if(arr[j]>arr[j+1]){
//                    int tmp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1] = tmp;
//                }
//
//            }
//            System.out.println(Arrays.toString(arr));
//            System.out.println();
//        }
//        System.out.println("Sorted array " + Arrays.toString(arr));
//    }
//}

// сортировка о максимальному элементу

public class Application {
    public static void main(String[] args) {
    int[] a = {99,87,-12,87,12,23,-100};
    }

    public static int getMaxFromArray(int[] array){
        int indexOfMax=0;
        for(int i=1; i<array.length; i--){
            if(array[i]>array[indexOfMax]){
               indexOfMax=i;
            }

        }
        return array[indexOfMax];



    }
}
