//We are searching for an element in an matrix by eliminating rows or columns 

class Test{

    static boolean matSearch(int[][] mt, int x){
        int m = mt.length;
        int n = mt[0].length;
        int i=0;
        int j = m-1;

        while(i<n && j>=0){
            if(x>mt[i][j]){i++;}
            else if(x<mt[i][j]){j--;}
            else{return true;}

        }
        return false;
    }

    public static void main(String[] args){
        int[][] mt ={{3,5,6},{13,25,46},{32,45,65}};
        int x = 45;

        System.out.println(matSearch(mt,x));
    }
}
//O(n + m) Time and O(1) Space