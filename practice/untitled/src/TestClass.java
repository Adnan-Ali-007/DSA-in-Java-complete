import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int M = Integer.parseInt(br.readLine().trim());
        String[] arr_house = br.readLine().split(" ");
        int[] house = new int[N];
        for (int i_house = 0; i_house < arr_house.length; i_house++) {
            house[i_house] = Integer.parseInt(arr_house[i_house]);
        }

        int out_ = solve(N, M, house);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static int solve(int N, int M, int[] house) {
        boolean[] occupied = new boolean[N];

        for (int day = 0; day < N; day++) {
            int occupiedHouse = house[day] - 1;  // Convert 1-based index to 0-based index
            occupied[occupiedHouse] = true;

            // Check for any sequence of M consecutive occupied houses
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (occupied[i]) {
                    count++;
                } else {
                    count = 0;
                }

                if (count >= M) {
                    return day + 1;
                }
            }
        }

        return -1;  // Should never reach here based on problem statement guarantees
    }
}
