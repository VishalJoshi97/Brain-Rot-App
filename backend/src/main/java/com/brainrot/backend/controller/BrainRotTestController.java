@RestController
@RequestMapping("/api/brainrot-test")
@RequiredArgsConstructor
public class BrainRotTestController {

    private final BrainRotTestService testService;

    @PostMapping("/submit")
    public BrainRotTestResultDTO submitTest(
            @RequestBody BrainRotTestRequestDTO request) {

        return testService.submitTest(request);
    }
}
