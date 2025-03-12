
/*Two friends, A and B, are playing the game of matchsticks. In this game, a group of N matchsticks is placed on the table. The players can pick any number of matchsticks from 1 to 4 (both inclusive) during their chance. The player who takes the last match stick wins the game. If A starts first, how many matchsticks should he pick on his 1st turn such that he is guaranteed to win the game or determine if it’s impossible for him to win? Return -1 if it’s impossible for A to win the game, else return the number of matchsticks he should pick on his 1st turn such that he is guaranteed to win */

/*N  Number of Matchsticks (N%5)  Win(A/B)
1	        1	                        A
2	        2	                        A
3	        3	                        A
4	        4	                        A
5	        -1	                        B
6	        1	                        A
7	        2	                        A
8	        3	                        A
9	        4	                        A
10	        -1	                        B
11	        1	                        A
12	        2	                        A */

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
