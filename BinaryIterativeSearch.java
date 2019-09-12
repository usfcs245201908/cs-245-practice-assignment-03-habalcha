public class BinaryIterativeSearch implements Practice03Search{
    //constructor
    public void BinaryIterativeSearch(){}

    //searches for searchNum in the array arr
    public int search(int[] arr, int searchNum){
        int low = 0;
        int high = arr.length-1;


        while (low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == searchNum){
                return mid;
            }
            // searchNum is in the array of values greater than mid, reassign low
            if(searchNum>arr[mid]){
                low = mid+1;
            }
            //searchNum is in the array of values less than mid, reassign high
            else {
                high = mid-1;
            }
        }
        return -1;
    }

    public String searchName(){
        return "binary iterative";
}
}