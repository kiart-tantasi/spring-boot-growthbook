package net.petchblog.growthbook.services;

import net.petchblog.growthbook.entities.Assignment;
import net.petchblog.growthbook.repositories.AssignmentRepository;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {
  private final AssignmentRepository assignmentRepository;

  public AssignmentService(AssignmentRepository assignmentRepository) {
    this.assignmentRepository = assignmentRepository;
  }

  public void insertAssignment(Assignment assignment) {
    assignmentRepository.save(assignment);
  }
}
