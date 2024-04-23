package ClubManagement;

public class Members {
    private int ID;
    private char memberType;
    private String name;
    private Double Fees;

    public Members(int ID, char memberType, String name, Double Fees){}

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        ID = id;
    }

    public char getMemberType() {
        return memberType;
    }

    public void setMemberType(char memberType) {
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFees() {
        return Fees;
    }

    public void setFees(Double fees) {
        Fees = fees;
    }

    @Override
    public String toString(){
        return "The member is:" + ID + name + memberType;
    }
}