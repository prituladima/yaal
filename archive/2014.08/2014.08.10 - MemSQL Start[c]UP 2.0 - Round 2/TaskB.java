package net.egork;

import net.egork.io.IOUtils;
import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int firstCount = in.readInt();
		int secondCount = in.readInt();
		int[] first = IOUtils.readIntArray(in, firstCount);
		int[] second = IOUtils.readIntArray(in, secondCount);
		Arrays.sort(first);
		Arrays.sort(second);
		long sumFirst = ArrayUtils.sumArray(first);
		long sumSecond = ArrayUtils.sumArray(second);
		long current = 0;
		for (int i = 0; i < firstCount; i++) {
			if (first[i] >= sumSecond) {
				out.printLine((firstCount - i) * sumSecond + current);
				return;
			}
			current += first[i];
		}
		current = 0;
		for (int i = 0; i < secondCount; i++) {
			if (second[i] >= sumFirst) {
				out.printLine((secondCount - i) * sumFirst + current);
				return;
			}
			current += second[i];
		}
		out.printLine(sumFirst + sumSecond - Math.max(ArrayUtils.maxElement(first), ArrayUtils.maxElement(second)));
    }
}
