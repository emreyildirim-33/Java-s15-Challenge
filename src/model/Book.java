package model;

public abstract class  Book {
    private int id;
    private String author;
    private String name;
    private int price;
    private String status;
    private String edition;
    private int dateOfPurchase;


    public Book(int id,String author,String name,int price,String status,String edition,int dateOfPurchase) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public String getEdition() {
        return edition;
    }

    public int getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setDateOfPurchase(int dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
