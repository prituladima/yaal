package net.egork;

import net.egork.io.IOUtils;
import net.egork.numbers.FastFourierTransform;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class ChefAndThePolynomial {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int firstLength = in.readInt();
		int secondLength = in.readInt();
		long[] first = IOUtils.readLongArray(in, firstLength + 1);
		long[] second = IOUtils.readLongArray(in, secondLength + 1);
		long[] result = FastFourierTransform.multiply(first, second);
		int power = firstLength + secondLength;
		out.printLine(power);
		long mod = (1L << 32) - 1;
		out.print(result[0] & mod);
		for (int i = 1; i <= power; i++)
			out.print(" " + (result[i] & mod));
		out.printLine();
	}
}
