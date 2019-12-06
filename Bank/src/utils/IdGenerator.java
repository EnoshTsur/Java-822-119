  
package utils;

public class IdGenerator {

    private static long accountID;
    private static long clientID;

    public static long generateAcoountID(){ return ++accountID; }
    public static long generateClientID(){ return ++clientID; }
}