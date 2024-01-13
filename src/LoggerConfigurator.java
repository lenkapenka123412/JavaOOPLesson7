import java.util.logging.Logger;

public class LoggerConfigurator {
    public static Logger configureLogger(String fileName) {
        System.setProperty("logfile.name", fileName);
        Logger LoggerFactory = null;
        return Logger.getLogger(String.valueOf(LoggerConfigurator.class));
    }

}
