package net.egork;

import net.egork.collections.intcollection.IntArrayList;
import net.egork.collections.intcollection.IntList;
import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		char[] queue = in.readString().toCharArray();
		IntList qtyList = new IntArrayList();
		int current = 0;
		for (char c : queue) {
			if (c == 'M')
				current++;
			else {
				qtyList.add(current);
				current = 0;
			}
		}
		int[] qty = qtyList.toArray();
		long[] sums = ArrayUtils.partialSums(qty);
		long answer = 0;
		for (int i = 0; i <= qty.length; i++) {
			if (sums[i] != 0)
				answer = Math.max(answer, sums[i] + qty.length - i);
		}
		out.printLine(answer);
	}
}
