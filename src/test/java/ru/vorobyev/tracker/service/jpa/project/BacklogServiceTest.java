package ru.vorobyev.tracker.service.jpa.project;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.vorobyev.tracker.AbstractJpaServiceTest;
import ru.vorobyev.tracker.domain.project.Backlog;
import ru.vorobyev.tracker.service.BacklogService;

import static org.junit.Assert.*;
import static ru.vorobyev.tracker.service.jpa.project.ProjectJpaTestData.BACKLOG1;
import static ru.vorobyev.tracker.service.jpa.project.ProjectJpaTestData.BACKLOG2;

public class BacklogServiceTest extends AbstractJpaServiceTest {

    @Autowired
    private BacklogService backlogService;

    @Test
    public void save() {
        Backlog backlog = backlogService.save(BACKLOG1);

        assertNotNull(backlog.getId());
    }

    @Test
    public void delete() {
        Backlog backlog = backlogService.save(BACKLOG2);

        backlogService.save(backlog);

        assertTrue(backlogService.delete(backlog.getId()));

        assertNull(backlogService.get(backlog.getId()));
    }

    @Test
    public void get() {

    }

    @Test
    public void getAll() {

    }
}