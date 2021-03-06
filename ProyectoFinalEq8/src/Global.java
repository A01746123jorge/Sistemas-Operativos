public class Global {
    public static int N = 1;
    public static int M = 1;
    public static int runs = 5;
    public static MySemaphore sMutex = new MySemaphore(0);

    public static MySemaphore sMesaOrdenesD = new MySemaphore(N);
    public static MySemaphore sMesaOrdenesO = new MySemaphore(0);
    public static MySemaphore sMesaHamburguesaD = new MySemaphore(M);
    public static MySemaphore sMesaHamburguesaO = new MySemaphore(0);
    public static MySemaphore sMesaPedidosD = new MySemaphore(M);
    public static MySemaphore sMesaPedidosO = new MySemaphore(0);

    public static void setN(int num) {
        N = num;
        sMesaOrdenesD = new MySemaphore(num);
    }

    public static void setM(int num) {
        M = num;
        sMesaHamburguesaD = new MySemaphore(num);
        sMesaPedidosD = new MySemaphore(num);
    }

    public static void waitRandom() throws RuntimeException{
        try {
            Thread.sleep((long)(Math.random() * 1000));
        }
        catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
