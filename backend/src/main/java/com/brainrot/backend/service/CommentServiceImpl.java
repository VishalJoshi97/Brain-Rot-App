@Service
@RequiredArgsConstructor
public class CommentServiceImpl
        implements CommentService {

    private final CommentRepository commentRepository;

    @Override
    public CommentDTO createComment(CommentDTO dto) {

        Comment comment = Comment.builder()
                .memeId(dto.getMemeId())
                .userId(dto.getUserId())
                .text(dto.getText())
                .createdAt(LocalDateTime.now())
                .build();

        commentRepository.save(comment);

        return dto;
    }

    @Override
    public List<CommentDTO> getComments(Long memeId) {

        return commentRepository
                .findByMemeId(memeId)
                .stream()
                .map(c -> new CommentDTO(
                        c.getId(),
                        c.getMemeId(),
                        c.getUserId(),
                        c.getText()))
                .toList();
    }
}
