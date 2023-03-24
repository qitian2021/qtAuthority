package com.qitian.qtauthority.util.filter;

import com.qitian.qtauthority.util.wrapper.XssRequestWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author qitianyb
 * @Create by  StayHungry
 * @Date 2023/3/22 9:08 下午
 * @Description
 *
 *   过滤所有提交到服务器的请求参数
 *
 */
/**
 * 注意：通过下面的过滤器可以发现我们并没有在过滤器中直接进行请求参数的过滤清理，而是直接放行了，
 * 那么我们还怎么进行请求参数的过滤清理呢？其实过滤清理的工作是在另外一个类XssRequestWrapper中进行的，
 * 当下面的过滤器放行时需要调用filterChain.doFilter()方法，此方法需要传入请求Request对象，
 * 此时我们可以将当前的request对象进行包装，
 * 而XssRequestWrapper就是Request对象的包装类，
 * 在过滤器放行时会自动调用包装类的getParameterValues方法，
 * 我们可以在包装类的getParameterValues方法中进行统一的请求参数过滤清理。
 *
 * */

public class XssFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        //传入重写后的Request
        filterChain.doFilter(new XssRequestWrapper(request),servletResponse);

    }
}
