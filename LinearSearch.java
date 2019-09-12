public class LinearSearch implements Practice03Search {

    //constructor
    public void LinearSearch(){}

    //compares each value of arr to searchNum until it runs our of values or finds a match
    public int search(int[] arr, int searchNum){
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==searchNum) {
                return i;
            }
        }
        return -1;
    }

    public String searchName(){
        return "linear search";
    }
}
