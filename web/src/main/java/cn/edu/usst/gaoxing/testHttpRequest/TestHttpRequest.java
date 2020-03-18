package cn.edu.usst.gaoxing.testHttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

/*
 *@ClassName TestHttpRequest
 *@Author GaoXilong
 *@Date 2019/11/27 17:39
 */
@RestController
@RequestMapping("/testHttpRequest")
public class TestHttpRequest {

    @PostMapping("/test")
    public String test(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,String name) throws IOException {
        Enumeration<String> headers=httpServletRequest.getHeaderNames();
        StringBuilder stringBuilder=new StringBuilder();
        while (headers.hasMoreElements()){
            stringBuilder.append(headers.nextElement());
        }
        String res=stringBuilder.toString();
        OutputStream outputStream=httpServletResponse.getOutputStream();
        outputStream.write(res.getBytes());
        return stringBuilder.toString();
    }
}
