package ru.vorobyev.tracker.service.issue;

import ru.vorobyev.tracker.domain.issue.Epic;
import ru.vorobyev.tracker.repository.IssueRepository;
import ru.vorobyev.tracker.service.IssueService;

import java.util.List;

public class EpicServiceImpl implements IssueService<Epic> {

    private IssueRepository<Epic> issueRepository;

    public EpicServiceImpl(IssueRepository<Epic> issueRepository) {
        this.issueRepository = issueRepository;
    }

    @Override
    public Epic save(Epic epic) {
        return issueRepository.save(epic);
    }

    @Override
    public boolean delete(int id) {
        return issueRepository.delete(id);
    }

    @Override
    public Epic get(int id) {
        return issueRepository.get(id);
    }

    @Override
    public Epic getByName(String name) {
        return issueRepository.getByName(name);
    }

    @Override
    public List<Epic> getAll() {
        return issueRepository.getAll();
    }
}