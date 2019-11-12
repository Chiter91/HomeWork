package assessment;

/*
Имеется строка с текстом.
Подсчитайте уникальное количество слов в тексте.
Учитывайте, что слова могут разделяться несколькими пробелами, знаками препинания.
Пробелы могут присутствовать в начале и конце текста.
Примеры уникальности:


dog и Dog - одинаковые

dog и dogs - разные

Пример:
Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text.

14
 */

public class Assessment5 {
    public static void main(String[] args) {
        int count = 0;
        char ch;
        String s = "   Listen10   10    to  1  the news from today and read the text at the same time. Listen to the news from today without reading the text.";
        s = s.trim();
        boolean uniquely;
        boolean temp = false;

        String[] stringArray;
        stringArray = s.split(" ");
        StringBuilder[] sbArray = new StringBuilder[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {           //заполняем StringBuilder[] строками слов
            if (stringArray[i].length() == 0) {
                sbArray[i] = new StringBuilder ("nul" + i);       //подстраховываемся от двойного пробела между слов
                continue;
            }
            else
                sbArray[i] = new StringBuilder(stringArray[i]);

            for(int j = 0; j < stringArray[i].length(); j++) {        //удаляем все знаки препинания
                ch = stringArray[i].charAt(j);
                if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9')) {
                    sbArray[i].delete(j, sbArray[i].length());
                    break;
                }
            }
        }

        for (int i = 0; i < sbArray.length; i++) {         //сравниваем все элемента массва строк
            for (int j = i + 1; j < sbArray.length; j++){
                uniquely = sbArray[i].toString().equalsIgnoreCase(sbArray[j].toString());
                if (uniquely) {
                    sbArray[j] = new StringBuilder ("null" + j);  //при находении уникального слова затираем другими данными и ищем дальше
                    temp=true;
                }

            }
            if (temp) {
                count += 2;
                temp= false;
            }
        }
        System.out.println(count);
    }
}