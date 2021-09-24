package com.programming.chang.youtubeclone.repository;

import com.programming.chang.youtubeclone.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {

}
