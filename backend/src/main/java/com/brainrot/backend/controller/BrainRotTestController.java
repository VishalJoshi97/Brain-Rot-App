package com.brainrot.backend.controller;

import com.brainrot.backend.dto.BrainRotTestRequestDTO;
import com.brainrot.backend.dto.BrainRotTestResultDTO;
import com.brainrot.backend.service.BrainRotTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
