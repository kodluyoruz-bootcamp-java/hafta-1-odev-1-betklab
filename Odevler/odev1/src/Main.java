package Odevler.odev1.src;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int result = 0;
        for(int i = 0; i<2000; i++){
            if( i%(3*5*7*53) == 0){
                sum = sum + i; //sum +=i;
                count = count + 1; //count++;

            }

        }
       result =  sum / count;
        System.out.println("Sonuç :" +result);
    }
}
