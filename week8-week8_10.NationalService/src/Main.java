public class Main {
    public static void main(String[] args) {
        CivilService kyle = new CivilService();
        System.out.println(kyle.getDaysLeft());
        kyle.work();
        System.out.println(kyle.getDaysLeft());
    }
}
