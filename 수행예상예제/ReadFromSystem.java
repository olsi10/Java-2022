package IO;

import java.io.IOException;

public class ReadFromSystem {
    public static void main(String[] args) {
        byte b[] = new byte[1024];
        int len = 0;
        try {
            len =  System.in.read(b);
            System.out.write(b, 0, len);
        } catch (IOException e) {
            System.out.println("입력 실패");
        }
    }
}
