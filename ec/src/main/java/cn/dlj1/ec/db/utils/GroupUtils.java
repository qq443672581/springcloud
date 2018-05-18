package cn.dlj1.ec.db.utils;

import cn.dlj1.ec.db.component.Group;
import cn.dlj1.ec.db.component.returns.Return;

import java.util.Arrays;

public class GroupUtils {

    public static Group[] add(Group[] srcs, Group... groups) {
        if (null == srcs) {
            srcs = new Group[0];
        }
        if(null == groups || groups.length == 0){
            return srcs;
        }
        int nullSize = 0;
        for (int i = 0; i < groups.length; i++) {
            if(null == groups[i]) nullSize++;
        }
        if(nullSize == groups.length){
            return srcs;
        }
        srcs = Arrays.copyOf(srcs, srcs.length + groups.length - nullSize);
        int index = srcs.length;
        for (int i = 0; i < groups.length; i++) {
            srcs[index++] = groups[i];
        }
        return srcs;
    }

}
