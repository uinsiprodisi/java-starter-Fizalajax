import java.util.Scanner;

public class App {

    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.print("masukan nama ");
        String nama = input.nextLine();

        System.out.print("masukan nim ");
        String nimStr = input.nextLine();
        int nim = Integer.parseInt(nimStr);
        
        System.out.print("masukan prodi ");
        String prodi = input.nextLine();

        System.out.print("alasan belajar java ");
        String alasan = input.nextLine();
        
        System.out.println("halo" + nama +", dengan NIM " + nim + "selamat belajar JAVA");
    }
}