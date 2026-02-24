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
}
