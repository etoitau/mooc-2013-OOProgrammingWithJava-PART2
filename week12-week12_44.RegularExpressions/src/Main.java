
public class Main {

    public static void main(String[] args) {
        System.out.println(clockTime("24:00:01"));
    }
    
    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public static boolean allVowels(String string) {
        return string.matches("[aeiouyäö]*");
    }
    
    public static boolean clockTime(String string) {
        if (!string.matches("[0-2][0-9]:[0-5][0-9]:[0-5][0-9]"))
            return false;
        String[] parts = string.split(":");
        if (parts[0].equals("24")) {
            return (parts[1].equals("00") && parts[2].equals("00"));
        }
        return true;
    }
}
