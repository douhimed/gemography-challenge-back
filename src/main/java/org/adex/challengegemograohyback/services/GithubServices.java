package org.adex.challengegemograohyback.services;

import org.adex.challengegemograohyback.models.LanguageDto;
import org.adex.challengegemograohyback.models.Repo;

import java.util.List;

public interface GithubServices {

    List<Repo> getAllRepositories();

    List<LanguageDto> getAllRepositoriesGoupedByLanguages();

}
