package cn.dlj1.ec.db.utils;

/**
 * Sql工具类
 *
 */
public class SqlUtils {

    /**
     * 获取insert时的value问号串
     *
     * @return
     */
    public static String getValueMarks(int paramsSize){
        StringBuffer sb = new StringBuffer(paramsSize * 2 - 1);
        for (int i = 0; i < paramsSize; i++) {
            sb.append("?");
            if(i < paramsSize){
                sb.append(",");
            }
        }
        return sb.toString();
    }

}
