package cn.sharefish.groups.java8.stream;


class Lambda4 {
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };
        stringConverter1.convert(12);
        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
        stringConverter2.convert(1);
    }
    
    public static void main(String[] args) {
        Lambda4 d = new Lambda4();
        d.testScopes();
        System.out.println(Lambda4.outerStaticNum);
        System.out.println(d.outerNum);
    }
}