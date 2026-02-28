import model.*;
import service.Library;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(new HashMap<>(), new ArrayList<>(), new HashSet<>());
        Librarian admin = new Librarian("Kütüphaneci", "1234");

        while (true) {
            System.out.println("\n--- KÜTÜPHANE YÖNETİM SİSTEMİ ---");
            System.out.println("1- Kitap Ekle | 2- Üye Ekle | 3- Kitap Ara (ID/İsim/Yazar)");
            System.out.println("4- Kitap Güncelle | 5- Kitap Sil | 6- Kategoriye Göre Listele");
            System.out.println("7- Yazara Göre Listele | 8- Kitap Ödünç Al (Issue) | 9- İade Et | 10- Tümünü Listele | 0- Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1: // Kitap Ekleme
                    System.out.print("ID: "); int bId = scanner.nextInt(); scanner.nextLine();
                    System.out.print("İsim: "); String bName = scanner.nextLine();
                    System.out.print("Yazar: "); String bAuthor = scanner.nextLine();
                    System.out.print("Fiyat: "); int bPrice = scanner.nextInt();
                    library.newBook(new StudyBooks(bId, bAuthor, bName, bPrice, "Available", "1st", 2026));
                    break;

                case 2: // Üye Ekleme
                    System.out.print("Üye ID: "); int mId = scanner.nextInt(); scanner.nextLine();
                    System.out.print("İsim: "); String mName = scanner.nextLine();
                    library.addMember(new Student(mId, "Student", 2026, 0, 5, mName, "Adres", "555"));
                    System.out.println("Üye kaydedildi.");
                    break;

                case 3: // Arama (ID, İsim veya Yazar)
                    System.out.print("Arama Terimi (ID, İsim veya Yazar): ");
                    String search = scanner.nextLine();
                    library.getBooks().values().stream()
                            .filter(b -> String.valueOf(b.getId()).equals(search) || b.getName().contains(search) || b.getAuthor().contains(search))
                            .forEach(b -> b.display());
                    break;

                case 4: // Kitap Güncelleme
                    System.out.print("Güncellenecek Kitap ID: "); int uId = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Yeni İsim: "); String uName = scanner.nextLine();
                    System.out.print("Yeni Fiyat: "); int uPrice = scanner.nextInt();
                    library.updateBook(uId, uName, uPrice);
                    System.out.println("Güncellendi.");
                    break;

                case 5: // Kitap Silme
                    System.out.print("Silinecek Kitap ID: "); int dId = scanner.nextInt();
                    library.removeBook(dId);
                    break;

                case 6: // Kategoriye Göre Listeleme
                    System.out.print("Kategori (Journals, StudyBooks, Magazines): ");
                    String cat = scanner.nextLine();
                    library.getBooks().values().stream()
                            .filter(b -> b.getClass().getSimpleName().equalsIgnoreCase(cat))
                            .forEach(b -> b.display());
                    break;

                case 7: // Yazara Göre Listeleme
                    System.out.print("Yazar İsmi: "); String auth = scanner.nextLine();
                    library.getBooks().values().stream()
                            .filter(b -> b.getAuthor().equalsIgnoreCase(auth))
                            .forEach(b -> b.display());
                    break;

                case 8: // Ödünç Al (Lend) - Fatura ve Limit Kontrolü Dahil
                    System.out.print("Kitap ID: "); int lBId = scanner.nextInt();
                    System.out.print("Üye ID: "); int lMId = scanner.nextInt();
                    MemberRecord member = library.getReader(lMId);
                    if (member != null) {
                        member.requestBook(lBId); // Member requests book
                        admin.issueBook(library, lBId, lMId); // Librarian issues book
                    }
                    break;

                case 9: // İade Et (Take Back) - Ücret İadesi Dahil
                    System.out.print("Kitap ID: "); int rBId = scanner.nextInt();
                    System.out.print("Üye ID: "); int rMId = scanner.nextInt();
                    admin.returnBook(library, rBId, rMId);
                    break;

                case 10: // Tümünü Listele
                    library.showBook();
                    break;

                default: System.out.println("Geçersiz seçenek.");
            }
        }
        System.out.println("Sistemden çıkıldı.");
    }
}