package org.cybergarage.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class Database {
    private Connection con;
    private ResultSet rs;
    private Statement stmt;

    private Connection getConnection() {
    }

    private ResultSet getResultSet() {
    }

    private Statement getStatement() {
    }

    private void setResultSet(ResultSet resultSet) {
    }

    private void setStatement(Statement statement) {
    }

    public void close() {
    }

    public boolean fetch() {
    }

    public long getDate(String str) {
    }

    public int getInteger(String str) {
    }

    public long getLong(String str) {
    }

    public String getString(String str) {
    }

    public long getTimestamp(String str) {
    }

    public abstract boolean open(String str, String str2, String str3, String str4);

    public boolean query(String str) {
    }

    protected void setConnection(Connection connection) {
    }

    public int update(String str) {
    }

    public int getInteger(int i) {
    }

    public long getLong(int i) {
    }

    public long getDate(int i) {
    }

    public String getString(int i) {
    }

    public long getTimestamp(int i) {
    }
}
