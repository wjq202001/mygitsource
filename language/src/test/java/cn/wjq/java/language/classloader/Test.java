package cn.wjq.java.language.classloader;

import org.junit.Assert;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

    @org.junit.Test
    public void test2() throws MalformedURLException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        File file = new File("D:\\Git\\libs\\simpleHttp-1.0.0.0.jar");
        URL url = file.toURI().toURL();
        ClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();

        Method addUrlMethod = URLClassLoader.class.getDeclaredMethod("addURL", new Class[]{URL.class});
        addUrlMethod.setAccessible(true);
        addUrlMethod.invoke(classLoader, new Object[]{url});

        Class c1 = Class.forName("simpleHttp.extentions.NoCache");
        Assert.assertNotNull(c1);

        Class c2 = classLoader.loadClass("simpleHttp.extentions.NoCache");
        Assert.assertNotNull(c2);
    }
}
