//We are finding the subarray with least average

class Test{

    static void findSubarrayLeast(int[] arr, int k, int n){
        int min = Integer.MAX_VALUE;
        int minindex = 0;

        for(int i =0; i<= n-1; i++){
            int sum = 0;
            for(int j =i; j< i+k;j++){
                sum += arr[j];
            }
            if(sum<min){
                min = sum;
                minindex = i;
            }
        }

        //printing the desired subarray
        for(int i = minindex; i< minindex + k; i++){
            System.out.println(arr[i]+ " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {20,3,13,5,10,14,8,5,11,9,1,11};
        int n = arr.length;
        int k = 9;

        findSubarrayLeast(arr,k,n);
    }
}