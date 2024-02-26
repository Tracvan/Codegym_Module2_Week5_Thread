public class NumberGenerator implements Runnable{
    String name;

    public NumberGenerator(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for(int i = 0; i<10 ; i++){
            System.out.println("Number: " + i  + "|" + this.name);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
