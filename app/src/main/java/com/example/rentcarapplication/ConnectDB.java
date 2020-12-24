package com.example.rentcarapplication;

import com.adedom.library.Dru;

import java.sql.Connection;

public class ConnectDB {

    public static Connection getConnection() {
        return Dru.connection("eu-cdbr-west-03.cleardb.net", "b2158ce27c3d94", "4d285819", "heroku_0d3a793228ba934");
    }
//            String url = "jdbc:mysql://b2158ce27c3d94:4d285819@eu-cdbr-west-03.cleardb.net/heroku_0d3a793228ba934?reconnect=true";

}
