package xin.spring.bless.fast.commons.lang.utils;

import org.apache.commons.lang.time.DateUtils;

/**
 * 描述，DateUtil date操作工具
 * 作者： liuchunfu
 * 时间：2020-08-03 16:11
 */
public class DateUtil extends DateUtils {

    public static String format2TimeStr(long start, long end){
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = end - start;
        // 计算差多少天
        long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒//输出结果
        long sec = diff % nd % nh % nm / ns;
        return day + "天" + hour + "小时" + min + "分钟" + sec + "秒";
    }

}
