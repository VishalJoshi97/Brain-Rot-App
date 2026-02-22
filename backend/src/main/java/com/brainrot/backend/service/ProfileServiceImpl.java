package com.brainrot.backend.service;

import com.brainrot.backend.dto.ProfileDTO;
import com.brainrot.backend.dto.UserDTO;
import com.brainrot.backend.model.Profile;
import com.brainrot.backend.model.User;
import com.brainrot.backend.repository.ProfileRepository;
import com.brainrot.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService{
    //import repositories
    private final ProfileRepository profileRepository;
    private final UserRepository userRepository;


    private ProfileDTO mapToDTO(Profile profile){
        return ProfileDTO.builder()
                .id(profile.getId())
                .bio(profile.getBio())
                .profilePictureUrl(profile.getProfilePictureUrl())
                .totalScore(profile.getTotalScore())
                .userId(profile.getUser().getId())
                .build();
    }



    @Override
    public ProfileDTO createProfile(ProfileDTO dto) {
        //setter
        User user=userRepository.findById(dto.getId())
                .orElseThrow(()-> new RuntimeException("User not found"));

        Profile profile=Profile.builder()
                .bio(dto.getBio())
                .profilePictureUrl(dto.getProfilePictureUrl())
                .totalScore(dto.getTotalScore())
                .user(user)
                .build();

        //save
        profile=profileRepository.save(profile);

        //getter
        return new ProfileDTO(profile.getId(), profile.getBio(), profile.getProfilePictureUrl(), profile.getTotalScore(),
                profile.getUser().getId());
    }

    @Override
    public ProfileDTO getProfileByUserId(Long userId) {
        return null;
    }

    @Override
    public ProfileDTO updateProfile(Long userId, ProfileDTO profileDTO) {
        return null;
    }
}
