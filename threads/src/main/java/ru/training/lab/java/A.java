package ru.training.lab.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.experimental.Accessors;
import lombok.extern.log4j.Log4j2;
import lombok.val;

import java.util.Date;

@AllArgsConstructor
@Accessors(chain = true)
@Data
@Log4j2
public class A {
    private long aLong;
    private Date date;

    @SneakyThrows
    public static void main(String[] args) {
        val a = new A(1l, null);
        Class.forName("java.lang.String");
        log.error("kjhdgkjhrgqd");
    }
}
