class Main {
    public static void main(String[] args) {
        String s1 = "100";
        String s2 = "100";
        String s3 = multiply(s1, s2);
        System.out.println(s3);
    }
    public static String multiply(String s1, String s2){
        char[] chr1 = s1.toCharArray();
        char[] chr2 = s2.toCharArray();
        int n = 0;
        int base = 1;
        for(int i=chr1.length-1; i>=0; i--){
            n = n + (chr1[i] - '0')* base;
            base *= 10;
        }
        base = 1;
        int m = 0;
        for(int i=chr2.length-1; i>=0; i--){
            m = m + (chr2[i] - '0')* base;
            base *= 10;
        }
        int mul = (n*m);
        return Integer.toString(mul);
    }
}
