public class EvenThread extends Thread {
    private String name ;
    public EvenThread(String Name){
        name = Name;
    }
    @Override
    public void run() {
        try {
            for (int i =0 ;i <10;i=i+2){
                System.out.println("Cout EvenNumber" +i);
                Thread.sleep(15);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
