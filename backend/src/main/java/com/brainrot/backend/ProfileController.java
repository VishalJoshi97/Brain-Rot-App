package com.brainrot.controller;

import com.brainrot.dto.ProfileDTO;
import com.brainrot.service.ProfileService;
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
}
