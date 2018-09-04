package study.proxyretrofit;

import java.util.Map;

public interface IRequest {

    String getUrl();

    Map<String, Object> getParams();

    Class<?> getResponseCls();
}
