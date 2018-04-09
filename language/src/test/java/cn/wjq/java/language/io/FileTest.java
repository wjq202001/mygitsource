package cn.wjq.java.language.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

/**
 * Created by Wang Juqiang on 2018/4/2.
 */
public class FileTest {

    @Test
    public void fileTest(){
        File file = new File("D:\\Git\\libs");
        Assert.assertEquals("libs",file.getName());

        Assert.assertEquals("D:\\Git\\libs",file.getAbsolutePath());

        Assert.assertEquals("D:\\Git\\libs",file.getPath());

        Assert.assertTrue(file.isDirectory());

        Assert.assertFalse(file.isFile());

        String[] list = file.list();
    }
}
