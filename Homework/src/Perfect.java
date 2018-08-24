public class Perfect {
    public static void PerfectNumber() {
        int i;
        for(i = 1; i < 1000; i++) {
            if(Number(i)) {
                System.out.println(i);
            }
        }
    }
        public static boolean Number(int i) {
            boolean Number = false;
            int sum = 0;
            int x;
            for(x = 1; x < i; x++){
                if(i % x == 0){
                    sum = sum + x;
                }
            }
            if(sum == i) {
                Number = true;
            }
            return Number;
        }

}

