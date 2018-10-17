package com.tw.springboot28m.mcourse.events;

import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

@Transactional
public interface GitHubProjectRepository extends PagingAndSortingRepository<GitHubProject, Long> {

    GitHubProject findByRepoName(String repoName);
}
