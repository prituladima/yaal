package net.egork;

import net.egork.io.IOUtils;
import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int start = in.readInt() - 1;
		int[] profit = new int[count];
		int[] cost = new int[count];
		IOUtils.readIntArrays(in, profit, cost);
		cost[start] = 0;
		ArrayUtils.orderBy(cost, profit);
		int answer = 0;
		int cities = 0;
		for (int i = 0; i < count; i++) {
			if (profit[i] >= cost[i] && answer >= cost[i]) {
				answer += profit[i] - cost[i];
				cities++;
			}
		}
		out.printLine(answer);
		out.printLine(cities);
	}
}
