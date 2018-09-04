package study.proxyretrofit;

public class User {
    public String username;
    public String uId;
    public String sex;
    public String address;

    public User(String username, String uId, String sex, String address) {
        this.username = username;
        this.uId = uId;
        this.sex = sex;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", uId='" + uId + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
