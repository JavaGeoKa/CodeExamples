package core.multithreading;

import java.util.Date;
import java.util.Random;

public class MyThreadImplRunnable implements Runnable{
    @Override
    public void run() {

        System.out.println("Дочерний поток начал работу: "+new Date());
        Random rnd=new Random();
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(1000+rnd.nextInt(4000));
                System.out.println("Дочерний поток: "+new Date());
            }catch(InterruptedException e){ // Обработка исключения
                System.out.println(e);}
        }
        System.out.println("Дочерний поток завершил работу: "+new Date());
    }

    // Конструктор класса:
    MyThreadImplRunnable(){
// Создание и запуск потока:
        new Thread(this).start();}
}


class SimpleThreadDemo{
    // Главный метод может выбрасывать исключение:
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Главный поток начал работу: "+new Date());
        Random rnd=new Random();
// Запуск дочернего потока:
        new MyThreadImplRunnable();
        for(int i=1;i<5;i++){
            Thread.sleep(5000+rnd.nextInt(5000));
            System.out.println("Главный поток: "+new Date());}
        System.out.println("Главный поток завершил работу: "+new Date());
    }
}
