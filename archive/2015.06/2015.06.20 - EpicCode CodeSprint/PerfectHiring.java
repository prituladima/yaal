package net.egork;

import net.egork.io.IOUtils;
import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class PerfectHiring {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int count = in.readInt();
        int basePatience = in.readInt();
        int delta = in.readInt();
        long[] rating = IOUtils.readLongArray(in, count);
        for (int i = 0; i < count; i++) {
            rating[i] *= basePatience - i * delta;
        }
        out.printLine(ArrayUtils.maxPosition(rating) + 1);
    }
}
