/**
 * Created by Loky on 14/07/2020.
 */
public final class HeapInspector {
    private final static int KB_FACTOR = 1024;
    private final static int MB_FACTOR = (KB_FACTOR * KB_FACTOR);

    private final static int DISPLAY_TYPE_KB = 1;
    private final static int DISPLAY_TYPE_MB = 2;

    public static long getMaxMemory(int DISPLAY_TYPE) {

        switch (DISPLAY_TYPE) {

            case DISPLAY_TYPE_KB:
                return (Runtime.getRuntime().maxMemory());
            case DISPLAY_TYPE_MB:
                return (Runtime.getRuntime().maxMemory());
            default:
                return (Runtime.getRuntime().maxMemory());

        }
    }
}
