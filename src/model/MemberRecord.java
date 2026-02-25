package model;

public class MemberRecord {
    private int memberId;
    private String type;
    private int dateOfMembership;
    private int noBooksIssued;
    private final int maxBookLimit;
    private String name;
    private String address;
    private String phoneNo;

    public MemberRecord(int memberId,String type,int dateOfMembership,int noBooksIssued,int maxBookLimit,String name,String address,String phoneNo) {
        this.memberId = memberId;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.noBooksIssued = noBooksIssued;
        this.maxBookLimit = maxBookLimit;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getType() {
        return type;
    }

    public int getDateOfMembership() {
        return dateOfMembership;
    }

    public int getNoBooksIssued() {
        return noBooksIssued;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDateOfMembership(int dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public void setNoBooksIssued(int noBooksIssued) {
        this.noBooksIssued = noBooksIssued;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMember() {
        return "Member Id" + memberId +
                "/Name"  + name +
                "/Type" + type +
                "/nBooks Issued" + noBooksIssued + "/" + maxBookLimit;
    }

    public void incBookIssued() {
        if(noBooksIssued < maxBookLimit) {
            noBooksIssued++;
            System.out.println("Kitap başarıyla eklendi.Toplam: " +noBooksIssued);
        } else  {
            System.out.println("Hata" + maxBookLimit + "Kitap limitine ulaştınız!");
        }
    }

    public void decBookIssued() {
        if(noBooksIssued > 0) {
            noBooksIssued--;
            System.out.println("Kitap iade edildi. Kalan: " + noBooksIssued);
        }
    }

    public void  payBill(int amount) {
        System.out.println(name + " için " + amount + "TL tutarında fatura kesildi/ödendi");
    }
}
