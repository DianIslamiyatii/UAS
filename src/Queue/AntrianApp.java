package Queue;
public class AntrianApp {
    public static void main (String[]args){
    Antrian antrian= new Antrian (5);
    antrian.enqueue(4);
    antrian.display();
    antrian.enqueue(8);
    antrian.display();
    System.out.println("yang diambil dari antrian = "+ antrian.dequeue());
    System.out.println("Nama saya adalah DIAN ISLAMIYATI");
    antrian.display();
    System.out.println("");
    antrian.enqueue(7);
    antrian.display();
    antrian.enqueue(6);
    antrian.display();
    System.out.println("nilai yang paling depan = "+ antrian.peek());
    }
}