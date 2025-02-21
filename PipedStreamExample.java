import java.io.*;

class WriterThread extends Thread{
    private PipedOutputStream outputStream;
    public WriterThread(PipedOutputStream outputStream){
        this.outputStream=outputStream;
    }
    public void run(){
        try{
            String data="Hello from Writer Thread!";
            outputStream.write(data.getBytes());
            outputStream.close();
        }catch(IOException e){
            System.out.println("Error in WriterThread: "+e.getMessage());
        }
    }
}

class ReaderThread extends Thread{
    private PipedInputStream inputStream;
    public ReaderThread(PipedInputStream inputStream){
        this.inputStream=inputStream;
    }
    public void run(){
        try{
            byte[] buffer=new byte[1024];
            int length;
            while((length=inputStream.read(buffer))!=-1){
                System.out.println("Received data: "+new String(buffer,0,length));
            }
            inputStream.close();
        }catch(IOException e){
            System.out.println("Error in ReaderThread: "+e.getMessage());
        }
    }
}

public class PipedStreamExample{
    public static void main(String[] args){
        try{
            PipedOutputStream outputStream=new PipedOutputStream();
            PipedInputStream inputStream=new PipedInputStream(outputStream);
            
            WriterThread writerThread=new WriterThread(outputStream);
            ReaderThread readerThread=new ReaderThread(inputStream);
            
            writerThread.start();
            readerThread.start();
            
            writerThread.join();
            readerThread.join();
        }catch(IOException|InterruptedException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
