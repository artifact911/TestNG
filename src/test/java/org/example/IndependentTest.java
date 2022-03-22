package org.example;

import org.testng.annotations.Test;

public class IndependentTest {

    @Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
    public void testMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Test method executing on thread with id: " + id);
    }

    /*Тестовый метод сконфигурирован для запуска в многопоточном режиме
    с помощью атрибута threadPoolSize аннотации Test.
    Значение threadPoolSize равно 3, это означает что тестовый метод
    будет выполняться в трех разных потоках Остальные два атрибута invocationCount
    и timeOut указывают тесту выполняться множество раз (6) и помечаться проваленными
    если их выполнение займет больше определенного времени (1000 ms)*/
}
