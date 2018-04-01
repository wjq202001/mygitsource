package cn.wjq.java.language.colllect;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.*;



/**
 * Created by sks on 2018/1/15.
 */
public class StreamTest {
    // create a stream
    @Test
    public void CreateStream_with_static_of(){

        // of 静态方法String.of
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        // genarate静态方法：Stream.generate,产生一个无限长度的stream
        Stream stream2 = Stream.generate(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 0;
            }
        });
        Stream.generate(()->0); // 简写方式
        Stream.generate(Math::random);//

        // 使用limit做限制
//        stream2.limit(100).reduce(0,(item1,item2)->{
//           System.out.println(item1);
//            return item1;
//        });

        String result = stream.reduce("结果：",(item1,item2)->item1+item2).toString();
        Assert.assertEquals("结果：1234",result);

        // collection to stream
        List<String> ls = new ArrayList<>();
        ls.add("1");
        ls.add("2");
        ls.add("5");
        ls.add("4");
        //Stream stream3 = ls.stream();
        List<Integer> ls1 = toList(ls,Integer::parseInt);

        Map<Integer,Integer> mp = toMap(ls,e->Integer.parseInt(e.toString()),e->Integer.parseInt(e.toString()));

        Assert.assertEquals(ls1.get(0).intValue(),1);
    }

    private <T,R> List<R> toList(List<T> in,Function<T,R> fun){
        return in.stream().map(e->{
            return fun.apply(e);
        }).collect(Collectors.toList());
    }

    private <T, K, U> Map<K,U> toMap(List<T> in, Function<T,K> keySelector,Function<T,U> valueSelector){
        return  in.stream().collect(Collectors.toMap(keySelector,valueSelector));
    }
}
