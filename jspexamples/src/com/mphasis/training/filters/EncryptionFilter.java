package com.mphasis.training.filters;

import java.io.IOException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class EncryptionFilter
 */
@WebFilter("/ResponseServlet")
public class EncryptionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public EncryptionFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req=(HttpServletRequest)request;
		String s=req.getParameter("strings");
		if(s!=null) {
			try {
			//Secret key
			KeyGenerator keyGenerator=KeyGenerator.getInstance("DESede");
			SecretKey scretKey=keyGenerator.generateKey();
			//Cipher Object
			Cipher cipher=Cipher.getInstance("DESede");
			//encryption 
			cipher.init(Cipher.ENCRYPT_MODE, scretKey);
			byte[] encrypted=cipher.doFinal(s.getBytes());
			//decryption
			cipher.init(Cipher.DECRYPT_MODE, scretKey);
			byte[] decrypted=cipher.doFinal(encrypted);
			//set the values to requestscope
			request.setAttribute("encrypted", new String(encrypted));
			request.setAttribute("decrypted", new String(decrypted));
			request.getRequestDispatcher("ResponseServlet")
			.forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
