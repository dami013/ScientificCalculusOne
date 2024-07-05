package org.sparsesolver;

public class MemoryUtil {
    public static long getUsedMemory() {
        System.gc();
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}