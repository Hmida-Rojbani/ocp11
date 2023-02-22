package com.welcome;


import com.welcome.test.Cls2;

import java.util.*;
import java.util.Date;
import java.sql.*;


public class Test {
    private Cls t ;
    private Cls2 t2;
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.getClass().getName());
        System.out.println(t.getClass().getSimpleName());
        Random r;
        Date dUtil;
        java.sql.Date dsql = new java.sql.Date(2023,11,1);
        Connection c;

    }
}
