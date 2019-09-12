public class BinaryRecursiveSearch implements Practice03Search{
    //constructor
    public void BinaryIterativeSearch(){}

    //searches through array arr for searchNum by fuction loading
    public int search(int[] arr, int searchNum){
        return search(arr, searchNum, 0, arr.length-1);
    }

    // checks the mid point value of arr (or a subset of arr) if it matches searchNum
    public int search(int[] arr, int searchNum, int low, int high){

        //check in case the array isn't ordered or we have gone through all the values of arr
        if (low>high){
            return -1;
        }

        int mid = (high + low)/2;

        //check if searchNum is the mid value of arr
        if(arr[mid]==searchNum){
            return mid;
        }

        //check if searchNum is in the right or left half of the array
        if (searchNum>arr[mid]){
            return search(arr, searchNum, mid+1, high);
        }else{
            return search(arr, searchNum, low, mid-1);
        }
    }

    public String searchName(){
        return "binary recursive";
    }
}