package com.brainrot.backend.service;

import com.brainrot.dto.BrainRotTestRequestDTO;
import com.brainrot.dto.BrainRotTestResultDTO;

public interface BrainRotTestService {

    BrainRotTestResultDTO submitTest(BrainRotTestRequestDTO request);
}
