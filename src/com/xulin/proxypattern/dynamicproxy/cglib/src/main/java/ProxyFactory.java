import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName ProxyFactory
 * @Description
 * @Author xulin
 * @Date 2019/10/25 上午11:14
 **/
public class ProxyFactory implements MethodInterceptor {

    //目标对象
    private Object target;

    //传入目标对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回一个代理对象
    public Object getProxyInstance(){
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();

        //2.设置父类
        enhancer.setSuperclass(target.getClass());

        //3.设置回调函数
        enhancer.setCallback(this);

        //4.创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("---代理开始---");
        Object returnValue = method.invoke(target, args);
        System.out.println("---代理结束---");

        return returnValue;
    }
}
