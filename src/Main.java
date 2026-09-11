import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama Anda : ");
        String nama = scanner.nextLine();

        System.out.print("Masukan NIM : ");
        String nim = scanner.nextLine();

        System.out.print("Masukan umur : ");
        int umur = scanner.nextInt();

        System.out.print("Masukan tinggi : ");
        double tinggi = scanner.nextDouble();
        scanner.nextLine();


    }
}