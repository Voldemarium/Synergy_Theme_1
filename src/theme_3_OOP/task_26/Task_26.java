package theme_3_OOP.task_26;


public class Task_26 {
    public static void main(String[] args) {
//  1. Напишите сами крестики-нолики, не подглядывая в наш код.
//        TicTacToe ticTacToe = new TicTacToe();
//        ticTacToe.startPlay();
//  2. Напишите “змейку”. Есть поле 20х20, есть змейка длиной, пусть, 3 квадрата. Выводится поле с положением змейки.
     //  Пользователь вводит, куда сделать следующий шаг - повернуть, или не двигаться.
    //  Рисуется поле с новым положением змейки.
        SnakeGame snakeGame = new SnakeGame();
        snakeGame.startPlay();

//   3. Доработайте змейку, что б при врезании в стену(край поля) - игра
//оканчивалась
//   4. Доработайте змейку, что б на поле были фрукты. Если змейка их съедает -
//она растет. Если съела все фрукты - игрок победил.
//   5. Доработайте змейку, пусть на поле еще могут быть стены. в них тоже нельзя врезаться
    }
}