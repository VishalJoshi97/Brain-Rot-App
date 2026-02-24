package com.brainrot.backend.controller;

import com.brainrot.backend.dto.ProfileDTO;
import com.brainrot.backend.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
@RequiredArgsConstructor
public class ProfileController {
  private final ProfileService profileService;

    @PostMapping
    public ProfileDTO createProfile(@RequestBody ProfileDTO dto) {
        return profileService.createProfile(dto);
    }
  @GetMapping("/{userId}")
    public ProfileDTO getProfile(@PathVariable Long userId) {
        return profileService.getProfileByUserId(userId);
    }
  @PutMapping("/{userId}")
    public ProfileDTO updateProfile(
            @PathVariable Long userId,
            @RequestBody ProfileDTO dto) {

        return profileService.updateProfile(userId, dto);
    }
}
