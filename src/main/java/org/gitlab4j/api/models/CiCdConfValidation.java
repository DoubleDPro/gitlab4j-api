package org.gitlab4j.api.models;

import org.gitlab4j.api.utils.JacksonJson;

/**
 * Response for the validation of the CI/CD configuration
 */
public class CiCdConfValidation {

    private Boolean valid;
    private String mergedYaml;
    private String[] errors;
    private String[] warnings;

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getMergedYaml() {
        return mergedYaml;
    }

    public void setMergedYaml(String mergedYaml) {
        this.mergedYaml = mergedYaml;
    }

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }

    public String[] getWarnings() {
        return warnings;
    }

    public void setWarnings(String[] warnings) {
        this.warnings = warnings;
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }

}
