package com.programming.chang.youtubeclone.controller;

import com.programming.chang.youtubeclone.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/api/videos", method = RequestMethod.POST)
@RequiredArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void uploadVideo(@RequestParam("file") MultipartFile file){
        videoService.uploadVideo(file);
    }
}
