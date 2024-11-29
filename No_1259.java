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

            
            //暴力求解
        int sum = 1000000;
        int a1 = 1;
        int a2 = 7;
        int a3 = 49;
        int a4 = 343;
        int a5 = 343 * 7;
        int a6 = 343 * 49;
        int a7 = 343 * 343;
        int a8 = a7 * 7;
        int a9 = a8 * 7;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                for (int k = 0; k <= 5; k++) {
                    for (int l = 0; l <= 5; l++) {
                        for (int m = 0; m <= 5; m++) {
                            for (int n = 0; n <= 5; n++) {
                                for (int o = 0; o <= 5; o++) {
                                    for (int p = 0; p <= 5; p++) {
                                        for (int q = 0; q <= 5; q++) {
                                            if (i * a1 + j * a2 + k * a3 + l * a4 + m * a5 + n * a6 + o * a7 + p * a8
                                                    + q * a9 == sum) {
                                        
                                                    System.out.println(i + j + k + l + m + n + o + p);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }    
}