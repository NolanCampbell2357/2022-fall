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
        for (int i = 0; i < N; i++) {    // c1                   N+1 (i=0,1,2,N-1,N)
            i1 = i1 + 1;                // c2                   N (i=0,1,2...N-1)
            // T(N) = c1*(N+1) + c2*N = c1*N +c1 + c2*N = (c1+c2)*N + c1 = O(N)
        }

        int a = 0, b = 0;
        // cost     times
        for (int i = 0; i < N; i++) {   // c1       N+1
            a += 1;                 // c2       N
            b += 1;                 // c3       N
        } // T(N) = c1*(N + 1) + c2 * N + c3 * N = (c1 + c2 + c3)*N + c1 = O(N)

        // cost     times
        for (int i = 0; i < N; i++) {        // c1       N+1
            for (int j = 0; j < N; j++) {    // c2       N*(N+1)
                a += 1;                       // c3       N^2
            }
        } // T(N) = c1 * (N + 1) + c2 * (N*(N+1)) + c3 * (N^2)
        // c1N + c1*1 + c2N^2 + c2N*1 + c3N^2
        // (c2 + c3)N^2 + (c1 + c2)N + c1
        // O(N^2)

                                                 // cost     times
        for (int i = 0; i < N; i++) {            // c1       N+1
            for (int j = 0; j < N; j++) {        // c2       N*(N+1)
                for (int k = 0; k < N; k++) {    // c3       N*(N+1)^2
                    a += 1;                      // c4       N^3
                }
            }
        } // T(N) = c1 * (N + 1) + c2 * (N*(N+1)) + c3 * (N*N*(N+1)) + c4 * N^3
        // c1N + c1 + c2N^2 + c2N + c3*N^3 + c3N^2 + c3N + c4N^3
        // (c3 + c4)^3 + (c2 + c3)^2 + (c2 + c1)*N + c1
        // O(N^3)

        // cost     times
        for (int i = 0; i < N; i++) {        // c1       N+1
            for (int j = 0; j < i; j++) {    // c2       (N*(N+1))/2
                a += 1;                       // c3       (N*N)/2
            }
        } // T(N) = c1 * (N+1) + c2 * ((N*(N+1))/2) + c3 * ((N*N)/2)
        // c1N + c1 + c2/2*(N^2) + c2/2*N + c3/2*(N^2) + c3/2 * N
        // (c3/2 + c2/2)N^2 + (c1 + c2/2 + c3/2)N + c1
        // O(N^2)

                                          // cost     times
        for (int i = 0; i < N; i++) {     // c1       N+1
            for (int j = 0; j < N; j++) {  // c2       N*(N+1)
                a += 1;                   // c3       N*N
            }
            b += 1;                       // c4       N
        } // T(N) = c1*(N+1) + c2(N*(N+1)) + c3N^2 + c4*N
        // c1N + c1 + c2N^2 + c2N + c3N^2 + c4N
        // (c2 + c3)N^2 + (c1 + c2 + c4)N + c1
        // O(N^2)

                                          // Cost   // Times
        for (int i = 0; i < 10; i++) {     // c1      11
            for (int j = 0; j < N; j++) { // c2       10*(N+1)
                a += 1;                   // c3       10*N
            }
            System.out.println(a);        // c4       10
        } // T(N) = c1*(11) + c2(10*(N+1)) + c3*10N + c4*10
        // c1*11 c2*10*N + c2N + c3*10*N + c4*10
        // (c2*10 + c3*10)N + c1 * 11 + c2*10 + c4*10
        // O(N)

                                    // Cost     Times
        for(int i=0; i<N; i++) {    // c1       11
            if (i==10) {            // c2       11
                break;              // c3       1
            }
        } // T(N) = c1*11 + c2*11 + c3* 1 = O(1)


                                    //Cost      times
        for(int i=0; i<N; i++) {    // c1       N+1
            if(i<10) {              // c2       N
                a += 1;             // c3       10
            } else {
                b+=1;               // c4       N-10
            }
        } // T(N) = c1 * (N+1) + c2 * N + c3 * 10 + c4 (N - 10)
        // c1N + c1 + c2N + c3 * 10 + c4*N + c4 * -10
        // (c1 + c4 + c2)N + c3 * 10 + c4 * -10 + c1 = O(N)
    }
}
