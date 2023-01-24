public class TripletArray {
    public static boolean isTriplet(int arr[]){
        if (arr.length < 3){
            return false;
        }
        for (int i = 2; i < arr.length; i++){
            if (arr[i-2] == arr[i-1] && arr[i-1] == arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,3,3};
        System.out.println(isTriplet(arr));
    }
}
