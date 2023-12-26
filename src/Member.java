public class Member {

    private  String name ;
    private String address ;
    private String pNO ;
    private String email ;

     public Member(){

     }
    public Member(String name, String address, String pNO, String email) {
        this.name = name;
        this.address = address;
        this.pNO = pNO;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getpNO() {
        return pNO;
    }

    public void setpNO(String pNO) {
        this.pNO = pNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", pNO='" + pNO + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
