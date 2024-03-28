import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ckeckFile();
    }

    public static void ckeckFile() {
        int attempt = 1;
        boolean fileExists;
        boolean isDerictory;
        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            fileExists = file.exists();
            isDerictory = file.isDirectory();
            if (!fileExists) {
                System.out.println("Путь к файлу указан неверно!,");continue;
            }else if (isDerictory){
                System.out.println("Указан путь к папке!");continue;
            }else if (fileExists){
                System.out.println("Путь указан верно. Это файл номер №" + attempt);
                attempt++;
            }
        }
    }
}