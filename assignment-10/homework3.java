import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
 
class Main
{
    public static void printPowerSet(int[] S, Deque<Integer> out, int i)
    {
        if (i < 0)
        {
            System.out.println(out);
            return;
        }
        out.addLast(S[i]);
        printPowerSet(S, out, i - 1);
        out.pollLast();
        while (i > 0 && S[i] == S[i - 1]) {
            i--;
        }
        printPowerSet(S, out, i - 1);
    }
    public static void findPowerSet(int[] S)
    {
        Arrays.sort(S);
        Deque<Integer> out = new ArrayDeque<>();
        printPowerSet(S, out, S.length - 1);
    }
}