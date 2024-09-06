// 12S24039 - Jody Alfonso Siahaan
// 12S24042 - Ventyola Rohati Napitupulu

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeisbn;

        kodeisbn = input.nextLine();
        String judul;

        judul = input.nextLine();
        String penulis;

        penulis = input.nextLine();
        int tahunterbit;

        tahunterbit = Integer.parseInt(input.nextLine());
        String penerbit;

        penerbit = input.nextLine();
        String formatbuku;

        formatbuku = input.nextLine();
        double hargapembelian;

        hargapembelian = Double.parseDouble(input.nextLine());
        double minimummargin;

        minimummargin = Double.parseDouble(input.nextLine());
        int stok;

        stok = Integer.parseInt(input.nextLine());
        double rating;

        rating = Double.parseDouble(input.nextLine());
        System.out.println(kodeisbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating);
    }
}
