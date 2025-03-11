//Max Sum Subarray- Kadanes Algorithm
//O(N) Time and O(1)

class Test{

    static int maxSumSubarray(int[] arr){
        int res = arr[0];
        int maxEnding = arr[0];

        for(int i=1 ; i , arr.length; i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }

    public static void main(String args[]){
        int[] arr ={2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSumSubarray(arr));
    }
}