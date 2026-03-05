package com.brainrot.backend.modules.meme.service;

@Service
@RequiredArgsConstructor
public class MemeServiceImpl implements MemeService {

    private final MemeRepository memeRepository;

    @Override
    public MemeDTO uploadMeme(MemeDTO dto) {

        Meme meme = Meme.builder()
                .title(dto.getTitle())
                .imageUrl(dto.getImageUrl())
                .likes(0)
                .createdAt(LocalDateTime.now())
                .build();

        memeRepository.save(meme);

        return dto;
    }

    @Override
    public List<MemeDTO> getAllMemes() {

        return memeRepository.findAll()
                .stream()
                .map(m -> new MemeDTO(
                        m.getId(),
                        m.getTitle(),
                        m.getImageUrl(),
                        m.getLikes()))
                .toList();
    }

    @Override
    public MemeDTO likeMeme(Long memeId) {

        Meme meme = memeRepository.findById(memeId)
                .orElseThrow();

        meme.setLikes(meme.getLikes() + 1);

        memeRepository.save(meme);

        return new MemeDTO(
                meme.getId(),
                meme.getTitle(),
                meme.getImageUrl(),
                meme.getLikes());
    }
}
