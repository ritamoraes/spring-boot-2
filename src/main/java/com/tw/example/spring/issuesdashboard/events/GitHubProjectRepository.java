package com.tw.example.spring.issuesdashboard.events;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface GitHubProjectRepository extends PagingAndSortingRepository<GithubProject, Long> {

    GithubProject findByRepoName(String repoName);
}
