import java.io.IOException;

public class OddThread extends Thread{
    private String name;
    public OddThread( String Name){
        name = Name;
    }
    @Override
    public void run() {
        try {
            for (int i =1 ;i <10;i=i+2){
                System.out.println("Cout oddnumber" +i);
                Thread.sleep(10);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
