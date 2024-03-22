public class Lecture_17 {
    static void main(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
    }
    public static void main(String[] args) {
        //int[] myArray = new int[5];, you are creating an array object of type int[] with a specific length 
        //array is a object
        //int arr[],int[] arr,int []arr  and int arr; arr=new int[]
        int size=5;
        int arr[]=new int[size];
             System.out.println(arr[0]);
             main(arr);
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        main(arr);
        int c[]=new int[2*size];
        c[5]=7;
        c[6]=8;
        main(c);

    }
}