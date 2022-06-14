public class Lambda1 {
    public static void main(String[] args) {
        //传统写法
        Add1 add1 = new Add1() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        int result = add1.add(3, 4);
        System.out.println(result);

        //Lambda写法
        //=() -> {}
        Add1 a1 = (int a, int b) -> {
            return a + b;
        };
//大括号只有一句 所以大括号可以删除
        Add1 a2 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(a2.add(3,44));
    }

}

interface Add1{
    int add(int a, int b);
//    void print();
}
