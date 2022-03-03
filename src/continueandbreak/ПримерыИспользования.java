package continueandbreak;

import java.util.Scanner;

public class ПримерыИспользования {
    public static void main(String[] args) {

        for (int i = 1; i <=20; i++) {
            if ( (i % 7) == 0){
                continue;
            }
            System.out.println(i);
        }


        Scanner console = new Scanner(System.in);
        while (true)
        {
            String s = console.nextLine();
            if (s.equals("exit"))
                break;
        }

        int i = 1;
        while (i <= 20)
        {
            if ( (i % 7) == 0 )
            {
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }

        int w = 0;
        while (w < 20)
        {
            w++;
            if ( (w % 7) == 0)
                continue;
            System.out.println(w);
        }
    }
}
