public class Demo {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z = 0;
        if (!(x++ > 1 && y++ > 1)) {
        	
            System.out.println("x :" + x);
            System.out.println("y :" + y);
            z = x + y;
        }
        System.out.println("--------:");
        System.out.println("x :" + x);
        System.out.println("y : " + y);
        System.out.println("z " + z);
    }
}