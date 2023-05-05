import java.util.*;

public class ReapChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of PID : ");
        int size = sc.nextInt();
        List<Integer> pid = new LinkedList<>();
        List<Integer> ppid = new LinkedList<>();
        System.out.print("Enter PID Elements : ");
        for (int i = 0; i < size; i++) {
            pid.add(sc.nextInt());
        }
        System.out.print("Enter PPID Elements : ");
        for (int i = 0; i < size; i++) {
            ppid.add(sc.nextInt());
        }
        System.out.print("Enter kill ID : ");
        int kill = sc.nextInt();
        List<Integer> out = reapChildren(pid, ppid, kill);
        for (Integer i : out) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static List<Integer> reapChildren(List<Integer> pid, List<Integer> ppid, int kill) {
        List<Integer> result = new LinkedList<>();
        if (kill == 0) {
            return result;
        }
        result.add(kill);
        for (int i = 0; i < ppid.size(); i++) {
            if (ppid.get(i) == kill) {
                result.addAll(reapChildren(pid, ppid, pid.get(i)));
            }
        }
        return result;
    }
}
