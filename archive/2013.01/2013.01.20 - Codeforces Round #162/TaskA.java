package net.egork;

import net.egork.collections.intcollection.IntArray;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		char[] sequence = in.readString().toCharArray();
		int[] answer = new int[sequence.length * 2 + 1];
		int f = sequence.length;
		int t = f;
		answer[f] = sequence.length;
		for (int j = sequence.length - 2; j >= 0; j--) {
			if (sequence[j] == 'l')
				answer[++t] = j + 1;
			else
				answer[--f] = j + 1;
		}
		out.printLine(new IntArray(answer).subList(f, t + 1));
    }
}
