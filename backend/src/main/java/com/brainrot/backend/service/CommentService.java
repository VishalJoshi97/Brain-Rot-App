public interface CommentService {

    CommentDTO createComment(CommentDTO dto);

    List<CommentDTO> getComments(Long memeId);

}
