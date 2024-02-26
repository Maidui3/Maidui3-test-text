class Test2{
    public static void main(String[] args){
        int ABC,CBA,AAA,BBB;
        ABC = 10;
        CBA = 20;
        AAA = ABC;
        BBB = CBA;
        float X = AAA + BBB;
        String name = "ファイル";

        System.out.println(ABC * CBA);
        System.out.println(X);
        System.out.println(name);
    }
}

/*    　名前:ビット:数
　整数｜byte / 8 / -128 ~ 127
　　　｜short / 16 / -32768 ~ 32767
　　　｜int / 32 / -2147483648 ~ 2147483647
　　　｜long / 64 / -9223372036854775808 ~ 9223372036854775807
　小数｜float /  / 4ビット
　　　｜double /  / 8ビット
　文字｜char /  / 文字一文字
真偽値｜boolean /  / True or false
*/