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


    //must do Models to dto type conversion
    private ProfileDTO mapToDTO(Profile profile){
        return ProfileDTO.builder()
                .id(profile.getId())
                .bio(profile.getBio())
                .profilePictureUrl(profile.getProfilePictureUrl())
                .totalScore(profile.getTotalScore())
                .userId(profile.getUser().getId())
                .build();
    }


    //#1
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


    //#2
    @Override
    public ProfileDTO getProfileByUserId(Long userId) {

        Profile profile=profileRepository.findByUserId(userId)
                .orElseThrow(()->new RuntimeException("Profile not Found!"));
        return mapToDTO(profile);
    }

    @Override
    public ProfileDTO updateProfile(Long userId, ProfileDTO profileDTO) {
        return null;
    }
}
