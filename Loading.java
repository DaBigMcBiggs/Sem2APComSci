public class Loading {
    // cool recursion
    public static void printLoading(int count) {
        if (count == 4)
            return;

        System.out.print("[");
        for (int i = 1; i <= count; i++)
            System.out.print("*");
        System.out.println("]");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        printLoading(count + 1);

    }
}
