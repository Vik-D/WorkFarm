package work1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Alisa",34,5900,"оп корова за свої гроші");
        Cow cow1 = new Cow("Fartag",54,5500,"Топ корова за свої гроші");
        Cow cow2 = new Cow("Lerba",83,5903,"Також топ корова за свої гроші");

        Dog dog= new Dog("Alisa",34,5900,"оп корова за свої гроші");
        Dog dog1 = new Dog("Fartag",54,5500,"Топ корова за свої гроші");
        Dog dog2 = new Dog("Lerba",83,5903,"Також топ корова за свої гроші");

        Hourse hou = new Hourse("Alisa",34,5900,"оп корова за свої гроші");
        Hourse hou1 = new Hourse("Fartag",54,5500,"Топ корова за свої гроші");
        Hourse hou2 = new Hourse("Lerba",83,5903,"Також топ корова за свої гроші");

        Pet[] c = new Pet[3];
        c[0]= cow;
        c[1]= cow1;
        c[2]= cow2;

        Pet[] d = new Pet[3];
        d[0]= dog;
        d[1]=dog1;
        d[2]=dog2;

        Pet[] h = new Pet[3];
        h[0]=hou;
        h[1]=hou1;
        h[2]=hou2;


         boolean q = false;
        Scanner scanner = new Scanner(System.in);
        while (q=true){
        System.out.println("1");
        String user= scanner.next();
             if (user.equals("start")){
                 System.out.println("2");
                 String user2= scanner.next();
                 if (user2.equals("print all")){
                     for (int i =0 ; i<c.length;i++){
                         System.out.println(c[i]);
                     }
                     System.out.println(" ");
                     for (int i =0 ; i<c.length;i++){
                         System.out.println(d[i]);
                     }
                     System.out.println(" ");
                     for (int i =0 ; i<c.length;i++){
                         System.out.println(h[i]);
                     }
                 }
                 else {
                     System.out.println("error");
                 }
             }
             else {
                 System.out.println("error");
             }
         }
    }
}
