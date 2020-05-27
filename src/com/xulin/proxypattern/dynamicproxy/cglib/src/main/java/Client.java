/**
 * @ClassName Client
 * @Description
 * @Author xulin
 * @Date 2019/10/25 上午11:20
 **/
public class Client {
    public static void main(String[] args) {

        TeacherDao proxy = (TeacherDao) new ProxyFactory(
                new TeacherDao()).getProxyInstance();

        System.out.println("---代理模式：CGLIB动态代理---");

        /**
         * 执行代理对象的方法，触发intercept方法,从而实现对目标对象的调用
         */
        proxy.teach();

        System.out.println(proxy.SayHello());
    }
}
