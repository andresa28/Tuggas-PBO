
package Program;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Mahasiswa> mahasiswas = new ArrayList<>();

    private static void inputData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan nim   : ");
        String nim = s.nextLine();
        System.out.print("Masukan nama  : ");
        String nama = s.nextLine();
        System.out.print("Masukan ipk   : ");
        float ipk = s.nextFloat();
        Mahasiswa m = new Mahasiswa(nim, nama, ipk);
        mahasiswas.add(m);
    }

    private static void tampilData() {
        if (mahasiswas.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            System.out.println("-------------------------");
            int counter = 1;
            for (Mahasiswa mahasiswa : mahasiswas) {
                System.out.println("Data ke-" + counter);
                System.out.println("NIM : " + mahasiswa.getNim());
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println("IPK : " + mahasiswa.getIpk());
                counter++;
            }
        }
    }
    
    private static void UrutData(){
        int pil;
        do{
        System.out.println("-------------------------");
        System.out.println("1. Sorting by NIM");
        System.out.println("2. Sorting by Nama");
        System.out.println("3. Sorting by IPK");
        System.out.println("4. Kembali ke menu");
        Scanner s = new Scanner(System.in);
        System.out.print("Pilih: ");
        pil = s.nextInt();
        switch (pil){
            case 1:
                System.out.println("Shorting by NIM");
                Collections.sort(mahasiswas, new Comparator<Mahasiswa>(){
                    @Override
                        public int compare (Mahasiswa m1, Mahasiswa m2){
                        return m1.getNim().compareTo(m2.getNim());
                        }
                    });
                int counter = 1;
                for (Mahasiswa mahasiswa : mahasiswas) {
                    System.out.println("Data ke-" + counter);
                    System.out.println("NIM : " + mahasiswa.getNim());
                    System.out.println("Nama: " + mahasiswa.getNama());
                    System.out.println("IPK : " + mahasiswa.getIpk());
                    counter++;}
                break;
            case 2:
                Collections.sort(mahasiswas, new Comparator<Mahasiswa>(){
                    @Override
                        public int compare (Mahasiswa m1, Mahasiswa m2){
                        return m1.getNama().compareTo(m2.getNama());
                        }
                    });
                System.out.println("Shorting by Nama");
                
                int count = 1;
                for (Mahasiswa mahasiswa : mahasiswas) {
                    System.out.println("Data ke-" + count);
                    System.out.println("NIM : " + mahasiswa.getNim());
                    System.out.println("Nama: " + mahasiswa.getNama());
                    System.out.println("IPK : " + mahasiswa.getIpk());
                    count++;}
                break;
            case 3:
                Collections.sort(mahasiswas, new Comparator<Mahasiswa >() {
                @Override
                public int compare(Mahasiswa m1, Mahasiswa m2) {
                return Float.compare(m1.getIpk(), m2.getIpk());
                }
                });
                System.out.println("Shorting by IPK");
                int coun = 1;
                for (Mahasiswa mahasiswa : mahasiswas) {
                    
                    System.out.println("Data ke-" + coun);
                    System.out.println("NIM : " + mahasiswa.getNim());
                    System.out.println("Nama: " + mahasiswa.getNama());
                    System.out.println("IPK : " + mahasiswa.getIpk());
                    coun++;}
                break;
        }
        }while (pil !=4);
    }
    public static void tampilan() {
        int pilih = 0;
        do {
            ulang:
            System.out.println("");
            System.out.println("--------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Shorting");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            Scanner s = new Scanner(System.in);
            pilih = s.nextInt();
            switch (pilih) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    UrutData(); 
            }
        } while (pilih != 4);
    }

    public static void main(String[] args) {
        tampilan();
    }

}
