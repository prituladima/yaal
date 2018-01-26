package net.egork;

import net.egork.numbers.MultiplicativeFunction;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskL {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		if (in.isExhausted())
			throw new UnknownError();
		int count = in.readInt();
		long phi = MultiplicativeFunction.PHI.calculate(count);
		out.printLine(phi / 2);
	}
}
