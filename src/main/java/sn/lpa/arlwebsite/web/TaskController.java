package sn.lpa.arlwebsite.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import sn.lpa.arlwebsite.dao.TaskRepository;
import sn.lpa.arlwebsite.entities.Task;

@Controller
public class TaskController {
	@Autowired
	private TaskRepository taskRepository;
	

	@GetMapping("/tasks")
    @ResponseBody
    public List<Task>  getAllTasks(){
        return taskRepository.findAll();
    }
	
	 	@PostMapping("/tasks")
	    @ResponseBody
	    public Task save(@RequestBody Task task) {
	        return taskRepository.save(task);
	    }
}
