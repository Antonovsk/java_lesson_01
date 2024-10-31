public class Printer {
    public static void main(String[] args) {
        int n = 12345;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.sumDigits(n);
        System.out.println(itresume_res);
    }
}
