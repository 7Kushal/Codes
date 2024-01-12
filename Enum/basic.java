package Codes.Enum;
// Enum is used to store constants
public class basic {
    public static void main(String[] args) {
        System.out.println(Status.fast);
        Status a = Status.running;
        System.out.println(a.ordinal());
        Status[] s = Status.values();
        for (Status status : s) {
            System.out.println(status);
        }
    }
}

enum Status{
    running,
    stopped,
    slow,
    fast
}