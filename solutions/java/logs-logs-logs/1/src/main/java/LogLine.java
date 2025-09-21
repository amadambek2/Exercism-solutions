public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        return LogLevel.getLogLevel(logLine);
    }

    public String getOutputForShortLog() {
        return LogLevel.getOutputForShortLog(logLine);
    }
}
