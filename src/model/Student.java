package model;

public class Student extends MemberRecord {
    public Student(int memberId, String type, int dateOfMembership, int noBooksIssued, int maxBookLimit, String name, String address, String phoneNo) {
        super(memberId, type, dateOfMembership, noBooksIssued, maxBookLimit, name, address, phoneNo);
    }

    @Override
    public String getMember() {
        return "Öğrenci Üye: " + getName() + "(ID: " + getMemberId() +  ")";
    }
}
