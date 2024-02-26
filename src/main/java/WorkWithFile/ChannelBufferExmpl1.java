package WorkWithFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExmpl1 {
    public static void main (String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("text2.txt", "rw")) {
            FileChannel channel = file.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder text = new StringBuilder();

            int byteRead = channel.read(buffer);

            while(byteRead > 0) {
                System.out.println("read " + byteRead);
                buffer.flip();

                while (buffer.hasRemaining()){
                    text.append((char)buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(text);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
