public class Environment {
    private static final String TEST_USER = "CLASSROOM_TRACKER_USER";
    private static final String TEST_PASS = "CLASSROOM_TRACKER_PASS";

    public static String getUser() {
        return System.getenv(TEST_USER);
    }

    public static String getPass() {
        return System.getenv(TEST_PASS);
    }
}
