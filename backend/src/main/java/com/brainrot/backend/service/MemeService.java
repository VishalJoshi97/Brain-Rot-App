package com.brainrot.backend.modules.meme.service;

import com.brainrot.modules.meme.dto.MemeDTO;

import java.util.List;

public interface MemeService {

    MemeDTO uploadMeme(MemeDTO memeDTO);

    List<MemeDTO> getAllMemes();

    MemeDTO likeMeme(Long memeId);

    Page<MemeDTO> getMemes(int page, int size);

}
