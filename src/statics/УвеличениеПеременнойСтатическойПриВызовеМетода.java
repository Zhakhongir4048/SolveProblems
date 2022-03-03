package statics;

public class УвеличениеПеременнойСтатическойПриВызовеМетода {
    public class Cat{
        private static int catsCount = 0;


        private static void addNewCat(){
            catsCount++;
        }

        public static void main(String[] args) {

        }
    }
}
