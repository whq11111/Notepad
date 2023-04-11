package com.itcast.notepad.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DBUtils {
    public static final String DATABASE_NAME = "Notepad.db";
    public static final String DATABASE_TABLE = "Note";
    public static final int DATABASE_VERION = 1;
    public static final String NOTEPAD_ID = "id";
    public static final String NOTEPAD_CONTENT = "content";
    public static final String NOTEPAD_TIME = "notetime";
    public static final String getTime(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年 MM 月 dd 日 HH : mm :ss");
        Date date=new Date(System.currentTimeMillis());
        return simpleDateFormat.format(date);
    }
}
