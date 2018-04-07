package cn.dlj1.ec.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 基础过滤器
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public class BaseFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
            throws IOException, ServletException {
        chain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void destroy() {

    }
}
