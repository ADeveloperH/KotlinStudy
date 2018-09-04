package study.proxyretrofit;

import java.util.Map;

public class Request implements IRequest {
    private String url;
    private Map<String, Object> params;
    private Class<?> responseCls;

    public Request(String url, Map<String, Object> params, Class<?> responseCls) {
        this.url = url;
        this.params = params;
        this.responseCls = responseCls;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public Map<String, Object> getParams() {
        return params;
    }

    @Override
    public Class<?> getResponseCls() {
        return responseCls;
    }
}
