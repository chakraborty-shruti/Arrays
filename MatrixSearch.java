//Search row-wise and column wise in a matrix

class Test{

    static boolean matSearch(int[][] mt,int x){
        int m =mt.length;
        int n = mt[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mt[i][j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mt = {{3,45,65},
                    {14,19,20},
                    {43,20,87}};

        int x = 19;

        if(matSearch(mt,x)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
}

//O(n*m) Time and O(1) Space