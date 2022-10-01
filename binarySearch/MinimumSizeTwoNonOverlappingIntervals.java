package binarySearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumSizeTwoNonOverlappingIntervals {
    //todo first solution
    public static int solve(int[][] intervals) {
        int n = intervals.length, ans = Integer.MAX_VALUE;

        if (n == 0) {
            return 0;
        }

        int mn[] = new int[n];

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return Integer.compare(a[0], b[0]);
            }
        });

        mn[n - 1] = intervals[n - 1][1] - intervals[n - 1][0] + 1;

        for (int i = n - 2; i >= 0; i--) {
            mn[i] = Math.min(mn[i + 1], intervals[i][1] - intervals[i][0] + 1);
        }

        for (int i = 0; i < n; i++) {
            int idx = getCeil(intervals, intervals[i][1], n);

            if (idx == -1) {
                continue;
            }

            int sz = intervals[i][1] - intervals[i][0] + 1;
            ans = Math.min(ans, sz + mn[idx]);
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    static int getCeil(int intervals[][], int ele, int n) {
        int i = 0, j = n - 1, ans = -1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (intervals[mid][0] > ele) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return ans;

    }//todo second solution
    public static int SecondSolution(int intervals[][]){
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int res = Integer.MAX_VALUE;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = intervals.length - 1, rolling = Integer.MAX_VALUE; i != -1; i--) {
            int[] now = intervals[i];
            final int nowlen = now[1] + 1 - now[0];
            while (pq.isEmpty() == false && pq.peek()[0] > now[1]) {
                int[] out = pq.poll();
                rolling = Math.min(rolling, out[1] + 1 - out[0]);
            }
            if (rolling != Integer.MAX_VALUE)
                res = Math.min(res, now[1] + 1 - now[0] + rolling);
            if (nowlen < rolling)
                pq.offer(now);
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public static void main(String[] args) {
        int a[][]={{1,4},{8,9},{3,5}};
        System.out.println( solve(a));
    }
}
