package net.egork;

import net.egork.collections.sequence.Array;
import net.egork.io.IOUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskD {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int keyLength = in.readInt();
		int mod = in.readInt();
		int[] message = IOUtils.readIntArray(in, count);
		int[] key = IOUtils.readIntArray(in, keyLength);
		int toAdd = 0;
		for (int i = 0; i < count; i++) {
			if (i < keyLength) {
				toAdd += key[i];
				toAdd %= mod;
			}
			message[i] += toAdd;
			message[i] %= mod;
		}
		int toSubtract = 0;
		for (int i = count - keyLength; i < count; i++) {
			message[i] -= toSubtract;
			message[i] += mod;
			message[i] %= mod;
			toSubtract += key[i - count + keyLength];
			toSubtract %= mod;
		}
		out.printLine(Array.wrap(message).toArray());
	}
}
