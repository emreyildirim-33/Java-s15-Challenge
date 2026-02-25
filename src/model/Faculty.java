package model;

public class Faculty extends MemberRecord {
    public Faculty(int memberId, String type, int dateOfMembership, int noBooksIssued, int maxBookLimit, String name, String address, String phoneNo) {
        super(memberId, type, dateOfMembership, noBooksIssued, maxBookLimit, name, address, phoneNo);
    }

    @Override
    public String getMember() {
        return "Fakülte üyesi: " + getName() + "(ID: " + getMemberId() + ")";
    }
}
