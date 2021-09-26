package com.lwkandroid.imagepicker.utils;

import android.content.Context;
import androidx.core.content.FileProvider;

/**
 * TODO 自定义FileProvider，适用于缓存地址为external_cache_files_path
 */

public class IPExFilesProvider extends FileProvider
{
    public static String getAuthorities(Context context)
    {
        return new StringBuffer()
                .append(context.getPackageName())
                .append("_ex_f.provider")
                .toString();
    }

}
