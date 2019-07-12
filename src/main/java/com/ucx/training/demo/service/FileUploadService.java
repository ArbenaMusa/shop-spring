package com.ucx.training.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileUploadService {

    String Uploaded_Dir = "C:\\Users\\Dell\\Documents\\GitHub\\shop-spring\\src\\main\\java\\com\\ucx\\training\\demo\\uploadedFiles\\";
    public void saveUploadedFile(MultipartFile file) throws IOException{

        byte[] bytes = file.getBytes();

        Path path = Paths.get(Uploaded_Dir + file.getOriginalFilename());
        Files.write(path, bytes);

    }
}
