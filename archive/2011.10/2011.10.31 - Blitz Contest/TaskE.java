package net.egork;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskE {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		char[] digits = in.readString().toCharArray();
		char temp = digits[0];
		digits[0] = digits[2];
		digits[2] = temp;
		out.printLine(new String(digits));
	}
}
