public class No_1259{
    class Main {
        public static void main(String[] args) {
            // Scanner scan = new Scanner(System.in);
            String str = Integer.toString(1000000, 7);
    //         计算机组成原理
    //         把捐款转化为7进制数字
            // System.out.println(str); // 11333311
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                count += str.charAt(i) - '0';
            }
            System.out.println(count);
            // scan.close();
        }
    }    
}