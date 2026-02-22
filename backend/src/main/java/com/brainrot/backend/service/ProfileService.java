package com.brainrot.backend.service;

import com.brainrot.backend.dto.ProfileDTO;

public interface ProfileService {
    ProfileDTO createProfile(ProfileDTO profileDTO);
    ProfileDTO getProfileByUserId(Long userId);
    ProfileDTO updateProfile(Long userId,ProfileDTO profileDTO);
}
