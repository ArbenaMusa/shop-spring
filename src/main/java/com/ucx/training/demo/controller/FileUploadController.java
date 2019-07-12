package com.ucx.training.demo.controller;

import com.ucx.training.demo.entity.FileEntity;
import com.ucx.training.demo.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;

@Controller
@RequestMapping("upload")
public class FileUploadController extends BaseController<FileEntity,Integer> {

    @Autowired
     private FileUploadService fileUploadService;

    @PostMapping("/upload-multiple-files")
    @ResponseBody
    public void uploadMultipleFiles(@RequestParam("files") MultipartFile[] files)  {
        Arrays.asList(files).forEach(file -> {
            try{
                fileUploadService.saveUploadedFile(file);
            }catch (IOException ex){
                ex.printStackTrace();
            }
        });
    }
}
