package study.proxy.staticproxy;

import study.proxy.RealSubject;
import study.proxy.Subject;

public class SubjectStaticFactory {
    public static Subject getInstance() {
        return new ProxySubject(new RealSubject());
    }
}
