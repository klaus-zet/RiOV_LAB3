import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean flag = true;
        while (flag == true) {
            System.out.println("Выберете номер задания: ");
            Scanner scan = new Scanner(System.in);
            int task = scan.nextInt();
            String test_str = scan.nextLine();

            switch (task) {
                case (1): {
                    //Метод str.equals используется для сравнения строк
                    //Метод StringBuilder(str).reverse().toString() переворачивает строку

                    System.out.println("1. Написать программу, которая проверяет, является ли строка палиндромом");
                    System.out.println("Введите строку:");
                    String task1 = scan.nextLine();
                    if (task1.equals((new StringBuffer(task1)).reverse().toString())) {
                        System.out.println("Введенная строка является палиндромом");
                    } else
                        System.out.println("Введенная строка не является палиндромом");
                }
                flag = false;
                break;

                case (2): {
                    //Метод indexOf() возвращает первый индекс, по которому данный элемент
                    // может быть найден в массиве или -1, если такого индекса нет.

                    //Метод charAt() возвращает указанный символ из строки.

                    //Метод lastIndexOf() возвращает индекс последнего вхождения указанного значения в строковый объект String,
                    // на котором он был вызван, или -1,
                    // если ничего не было найдено. Поиск по строке ведётся от конца к началу, начиная с индекса fromIndex.

                    System.out.println(" 2. Реализовать удаление повторяющихся символов в строке");
                    String task2 = scan.nextLine();
                    String result = "";
                    for (int i = 0; i < task2.length(); i++) {
                        if (task2.indexOf(task2.charAt(i)) == task2.lastIndexOf(task2.charAt(i))) {
                            result += task2.charAt(i);
                        }
                    }
                    System.out.println(result);
                }

                flag = false;
                break;

                case (3): {
                    System.out.println("3. Реализовать проверку, являются ли две строки анаграммами");
                    String task3_1 = scan.nextLine();
                    String task3_2 = scan.nextLine();
                    if (task3_1.length() != task3_2.length()) { //Сравниваем длину
                        System.out.println("Не являются анаграммами");
                    } else {
                        StringBuilder s1 = new StringBuilder(task3_1.toLowerCase());
                        StringBuilder s2 = new StringBuilder(task3_2.toLowerCase());
                        int x, y;
                        x = -1;
                        while (++x < s1.length()) {
                            y = -1;
                            while (++y < s2.length()) {
                                if (s1.charAt(x) == s2.charAt(y)) {
                                    s2.deleteCharAt(y);
                                }
                            }
                        }
                        if (s2.length() == 0){
                        System.out.println("Являются анаграммами");}
                        else{System.out.println("Не являются анаграммами");}
                    }
                }
                flag = false;
                break;

                case (4): {
                    //Метод compareTo() в Java структурирован двумя вариантами.
                    // Первый: метод сравнивает строку с другим объектом,
                    // а второй: метод лексически сравнивает две строки.

                    //В Java compareTo() получает значение 0, если аргумент является строкой лексически равной данной строке; значение меньше 0,
                    // если аргумент является строкой лексически большей, чем сравниваемая строка; и значение больше 0,
                    // если аргумент является строкой лексически меньшей этой строки.

                    System.out.println("4. Напишите Java-программу для лексикографического сравнения двух строк");
                    String task4_1 = scan.nextLine();
                    String task4_2 = scan.nextLine();
                    System.out.println(task4_1.compareTo(task4_2));
                }
                flag = false;
                break;

                case (5): {
                    //compareToIgnoreCase() возвращает отрицательное целое число, ноль или положительное целое число,
                    // если заданная строка меньше, равна или больше сравниваемой строки, игнорируя регистр

                    System.out.println("5. Напишите Java-программу для лексикографического сравнения двух строк, игнорируя различия в регистре");
                    String task5_1 = scan.nextLine();
                    String task5_2 = scan.nextLine();
                    System.out.println(task5_1.compareToIgnoreCase(task5_2));
                }
                flag = false;
                break;

                case (6): {
                    System.out.println("6. Напишите программу на Java для объединения данной строки в конец другой строки");
                    String task6_1 = scan.nextLine();
                    String task6_2 = scan.nextLine();
                    System.out.println(task6_1 + " " + task6_2);
                }
                flag = false;
                break;

                case (7): {
                    //Метод contentEquals() – возвращает значение true только в том случае, если эта строка представляет собой ту же
                    // последовательность символов, которая указана в строке буфера (StringBuffer).
                    System.out.println("7. Напишите Java-программу для сравнения заданной строки с указанной последовательностью символов");
                    String task7_1 = scan.nextLine();
                    String task7_2 = scan.nextLine();
                    if (task7_1.contentEquals(task7_2) == true) {
                        System.out.println("Строки совпадают");
                    } else {
                        System.out.println("Строки различны");
                    }
                }
                flag = false;
                break;

                case (8): {
                    //Метод endsWith() позволяет определить, заканчивается ли строка символами указанными в скобках,
                    // возвращая, соответственно, true или false.
                    System.out.println("8. Напишите программу на Java, чтобы проверить, заканчивается ли данная строка содержимым другой строки");
                    String task8_1 = scan.nextLine();
                    String task8_2 = scan.nextLine();
                    System.out.println(task8_2.endsWith(task8_1));
                }
                flag = false;
                break;

                case (9): {
                    System.out.println("9.Напишите программу на Java, чтобы проверить, содержат ли два объекта String одинаковые данные");
                    String task9_1 = scan.nextLine();
                    String task9_2 = scan.nextLine();
                    System.out.println(task9_1.equals(task9_2));
                }
                flag = false;
                break;

                case (10): {
                    System.out.println("10. Напишите Java-программу, чтобы получить длину заданной строки");
                    String task10 = scan.nextLine();
                    System.out.println("Длина строки: " + task10.length());
                }
                flag = false;
                break;

                case (11): {
                    System.out.println("11. Напишите программу на Java, чтобы преобразовать все символы строки в нижний регистр");
                    String task11 = scan.nextLine();
                    System.out.println(task11.toLowerCase());
                }
                flag = false;
                break;

                case (12): {
                    System.out.println("12. Напишите программу на Java, чтобы преобразовать все символы в строке в верхний регистр");
                    String task12 = scan.nextLine();
                    System.out.println(task12.toUpperCase());
                }
                flag = false;
                break;

                case (13): {
                    System.out.println("13. Напишите программу на Java, чтобы найти второй по частоте символ в данной строке");
                    Map<String, Integer> symbols = new HashMap<String, Integer>();

                    //Метод indexOf() возвращает первый индекс, по которому данный элемент может быть найден в массиве или -1,
                    // если такого индекса нет.

                    //берется каждый символ, затем считается кол-во повторений этого символа
                    String task13 = scan.nextLine();
                    for (int i = 0; i < task13.length(); ) {
                        int count = 0;
                        char t = task13.charAt(i);
                        boolean b = true;
                        while (b) {
                            if (task13.indexOf(t, i) != -1) {
                                count++;
                                i++;
                            } else {
                                b = false;
                            }
                        }
                        symbols.put(Character.toString(t), count);//запись в формате "значение:кол-во повторений"
                    }

                    //keySet(): возвращает набор всех ключей отображения

                    //находим самое большое кол-во повторений
                    String maxKey = null;
                    for (String key : symbols.keySet()) {
                        if (maxKey == null || symbols.get(key) > symbols.get(maxKey)) {
                            maxKey = key;
                        }
                    }

                    //Удаляется символ, встречающийся больше всех
                    //Снова находим самое большое кол-во повторений
                    symbols.remove(maxKey);
                    maxKey = null;
                    for (String key : symbols.keySet()) {
                        if (maxKey == null || symbols.get(key) > symbols.get(maxKey)) {
                            maxKey = key;
                        }
                    }
                    System.out.println(maxKey);
                }
                flag = false;
                break;

                case (14): {
                    System.out.println("14. Напишите программу на Java для печати после удаления дубликатов из заданной строки");
                    String task14 = scan.nextLine();
                    int len;
                    do {
                        len = task14.length();
                        task14 = task14.replaceAll("([^a-z])\\1", "");
                    }
                    while (len != task14.length());
                    System.out.println(task14);
                }
                flag = false;
                break;

                case (15): {
                    //Метод indexOf() возвращает первый индекс, по которому данный элемент
                    // может быть найден в массиве или -1, если такого индекса нет.

                    //Метод charAt() возвращает указанный символ из строки.

                    //Метод lastIndexOf() возвращает индекс последнего вхождения указанного значения в строковый объект String,
                    // на котором он был вызван, или -1,
                    // если ничего не было найдено. Поиск по строке ведётся от конца к началу, начиная с индекса fromIndex.

                    System.out.println("15. Напишите программу на Java, чтобы найти первый неповторяющийся символ в строке");
                    String task15 = scan.nextLine();
                    boolean f = true;
                    for (int i = 0; i < task15.length() && f; i++) {
                        //если индексы равны -> первый неповторяющийся символ в строке
                        if (task15.indexOf(task15.charAt(i)) == task15.lastIndexOf(task15.charAt(i))) {
                            System.out.print(task15.charAt(i));
                            f = false;
                        }
                    }
                    System.out.println();
                }
                flag = false;
                break;

                case (16): {
                    //Метод substring() в Java имеет два варианта и возвращает новую строку, которая является подстрокой данной строки.
                    // Подстрока начинается с символа, заданного индексом, и продолжается до конца данной строки или до endIndex-1, если введен второй аргумент.

                    System.out.println("16. Напишите программу на Java, которая возвращает true из заданной строки,");
                    System.out.println("если первые два символа в строке также появляются в конце");
                    String task16 = scan.nextLine();
                    String begin = (task16.substring(0, 2)).toLowerCase();//первые 2
                    String end = (task16.substring(task16.length() - 2)).toLowerCase();//вторые 2
                    System.out.println(begin.equals(end));
                }
                flag = false;
                break;

                case (17): {
                    //Метод indexOf() возвращает первый индекс, по которому данный элемент может быть найден в массиве или -1,
                    // если такого индекса нет.
                    //берется каждый символ, затем считается кол-во повторений этого символа

                    System.out.println("17. Напишите программу на Java, которая возвращает количество символов, появляющихся три раза подряд в строке");
                    String task17 = scan.nextLine();
                    int len17 = task17.length();
                    int countW = 0;
                    for (int i = 0; i < len17; ) {
                        int countN = 0;
                        char t1 = task17.charAt(i);
                        int index = i;
                        boolean b17 = true;
                        while (b17) {
                            if (task17.indexOf(t1, index) != -1) {
                                countN++;
                                index++;
                            } else {
                                b17 = false;
                                i = index;
                            }
                        }
                        if (countN == 3) {//Если 3 повторения
                            countW++;
                        }
                    }
                    //String prev = null;
                    System.out.println(countW);
                }
                flag = false;
                break;

                case (18): {
                    System.out.println("18. Напишите программу на Java, которая возвращает сумму цифр, присутствующих в строке.");
                    System.out.println("Если цифр нет, возвращаемая сумма равна 0");
                    String task18 = scan.nextLine();
                    //отбор с помощью регулярных выражений
                    task18 = task18.replaceAll("[^0-9]", "");
                    if (task18.isEmpty()) {
                        System.out.println("сумма = 0");
                    } else {
                        int sum = 0;
                        boolean b18 = true;
                        int num = Integer.parseInt(task18);
                        while (b18) {
                            sum += num % 10;//деление с остатком (остаток)
                            num /= 10;
                            if (num <= 0) {
                                b18 = false;
                            }
                        }
                        System.out.println(sum);
                    }
                    flag = false;
                    break;
                }
            }

        }
    }
}