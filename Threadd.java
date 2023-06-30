class MyThread implements Runnable{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }
}

class Threadd{

    public static void main(String...r) {
        
        MyThread my1 =new MyThread();
        Thread t1 =new Thread(my1);
        t1.start();
       // System.out.println(my1.getName());
       /*  my1.setName("my1");
        System.out.println(my1.getName());
        try {
            my1.join(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
         */
        MyThread my2 =new MyThread();
         Thread t2 =new Thread(my2);
        t2.start();
    //    System.out.println(my2.getName());
    /* my2.setName("my2");
        System.out.println(my2.getName());
     */    
    }
}