package FinalTest;
import java.util.Scanner;

public class Registry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Завести новое животное");
            System.out.println("2. Вывести список команд животного");
            System.out.println("3. Обучить животное новым командам");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try (Counter counter = new Counter()) {
                        counter.add();
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    System.out.print("Введите имя животного: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите команду: ");
                    String command = scanner.nextLine();
                    // Создаем объект животного и добавляем в коллекцию
                    break;
                case 2:
                    // Логика для вывода команд
                    break;
                case 3:
                    // Логика для обучения новым командам
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Неверный ввод, попробуйте снова.");
            }
        }
    }
}
