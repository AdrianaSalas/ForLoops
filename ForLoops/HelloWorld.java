public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        {int i = 0;
            while (i <= 15) {
                System.out.println("Since i is " + i + ",my code can still run!");
                i = i + 1;
            }  
        }
        {int j = 10;
            while (j >= 0) {
                System.out.println("Since j is " + j + ",my code can still run!");
                j = j - 2;
            }
        }
        {int k= 10;
            while (k >= 0) {
                System.out.println("Since k is " + k + ",my code can still run!");
                k = k - 3;
            }
        }
    }

    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}

