package org.adex.challengegemograohyback.utilities;

import org.adex.challengegemograohyback.models.Repo;
import org.adex.challengegemograohyback.models.RepoDto;

import java.util.ArrayList;

import java.util.List;

public class Mappers {


    public static List<RepoDto> toListReposDto(List<Repo> repos) {
        List<RepoDto> repoDtos = new ArrayList<>();
        repos.forEach(repo -> repoDtos.add(toRepoDto(repo)));
        return repoDtos;
    }

    public static RepoDto toRepoDto(Repo repo){
        return RepoDto.builder().name(repo.getName()).url(repo.getUrl()).id(repo.getId()).build();
    }
}
