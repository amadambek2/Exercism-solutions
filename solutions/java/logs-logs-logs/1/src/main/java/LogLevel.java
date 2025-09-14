public enum LogLevel {
    // TODO: define members for each log level
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);
    
    private final int code;
    LogLevel(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }


    public static LogLevel getLogLevel(String logLine){
        int start=logLine.indexOf("[")+1;
        int end=logLine.indexOf("]");
        String log=logLine.substring(start,end);
        switch(log){
            case "TRC":
                return TRACE;
            case "DBG":
                return DEBUG;
            case "INF":
                return INFO;
            case "WRN":
                return WARNING;
            case "ERR":
                return ERROR;
            case "FTL":
                return FATAL;
            default:
                return UNKNOWN;
        }
    }
    public static String getOutputForShortLog(String logLine){
        String message = logLine.substring(logLine.indexOf(":")+1).trim();
        LogLevel level = getLogLevel(logLine);
        return level.getCode() + ":" + message;
    }
}
