package com.muzeaback.back.Controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FileController {
    public  static String uploadDirectory = System.getProperty("user.dir")+"/Files";
    ServletContext servletContext;
    @RequestMapping("/")
    public String UploadPage(Model model){
        return "uploadview";
    }
    @RequestMapping(value = "/upload", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String upload( @RequestParam("file") MultipartFile files){
        System.out.println(files.getName());
        StringBuilder fileNames = new StringBuilder();
            Path fileNameAndPath = Paths.get(uploadDirectory,files.getOriginalFilename());
            fileNames.append(files.getOriginalFilename());
            try {
                Files.write(fileNameAndPath, files.getBytes());
            }catch (IOException e){
                e.printStackTrace();
            }

        return "uploadstatusview";
    }
    @RequestMapping(value = "/image-manual-response", method = RequestMethod.GET)
    public void getImageAsByteArray(HttpServletResponse response) throws IOException {
        InputStream in = servletContext.getResourceAsStream("/WEB-INF/image-example.jpg");
        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        IOUtils.copy(in, response.getOutputStream());
}
}
