package net.egork;

import net.egork.string.StringUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TheBet {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String first = in.readString();
        String second = in.readString();
        int[] z = StringUtils.zAlgorithm(second + first);
        int answer = 0;
        for (int i = second.length(); i < z.length; i++) {
            if (z[i] >= second.length()) {
                answer++;
                int skipTo = i;
                for (int j = i; j < i + second.length(); j++) {
                    if (z[j] >= second.length()) {
                        skipTo = j;
                    }
                }
                i = skipTo + second.length() - 1;
            }
        }
        out.printLine(answer);
    }
}
