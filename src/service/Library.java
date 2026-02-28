package service;

import model.Book;
import model.MemberRecord;
import model.Reader;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
    private Map<Integer , Book> books;
    private List<MemberRecord> readers;
    private Set<String> categories;

    public Library(Map<Integer, Book> books, List<MemberRecord> readers, Set<String> categories) {
        this.books = books;
        this.readers = readers;
        this.categories = categories;
    }

    public void newBook(Book book) {
        books.put(book.getId(),book);
        categories.add(book.getClass().getSimpleName());
        System.out.println(book.getName() + "kütüphaneye eklendi.");
    }

    public void removeBook(int bookId) {
        if (books.containsKey(bookId)) {
            books.remove(bookId);
            System.out.println("Kitap başarıyla silindi.");
        }
    }

    public MemberRecord getReader(int memberId ) {
        for (MemberRecord m : readers) {
            if(m.getMemberId() == memberId) {
                return m;
            }
        }
        return null;
    }

    public Map<Integer, Book> getBooks() {
         return books;
        }

    public void lendBook(int bookId , int memberId) {
        Book book = books.get(bookId);
        MemberRecord member = getReader(memberId);

        if (book != null && member != null) {

            if (book.getStatus().equalsIgnoreCase("Available")) {

                if (member.getNoBooksIssued() < 5) {
                    book.setStatus("Borrowed");
                    member.incBookIssued();
                    member.payBill(book.getPrice());
                    System.out.println(book.getName() + " kitabı " + member.getName() + "kişisine verildi.");
                } else {
                    System.out.println("Hata: Üye 5 kitap limitine ulaşmış!");
                }
            } else {
                System.out.println("Kitap şu an kütüphanede değil.");
            }
        }
    }

        public void takeBackBook ( int bookId, int memberId){
         Book book = books.get(bookId);
         MemberRecord member = getReader(memberId);

         if(book != null && member != null ) {
             book.setStatus("Available");
             member.decBookIssued();
                System.out.println(book.getName() + "iade alındı.Ücret iadesi yapıldı.");
            }
        }

        public void showBook () {
            System.out.println("-----Kütüphane Tüm Kitap Listesi");
            for(Book b : books.values()) {
                System.out.println("ID: " + b.getId() + "|İsim: " + b.getName() + "|Durum: " + b.getStatus() );
              }
            }

            public void addMember(MemberRecord member) {
                 readers.add(member);
            }

            public void updateBook(int id,String newName, int newPrice) {
              Book b = books.get(id);
              if(b != null) {
                  b.setName((newName));
                  b.setPrice(newPrice);
              }
            }
          }




