package methodrefrencing;

import java.util.function.BiFunction;

class Cricker {
    public static void play(){
        System.out.println("Playing cricket");
    }

    public static void stopPlay(){
        System.out.println("Stop playing");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

public class Sports {
    public static void main(String[] args) {
        Sport sport = Cricker:: play;
        sport.play();



        BiFunction<Integer,Integer,Integer> add = Cricker::add;

        System.out.println(add.apply(20,20));

    }

}
