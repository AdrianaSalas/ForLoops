public class Redoneforloops
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        for (int i = 0; i < 15; i = i + 1) {
            System.out.println("i is equal to "+1);
        }
        
        for (int k = 0; k > 5; k = k + 1) {
            System.out.println("This nummber is qualified for k "+1);
        }
        
        for (int a = 0, b = 0; a < 10 && b <= 20; a = a + 1, b++) {
            System.out.println("This number is qualified for a and b "+1);
        }
    }

    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}
