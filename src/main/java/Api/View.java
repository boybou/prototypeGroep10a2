package Api;

/**
 * Created by boybo on 17-12-2017.
 */
public class View {
    public static class Internal extends Private {}

    public static class Private extends Protected {}

    public static class Protected extends Public {}

    public static class Public {}
}
