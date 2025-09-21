public class LogLevels {
    
    public static String message(String logLine) {
        String message = logLine.substring(logLine.indexOf(":")+1).trim();
        return message;
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[")+1;
        int end = logLine.indexOf("]");
        String log=logLine.substring(start,end);
        return log.toLowerCase();        
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
