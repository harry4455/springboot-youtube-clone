package com.programming.chang.youtubeclone.service;

import com.programming.chang.youtubeclone.model.Video;
import com.programming.chang.youtubeclone.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final S3Service s3Service;
    private final VideoRepository videoRepository;

    public void uploadVideo(MultipartFile multipartFile) {
        // upload file to AWS S3
        // Save Video data to Database

        String videoUrl = s3Service.uploadFile(multipartFile);
        var video = new Video();
        video.setVideoUrl(videoUrl);

        videoRepository.save(video);
    }
}
