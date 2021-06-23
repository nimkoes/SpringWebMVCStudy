package me.nimkoes.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("MyServlet init !!!");
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
     * HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

        MyHelloService myHelloService = context.getBean(MyHelloService.class);

        System.out.println("MyServlet doGet called !!! >> " + myHelloService.getName());

        // req.getRequestDispatcher("/WEB-INF/view/MyHello.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("MyServlet destroy !!!");
    }

}
