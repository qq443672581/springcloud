package cn.dlj1.boot.spring.plugin;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.Map;

/**
 * 自定义视图解析器
 */
@Component
@Order(10)
public class AttachmentView implements View{

    public static final String name = "attachmentView";

    @Override
    public String getContentType() {
        return "application/attachment";
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        httpServletResponse.setHeader("content-disposition",	"attachment;filename=" + URLEncoder.encode(httpServletRequest.getAttribute("fileName").toString(), "UTF-8"));
        IOUtils.write(httpServletRequest.getAttribute("content").toString(),httpServletResponse.getOutputStream(),"UTF-8");
    }

}
