/**
 * HelloWorldServlet.java
 *
 * Copyright (c) 2014 Teamnet. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 **/

package ro.teamnet.z2h.web;

import org.apache.tomcat.util.buf.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Hello World Servlet expose get method to say hello
 * to input user
 */
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // resp.setContentType("text/html");
        //resp.getWriter().write("Hello <b>"+req.getParameter("user")+"</b>");
        // RequestDispatcher requestDispatcher =req.getRequestDispatcher("/helloforward");

        // req.setAttribute("testAttribute", "Enjoy Z2H");

        // requestDispatcher.forward(req, resp);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("This is the Test Servlet");

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = (String) headerNames.nextElement();
            out.print("<br/>Header Name: <em>" + headerName);
            String headerValue = request.getHeader(headerName);
            out.print("</em>, Header Value: <em>" + headerValue);
            out.println("</em>");
        }

        out.println("<hr/>");
        String authHeader = request.getHeader("authorization");
        String encodedValue = authHeader.split(" ")[1];
       /* out.println("Base64-encoded Authorization Value: <em>" + encodedValue);
        String decodedValue = Base64.base64Decode(encodedValue);
        out.println("</em><br/>Base64-decoded Authorization Value: <em>" + decodedValue);
        out.println("</em>");*/
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}
