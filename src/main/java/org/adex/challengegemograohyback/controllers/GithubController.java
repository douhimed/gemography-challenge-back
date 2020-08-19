package org.adex.challengegemograohyback.controllers;

import org.adex.challengegemograohyback.models.LanguageDto;
import org.adex.challengegemograohyback.models.Repo;
import org.adex.challengegemograohyback.models.RepoDto;
import org.adex.challengegemograohyback.services.GithubServices;
import org.adex.challengegemograohyback.utilities.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GithubController {

    private final GithubServices githubServices;

    public GithubController(GithubServices githubServices) {
        this.githubServices = githubServices;
    }

    @GetMapping("/repos")
    public ResponseEntity<?> findGitHubRepositories(){
        return new ResponseEntity<List<Repo>>(this.githubServices.getAllRepositories(), HttpStatus.OK);
    }

    @GetMapping("/languages")
    public ResponseEntity<?> findGitHubRepositoriesOrderByLanguages(){
        return new ResponseEntity<>(this.githubServices.getAllRepositoriesGoupedByLanguages(), HttpStatus.OK);
    }


}
