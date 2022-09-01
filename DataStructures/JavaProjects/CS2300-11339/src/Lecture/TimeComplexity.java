package Lecture;

public class TimeComplexity {

    static int[] generateMultiplesOf10(int count) { // T(count) = O(count)
        // create a new array that has 'count' number of muliples of 10 in increasing order

        int[] result = new int[count];

        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int i1 = 2; // c1, a certain constant time.
        // N is a function representing the difference in time. ex. array size

        int i2 = 2000; // c2, a certain costant time.

        // constant time examples
        int i3 = 2 + 3; // c3
        int i4 = 2000 + 3000; // c4
        int i5 = 2000 * 30000; // c5
        int i6 = i2 * 100 + i3 * 200 + 3000; // c6

        int N = 1000;
        int[] nums = new int[N]; // O(N)

        // T(N) = O(N)                  // one-execution time   times
        for(int i = 0; i < N; i++) {    // c1                   N+1 (i=0,1,2,N-1,N)
            i1 = i1 + 1;                // c2                   N (i=0,1,2...N-1)
            // T(N) = c1*(N+1) + c2*N = c1*N +c1 + c2*N = (c1+c2)*N + c1 = O(N)
        }

    }
}
