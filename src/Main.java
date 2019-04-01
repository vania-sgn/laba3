
import java.util.Scanner;


public class Main {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder SrBuilder = new StringBuilder();
        System.out.println("Введите строку:");
        String x = scanner.nextLine();
        SrBuilder.append(x);
        System.out.println();
        System.out.println("Cтрока вида:");
        System.out.println(SrBuilder);


        int indexM = SrBuilder.indexOf("м"); // Нахождение символа в строке
        int indexJava = SrBuilder.indexOf("java"); // Нахождение слова в строке
        //Метод вернет индекс первого вхождения, если символ или слово не будет найдено, то метод вернет -1
        if (indexM == -1) {
            System.out.println("Символ \"м\" не найден.");
        } else {
            System.out.println("Символ \"м\" найден в индексе " + indexM);
        }

        if (indexJava == -1) {
            System.out.println("Слово \"java\" не найдено.");
        } else {
            System.out.println("Слово \"java\" найдено в индексе " + indexJava);


            String str = "фыва пролджэ. йцукен гшщзхъ: ячсмить бю.порпорпорй";
            String resultStr = str.substring(str.indexOf('п'), str.indexOf('.'));
            System.out.println(resultStr);


            String s = "my very long ttring to test";

            for (String st : s.split(" ")) {
                if (st.startsWith("t") && st.endsWith("t")) {
                    System.out.println(st);
                }
            }

        }

    }}