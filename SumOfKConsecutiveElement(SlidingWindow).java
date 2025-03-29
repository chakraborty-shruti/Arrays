//Finding the maximum sum of k consecutive element in the array

//We are using sliding window find the sum of first k element and then remove the first element and add the k+1 element update the list for max value

class Test{

    static int maxSum(int arr[], int k){
        int n = arr.length;
        int curr = 0;
        int res = Integer.MIN_VALUE;
        for(int i=0; i<k;i++){
            curr += arr[i];
        }

        for(int i = k; i <n; i++){
            curr = curr + arr[i] - arr[i -k];
            res = Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args) {
        
        int[] arr = {1,8,30,-5,20,7};
        int k = 4;

        System.out.println(maxSum(arr,k));
    }
}