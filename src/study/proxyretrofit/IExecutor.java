package study.proxyretrofit;

public interface IExecutor {
    <T> T executor(IRequest request);
}
