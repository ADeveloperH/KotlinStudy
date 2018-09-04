package study.proxyretrofit;

public class Client {
    public static void main(String[] args) {
        LoginApi loginApi = ApiGenerator.generateApi(LoginApi.class);
        User user = loginApi.login("123", "3534");
        System.out.println("login result:" + user.toString());
    }
}
