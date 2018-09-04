package study.proxyretrofit;


@Url("http://test/login")
public interface LoginApi {
    User login(@Param("username") String username, @Param("password") String password);
}
