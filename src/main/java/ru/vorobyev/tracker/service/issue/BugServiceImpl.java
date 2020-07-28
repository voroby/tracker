package ru.vorobyev.tracker.service.issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vorobyev.tracker.domain.issue.Bug;
import ru.vorobyev.tracker.repository.IssueRepository;
import ru.vorobyev.tracker.service.IssueService;

import java.util.List;

@Service
public class BugServiceImpl implements IssueService<Bug> {

    private IssueRepository<Bug> issueRepository;

    @Autowired
    public BugServiceImpl(IssueRepository<Bug> issueRepository) {
        this.issueRepository = issueRepository;
    }

    @Override
    public Bug save(Bug bug) {
        return issueRepository.save(bug);
    }

    @Override
    public boolean delete(int id) {
        return issueRepository.delete(id);
    }

    @Override
    public Bug get(int id) {
        return issueRepository.get(id);
    }

    @Override
    public Bug getByName(String name) {
        return issueRepository.getByName(name);
    }

    @Override
    public List<Bug> getAll() {
        return issueRepository.getAll();
    }
}
