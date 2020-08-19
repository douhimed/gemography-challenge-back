package org.adex.challengegemograohyback.repositories;

import org.adex.challengegemograohyback.models.Repo;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private static List<Repo> repos;

    public static List<Repo> getRepos() {
        return new ArrayList<>(repos);
    }

    public static void setRepos(List<Repo> repos) {
        DB.repos = repos;
    }
}
