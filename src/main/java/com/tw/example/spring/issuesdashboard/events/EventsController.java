package com.tw.example.spring.issuesdashboard.events;

import com.tw.example.spring.issuesdashboard.github.GitHubClient;
import com.tw.example.spring.issuesdashboard.github.RepositoryEvent;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventsController {

    public final GitHubClient gitHubClient;
    public final GitHubProjectRepository repository;

    public EventsController(GitHubClient gitHubClient, GitHubProjectRepository repository) {
        this.gitHubClient = gitHubClient;
        this.repository = repository;
    }

    @GetMapping("/events/{projectName}")
    @ResponseBody
    public ResponseEntity<RepositoryEvent[]> fetchEvents (@PathVariable String projectName){
        GithubProject project = this.repository.findByRepoName(projectName);
       return this.gitHubClient.fetchEvents(project.getOrgName(),project.getRepoName());
    }

}
