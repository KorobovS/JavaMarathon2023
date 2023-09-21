package day8;

public class Task1 {
    public static void main(String[] args) {
        long timeStartStr = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 20_001; i++) {
            str += i + " ";
        }
        System.out.println(str);
        long timeFinishStr = System.currentTimeMillis();

        long timeStartSb = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20_001; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long timeFinishSb = System.currentTimeMillis();

        System.out.println("Выполнение класса String - " + (timeFinishStr -timeStartStr));
        System.out.println("Выполнние класса StringBuilder - " + (timeFinishSb - timeStartSb));
    }
}
