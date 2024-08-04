package Array;

public class CountLargerRights {

    static int countLargerRights(int[] arr){
		int count = 0 ;

		for(int i = 1 ; i<arr.length ; i++){
			if(arr[i-1] < arr[i]){
				count++;
			}
		}
		return count ;
	}
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,7,8};

		System.out.println(countLargerRights(arr));
    }
    
}
