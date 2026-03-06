package com.brainrot.backend.modules.meme.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageUploadService {

    String uploadImage(MultipartFile file);

}
