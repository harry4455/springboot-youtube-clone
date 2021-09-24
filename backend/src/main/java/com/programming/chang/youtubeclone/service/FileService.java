package com.programming.chang.youtubeclone.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    String uploadFile(MultipartFile file);
}
