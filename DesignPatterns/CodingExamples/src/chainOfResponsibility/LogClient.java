package chainOfResponsibility;

public class LogClient {

	public static void main(String[] args) {

      LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
      
      logProcessor.log(LogProcessor.ERROR, "exception happens");
      logProcessor.log(LogProcessor.INFO, "just for information");
      logProcessor.log(LogProcessor.DEBUG, "Need to debug");

	}

}
