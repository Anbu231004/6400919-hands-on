class Logger{
    private static Logger instance;

    private Logger() {
        System.out.println("Logger Initialized");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("Log: " + msg);
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Hello");
        logger2.log("World");

        System.out.println(logger1 == logger2); // true
    }
}