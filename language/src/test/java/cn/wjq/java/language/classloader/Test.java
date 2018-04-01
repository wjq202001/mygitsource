package cn.wjq.java.language.classloader;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by Wang Juqiang on 2018/4/1.
 */
public class Test {

    @org.junit.Test
    public void test1() throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        File file = new File("D:\\Git\\libs\\simpleHttp-1.0.0.0.jar");
        URL url = file.toURI().toURL();
        URLClassLoader classLoader = new URLClassLoader(new URL[]{url});
        Class c = classLoader.loadClass("simpleHttp.extentions.NoCache");
        Class[] pTypes = new Class[0];
        Constructor constr = c.getDeclaredConstructor(pTypes);
        Object obj = constr.newInstance(new Object[0]);

    }
}
