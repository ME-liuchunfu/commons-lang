package xin.spring.bless.fast.commons.lang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SFL4JTest {

    static final Logger logger = LoggerFactory.getLogger(SFL4JTest.class);


    public static void main(String[] args) {
        int i=0;
        while (i<100) {
            logger.info("当前：{}", i);
            i++;
        }
    }

}
