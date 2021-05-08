import java.util.Scanner;

public class MultiThreading extends Thread{

    Scanner myObj ;
    String userName="c" ;

    public MultiThreading(){


    }

    @Override
    public void run(){
        System.out.println("press q to exit loop");
        while(!userName.equals("q")){
            Scanner myObj = new Scanner(System.in);
            String userName = myObj.nextLine();
            System.out.println(userName);
            this.userName=userName;

        }
        System.out.println("out of loop");



    }




}


