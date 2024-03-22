public class Lecture_18{
  static void check(int arr[],int x){
      System.out.println(arr[0]+""+"  2");
      arr[0]=100;
      x=x+10;
      System.out.println(arr[0]+""+"  3"+""+x);
  }
	public static void main(String[] args) {
		int arr[]={1,2,3,4};
		int x=10;
		System.out.println(arr[0]+""+"  1");
		check(arr,x);
		System.out.println(arr[0]+""+"  4"+""+x);
	}
}