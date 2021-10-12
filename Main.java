import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {                         //8
    public static void main(String[] args) {
        int[]a = {1,2,3,4};
        int[]b = {4,16,1,2,3,22};
        int[]c = new int[a.length+b.length];
        int count = 0;
        for(int i = 0; i<a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for(int j = 0;j<b.length;j++) {
            c[count++] = b[j];
        }
        for(int i = 0;i<c.length;i++)
            System.out.print(c[i]+" ");
    }
}

class teenager{                             //1
    public static void main(String[] args) {
        boolean teenager;
        System.out.println("Введите озраст: ");
        Scanner t = new Scanner(System.in);
        int temp = t.nextInt();
        if(temp <= 21){
            teenager = true;
            System.out.println(teenager);
        }else teenager = false;
        System.out.println(teenager);
    }
}

class water{                                //1
    public static void main(String[] args) {
        String s = "steam";
        String w = "water";
        String i = "ice";
        System.out.println("Введите температуру: ");
        Scanner t = new Scanner(System.in);
        int temp = t.nextInt();
        if(temp <= 0){
            System.out.println(i);
        }
        if(temp >= 100) {
            System.out.println(s);
        }
        if(temp >= 1 && temp <= 99) {
            System.out.println(w);
        }
    }
}

class max{                                  //5
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6};
        int tt = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = tt;
        System.out.println(Arrays.toString(a));
    }
}

class union{                                //8
    public static void main(String[] args) {
        int[]a = {1,2};
        int[]b = {3,4};
        int[]c = new int[a.length+b.length];
        int add = 0;
        for(int i = 0; i<a.length; i++) {
            c[i] = a[i];
            add++;
        }

        for(int j = 0;j<b.length;j++) {
            c[add++] = b[j];
        }

        for(int i = 0;i<c.length;i++)
            System.out.print(c[i]+" ");
    }
}

class difference {                           //5
    public static void main(String[] args) {
    int[]a = {1,5,7,2,5,8,1,6,5,4};
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    int smallest = a[0];
    int bigger = a[a.length-1];
    int diff = bigger - smallest;
        System.out.println(diff);
    }
}

//задача №1: создать метод findWord который принимает строку и ищет указанное в аргументе слово, findWord(text, <-это переменная String "word") если его нет, возвращает false
//задача №2: есть список работ на которые могут взять людей с определенными навыками, создать метод который принимает разных Person'ов и основываясь на их параметрах: age, height, weigh, sanity, IQ, English level, сказать на какую работу они пойдут, к примеру: если weigh больше 100 кг, то его возьмут в су-мо, если IQ больше 120, то он станет ученым (а если IQ меньше 2, то он станет тиктокером)
