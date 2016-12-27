package com.example.jihuiquan.mockitodemo;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jihuiquan on 2016/12/26.
 */

public class CalculatorTest {

//
//    private View view;
//    private Repository repository;
//    private PresenterImpl mCalculator;
    private List<String> mockedList;

    @Before
    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
        mockedList = mock(List.class);

    }
    @Test
    public void getOrderList() throws Exception{


        //stubbing using built-in anyInt() argument matcher
        // 使用内置的anyInt()参数匹配器
        when(mockedList.get(anyInt())).thenReturn("element");

        //stubbing using custom matcher (let's say isValid() returns your own matcher implementation):
        // 使用自定义的参数匹配器( 在isValid()函数中返回你自己的匹配器实现 )
//        when(mockedList.contains(argThat(isValid()))).thenReturn("element");

        //following prints "element"
        // 输出element
        System.out.println(mockedList.get(999));

        //you can also verify using an argument matcher
        // 你也可以验证参数匹配器
        verify(mockedList).get(anyInt());
        //stubbing using built-in anyInt() argument matcher
        // 使用内置的anyInt()参数匹配器
//        when(mockedLis.get(anyInt())).thenReturn("element");
//
//        //stubbing using custom matcher (let's say isValid() returns your own matcher implementation):
//        // 使用自定义的参数匹配器( 在isValid()函数中返回你自己的匹配器实现 )
////        when(mockedList.contains(argThat(isValid()))).thenReturn("element");
//
//        //following prints "element"
//        // 输出element
//        System.out.println(mockedLis.get(999)+"--------");
//
//        //you can also verify using an argument matcher
//        // 你也可以验证参数匹配器
//        verify(mockedLis).get(anyInt());
//        //using mock
//        mockedList.add("once");
//
//        mockedList.add("twice");
//        mockedList.add("twice");
//
//        mockedList.add("three times");
//        mockedList.add("three times");
//        mockedList.add("three times");
//
//        //following two verifications work exactly the same - times(1) is used by default
//        // 下面的两个验证函数效果一样,因为verify默认验证的就是times(1)
//        verify(mockedList).add("once");
//        verify(mockedList, times(1)).add("once");
//
//        //exact number of invocations verification
//        // 验证具体的执行次数
//        verify(mockedList, times(2)).add("twice");
//        verify(mockedList, times(3)).add("three times");
//
//        //verification using never(). never() is an alias to times(0)
//        // 使用never()进行验证,never相当于times(0)
//        verify(mockedList, never()).add("never happened");
//
//        //verification using atLeast()/atMost()
//        // 使用atLeast()/atMost()
//        verify(mockedList, atLeastOnce()).add("three times");
////        verify(mockedList, atLeast(2)).add("five times");
////        verify(mockedList, atMost(5)).add("three times");
//        List mockedList = mock(List.class);
//
//        //using mock object 使用mock对象
//        mockedList.add("one");
//        mockedList.clear();
//
//        //verification 验证
//        verify(mockedList).add("one");
//        verify(mockedList).clear();
//        LinkedList mockedList = mock(LinkedList.class);
//
//        //stubbing
//        // 测试桩
//        when(mockedList.get(0)).thenReturn("first");
//        when(mockedList.get(1)).thenThrow(new RuntimeException());
//
//        //following prints "first"
//        // 输出“first”
//        System.out.println(mockedList.get(0));
//
//        //following throws runtime exception
//        // 抛出异常
////        System.out.println(mockedList.get(1));
//
//        //following prints "null" because get(999) was not stubbed
//        // 因为get(999) 没有打桩，因此输出null
//        System.out.println(mockedList.get(999));
//
//        //Although it is possible to verify a stubbed invocation, usually it's just redundant
//        //If your code cares what get(0) returns then something else breaks (often before even verify() gets executed).
//        //If your code doesn't care what get(0) returns then it should not be stubbed. Not convinced? See here.
//        // 验证get(0)被调用的次数
//        verify(mockedList).get(0);


    }
}
