package cn.dlj1.ec.db.utils;

import cn.dlj1.ec.db.component.returns.Return;

import java.util.Arrays;

public class ReturnUtils {

    public static Return[] add(Return[] srcs, Return... returns) {
        if (null == srcs) {
            srcs = new Return[0];
        }
        if(null == returns || returns.length == 0){
            return srcs;
        }
        int nullSize = 0;
        for (int i = 0; i < returns.length; i++) {
            if(null == returns[i]) nullSize++;
        }
        if(nullSize == returns.length){
            return srcs;
        }
        srcs = Arrays.copyOf(srcs, srcs.length + returns.length - nullSize);
        int index = srcs.length;
        for (int i = 0; i < returns.length; i++) {
            srcs[index++] = returns[i];
        }
        return srcs;
    }

}
