// Вывод всех четных чисел от 1 до 100
// Напишите метод printEvenNums,
// который выведет на экран все четные числа в промежутке от 1 до 100
// каждое на новой строке.

class Answer{
    public static void printEvenNums() {
        // решение

        for (int i = 2; i <= 100; i +=2) {
            System.out.println(i);
        }
        
    }
}


public class Printer{
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.printEvenNums();
    }
    
}
