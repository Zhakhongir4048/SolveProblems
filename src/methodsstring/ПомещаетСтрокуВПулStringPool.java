package methodsstring;

public class ПомещаетСтрокуВПулStringPool {
    public static void main(String[] args) {
        String string = "Идти вперёд";
        string = string.intern();         // Помещает строку в пул StringPool
        System.out.println(string);
    }
}
