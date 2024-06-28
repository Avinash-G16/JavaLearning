package com.avinash;
import java.util.Collection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.IOException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/upload")
@MultipartConfig
public class FileUpload extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		Collection<Part> multiFiles = request.getParts();
		
		for(Part part:multiFiles)
		{
			part.write("C:\\Users\\AGL\\Avinash\\Eclipse\\" + part.getName());
		}
		
		System.out.println("File uploaded");
	}

}
