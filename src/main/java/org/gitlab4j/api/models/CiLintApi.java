package org.gitlab4j.api.models;

import javax.ws.rs.core.Response;
import org.gitlab4j.api.AbstractApi;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;

/**
 * This class implements the client side API for the Gitlab CI Lint API calls.
 *
 * @see <a href="https://docs.gitlab.com/ee/api/lint.html">CI Lint API</a>
 */
public class CiLintApi extends AbstractApi {

    public CiLintApi(GitLabApi gitLabApi) {
        super(gitLabApi);
    }

    public CiCdConfValidation validateCiCdConfiguration(Object projectIdOrPath, CiCdConfParams params)
        throws GitLabApiException {
        try (Response response = post(Response.Status.OK, params.getForm().asMap(), "projects",
            getProjectIdOrPath(projectIdOrPath), "ci", "lint")) {
            return (response.readEntity(CiCdConfValidation.class));
        }
    }

    public CiCdConfValidation validateCiCdConfigurationForProject(Object projectIdOrPath, )

}
