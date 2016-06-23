package com.l99.chinafootball.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class CacheUtils {
    /**
     * 保存软件参数
     *
     * @param context
     * @param key
     * @param values
     */
    public static void putBoolean(Context context, String key, boolean values) {

        SharedPreferences sp = context.getSharedPreferences("c-football", Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, values).commit();

    }

    /**
     * 得到软件保存的参数
     *
     * @param context
     * @param key
     * @return
     */
    public static boolean getBoolean(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences("c-football", Context.MODE_PRIVATE);
        return sp.getBoolean(key, false);
    }

    /**
     * 保存String类型的数据
     *
     * @param context
     * @param key
     * @param values
     */
    public static void putString(Context context, String key, String values) {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {

            try {
                String fileName = MD5Encoder.encode(key);///lllslllllkll
                ////mnt/sdcard/beijingnews/lllslllllkll
                File file = new File("/mnt/sdcard" + "/Chinafootball", fileName);
                File fileParent = file.getParentFile();////mnt/sdcard/beijingnews/
                if (!fileParent.exists()) {
                    fileParent.mkdirs();
                }

                //创建文件
                if (!file.exists()) {
                    // ////mnt/sdcard/beijingnews/lllslllllkll
                    file.createNewFile();
                }

                FileOutputStream fos = new FileOutputStream(file);
                fos.write(values.getBytes());
                fos.flush();
                fos.close();


            } catch (Exception e) {
                e.printStackTrace();
            }


        } else {
            SharedPreferences sp = context.getSharedPreferences("c-football", Context.MODE_PRIVATE);
            sp.edit().putString(key, values).commit();
        }


    }

    /**
     * 得到缓存数据
     *
     * @param context
     * @param key
     * @return
     */
    public static String getString(Context context, String key) {
        String reuslt = "";
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {

            try {
                String fileName = MD5Encoder.encode(key);///lllslllllkll
                ////mnt/sdcard/beijingnews/lllslllllkll
                File file = new File("/mnt/sdcard" + "/Chinafootball", fileName);


                if (file.exists()) {
                    //读取文件

                    FileInputStream fis = new FileInputStream(file);
                    byte[] buffer = new byte[1024];
                    int length;
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    while ((length = fis.read(buffer)) != -1) {
                        stream.write(buffer, 0, length);
                    }

                    reuslt = stream.toString();
                    fis.close();
                    stream.close();

                }


            } catch (Exception e) {
                e.printStackTrace();
            }


        } else {
            SharedPreferences sp = context.getSharedPreferences("c-football", Context.MODE_PRIVATE);
            reuslt = sp.getString(key, "");

        }

        return reuslt;

    }
}
