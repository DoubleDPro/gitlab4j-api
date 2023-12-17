package org.gitlab4j.api.models;

import org.gitlab4j.api.GitLabApiForm;

public class CiCdConfParams {

    private String content;
    private Boolean dryRun;
    private Boolean includeJobs;
    private String ref;

    public CiCdConfParams withContent(String content) {
        this.content = content;
        return this;
    }

    public CiCdConfParams withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    private CiCdConfParams withIncludeJobs(Boolean includeJobs) {
        this.includeJobs = includeJobs;
        return this;
    }

    private CiCdConfParams withRef(String ref) {
        this.ref = ref;
        return this;
    }

    public GitLabApiForm getForm() {
        return new GitLabApiForm()
            .withParam("content", content, true)
            .withParam("dry_run", dryRun)
            .withParam("include_jobs", includeJobs)
            .withParam("ref", ref);
    }


}
