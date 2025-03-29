import java.util.Arrays;

class Test{

    static void findTripletSum(int[] arr, int target){
        int n = arr.length;
        Arrays.sort(arr); //Sort the array

        //Fix the first element as arr[i]
        for(int i = 0; i < n - 2; i++){
            int l = i +1; 
            int r = n -1; //Two pointer approach

            int requiredSum = target - arr[i];

            while(l < r){
                int currentSum = arr[l] + arr[r];

                if(currentSum == requiredSum){
                    //Print the triplet
                    System.out.println(arr[i]);
                    System.out.println(arr[l]);
                    System.out.println(arr[r]);

                    l++;
                    r--;
                }else if(currentSum < requiredSum){
                    l++; //Increase left pointer to increase sum
                }else{
                    r--;//Decrease right pointer to decrease sum
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,45,6,10,8};
        int target = 13;
        findTripletSum(arr, target);
    }
}