package day02.pratice;

public class Logger {
	
	
	public static void debug(String msg) {
        System.out.println("DEBUG: " + msg);
    }
    
    public static void info(String msg) {
        System.out.println("INFO: " + msg);
    }
    
    public static void error(String msg) {
        System.err.println("ERROR: " + msg);
    }
    
    public static void debug(int num) {
        System.out.println("DEBUG: " + num);
    }
    
    public static void info(int num) {
        System.out.println("INFO: " + num);
    }
    
    public static void error(int num) {
        System.err.println("ERROR: " + num);
    }

}
