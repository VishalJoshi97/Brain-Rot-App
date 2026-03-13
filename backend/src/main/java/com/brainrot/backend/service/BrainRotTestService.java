package com.brainrot.backend.service;

import com.brainrot.backend.dto.BrainRotTestRequestDTO;
import com.brainrot.backend.dto.BrainRotTestResultDTO;

public interface BrainRotTestService {

    BrainRotTestResultDTO submitTest(BrainRotTestRequestDTO request);
}
