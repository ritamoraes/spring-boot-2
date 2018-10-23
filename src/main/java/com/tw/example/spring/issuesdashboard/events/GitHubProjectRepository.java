package com.tw.example.spring.issuesdashboard.events;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface GitHubProjectRepository extends PagingAndSortingRepository<GitHubProject, Long> {

    GitHubProject findByRepoName(String repoName);
}
