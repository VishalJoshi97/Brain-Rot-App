package com.brainrot.backend.modules.meme.controller;

@RestController
@RequestMapping("/api/memes")
@RequiredArgsConstructor
public class MemeController {

    private final MemeService memeService;

    @PostMapping("/upload")
    public MemeDTO uploadMeme(@RequestBody MemeDTO dto) {
        return memeService.uploadMeme(dto);
    }

    @GetMapping
    public List<MemeDTO> getMemes() {
        return memeService.getAllMemes();
    }

    @PostMapping("/{id}/like")
    public MemeDTO likeMeme(@PathVariable Long id) {
        return memeService.likeMeme(id);
    }

    @GetMapping
    public Page<MemeDTO> getMemes(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size
    ) {

    return memeService.getMemes(page, size);
    }
}
