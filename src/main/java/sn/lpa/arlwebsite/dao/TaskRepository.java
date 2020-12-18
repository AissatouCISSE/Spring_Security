package sn.lpa.arlwebsite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.lpa.arlwebsite.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
