
import java.io.*;
import java.util.*;

class MatchStickGame {

    static int matchGame(Long N) {
        if(N %5 == 0){
            return -1;
        }else{
            return (int)(N % 5);
        }
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        Long N = sc.nextLong();

        System.out.println(matchGame(N));
    }
}
