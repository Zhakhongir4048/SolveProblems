package methodsstring;

public class ПолучениеИмяФайлаИзЕгоПути {
    public static void main(String[] args) {
        String filePath = "D:\\Movies\\Futurama.mp4";
        int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
        String fileName = filePath.substring(lastFileSeparatorIndex + 1);
        System.out.println(fileName); //9
    }
}
