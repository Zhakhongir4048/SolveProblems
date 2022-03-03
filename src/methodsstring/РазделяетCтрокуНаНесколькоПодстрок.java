package methodsstring;

import java.util.Arrays;

public class РазделяетCтрокуНаНесколькоПодстрок {
    public static void main(String[] args) {
        String string = "Человека надо любить всем сердцем за душу, в первую очередь";
        String[] split = string.split("в",3); 	// Разделяет строку на несколько подстрок, мы даже можем лимит поставить, можем и без
        System.out.println(Arrays.toString(split));
    }
}
