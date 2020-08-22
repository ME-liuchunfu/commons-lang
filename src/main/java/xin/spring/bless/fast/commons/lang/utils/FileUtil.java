package xin.spring.bless.fast.commons.lang.utils;

import org.apache.commons.io.FileUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 描述，FileUtil 文件操作工具
 * 作者： liuchunfu
 * 时间：2020-08-03 16:11
 */
public class FileUtil extends FileUtils {

    /**
     * 方法描述：InputStream转化为byte[]数组
     * @param input
     * @throws IOException
     */
    public static byte[] toByteArray(InputStream input) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[40960];
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
        }
        return output.toByteArray();
    }

}
