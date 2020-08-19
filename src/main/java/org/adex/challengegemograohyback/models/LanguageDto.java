package org.adex.challengegemograohyback.models;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LanguageDto {

    private long numberRepos;
    private String label;
    private List<RepoDto> repos = new ArrayList<>();


    public LanguageDto(String label) {
        this.label = label;
    }

    public boolean addRepo(RepoDto repo) {
        numberRepos++;
        return this.repos.add(repo);
    }
}
