package _07_ForLoop.Cozumler;

public class Q05 {

    public static void main(String[] args) {
// Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####

        for(int satir=0;satir<5;satir++) //1 6 da olurdu
        {
            for(int sutun=0;sutun<5;sutun++)
                System.out.print("#");

            System.out.println();
        }
    }
}
