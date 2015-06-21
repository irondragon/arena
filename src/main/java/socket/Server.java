package socket;

/**
 * Created by messi on 28.03.2015.
 */
import java.net.*;
import java.io.*;
public class Server {

    public static final int i1 = 1;
    public static final int i2 = 2;

    public static void main(String[] ar)    {
        int port = 6666; // случайный порт (может быть любое число от 1025 до 65535)
        try {
            ServerSocket ss = new ServerSocket(port); // создаем сокет сервера и привязываем его к вышеуказанному порту
            System.out.println("Waiting for a client...");

            Socket socket = ss.accept(); // заставляем сервер ждать подключений и выводим сообщение когда кто-то связался с сервером
            System.out.println("Got a client :) ... Finally, someone saw me through all the cover!");
            System.out.println();

            // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиенту.
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            String line = null;
            Thread thread = null;
            while(true) {
                line = in.readUTF(); // ожидаем пока клиент пришлет строку текста.
                System.out.println("The dumb client just sent me this line : " + line);
                System.out.println("I'm sending it back...");
                if (Integer.valueOf(line) == i1) {
                    thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while(!Thread.currentThread().interrupted()) {
                               // try {
                                    System.out.println("Compute...");
//                                    Thread.sleep(2000);
//                                } catch (InterruptedException e) {
//                                    System.out.println(Thread.currentThread().isInterrupted());
//                                }
                            }
                        }
                    });
                    thread.start();
                }
                if (Integer.valueOf(line) == i2) {
                    thread.interrupt();
                }
                out.writeUTF(line); // отсылаем клиенту обратно ту самую строку текста.
                out.flush(); // заставляем поток закончить передачу данных.
                System.out.println("Waiting for the next line...");
                System.out.println();
            }
        } catch(Exception x) { x.printStackTrace(); }
    }
}
