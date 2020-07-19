package ru.vorobyev.tracker.repository;

import ru.vorobyev.tracker.domain.project.Backlog;

import java.time.LocalDateTime;

public interface FilterBacklogRepository extends BacklogRepository {
    Backlog getWithIssuesByPrioriTy(int id, String priority);

    Backlog getWithIssuesBetweenDates(int id, LocalDateTime startDate, LocalDateTime endDate);

    Backlog getWithIssuesByName(int id, String name);

    Backlog getWithIssuesByExecutor(int id, int executor_id);

    Backlog getWithIssuesByReporter(int id, int reporter_id);
}
