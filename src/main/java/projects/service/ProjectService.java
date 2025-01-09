package projects.service;

import java.util.List;
import java.util.NoSuchElementException;


import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {

	private static ProjectDao projectDao = new ProjectDao();

	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}

	public static Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(
				() -> new NoSuchElementException("Project with project Id=" + projectId + " does not exist"));
	}

}
