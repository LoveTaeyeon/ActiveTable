package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class TableServlet
 */
public class TableServlet implements Servlet {

    public TableServlet() {
    }	

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String type = request.getParameter("type");
        if(type.equals("initTable")){
        	User user = new User();
    		user.setTable("陈,长,阳");
    		List<User> users = new ArrayList<User>();
    		users.add(user);
    		String jsonData = JSONArray.fromObject(users).toString();
    		out.write(jsonData);
    		out.close();
        }else{
        	try {
        		String jsonData = request.getParameter("jsonData");
            	System.out.println(jsonData);
            	out.write(jsonData);
            	out.close();
			} catch (Exception e) {
				out.write("失败！");
				out.close();
			}
        	
        }
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
