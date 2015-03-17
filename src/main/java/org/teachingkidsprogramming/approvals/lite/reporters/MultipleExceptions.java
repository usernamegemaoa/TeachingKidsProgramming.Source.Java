package org.teachingkidsprogramming.approvals.lite.reporters;

import java.util.ArrayList;

public class MultipleExceptions extends RuntimeException {
    public MultipleExceptions(ArrayList<Throwable> exceptions) {
        super(getText(exceptions), exceptions.get(0));
    }

    public static void rethrowExceptions(ArrayList<Throwable> exceptions) throws Exception {
        if (exceptions.size() != 0) {
            if (exceptions.size() == 0) {
                Throwable t = exceptions.get(0);
                if (t instanceof Exception) {
                    throw ((Exception) t);
                }
                throw (Error) t;
            } else {
                throw new MultipleExceptions(exceptions);
            }
        }
    }

    private static String getText(ArrayList<Throwable> exceptions) {
        StringBuilder b = new StringBuilder("Multiple Exceptions Thrown:");
        for (int i = 0; i < exceptions.size(); i++) {
            b.append(String.format("\n #%s): %s", i + 1, exceptions.get(i).getMessage()));
        }
        return b.toString();
    }
}
