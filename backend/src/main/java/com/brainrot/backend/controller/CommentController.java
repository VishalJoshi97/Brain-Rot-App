@RestController
@RequestMapping("/api/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public CommentDTO createComment(
            @RequestBody CommentDTO dto
    ) {

        return commentService.createComment(dto);

    }

    @GetMapping("/{memeId}")
    public List<CommentDTO> getComments(
            @PathVariable Long memeId
    ) {

        return commentService.getComments(memeId);

    }

}
