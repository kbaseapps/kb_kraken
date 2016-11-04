
package us.kbase.kbkraken;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: RunKrakenParams</p>
 * <pre>
 * Insert your typespec information here.
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace_name",
    "input_reads_name",
    "output_tax_profile_name"
})
public class RunKrakenParams {

    @JsonProperty("workspace_name")
    private String workspaceName;
    @JsonProperty("input_reads_name")
    private String inputReadsName;
    @JsonProperty("output_tax_profile_name")
    private String outputTaxProfileName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workspace_name")
    public String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public RunKrakenParams withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("input_reads_name")
    public String getInputReadsName() {
        return inputReadsName;
    }

    @JsonProperty("input_reads_name")
    public void setInputReadsName(String inputReadsName) {
        this.inputReadsName = inputReadsName;
    }

    public RunKrakenParams withInputReadsName(String inputReadsName) {
        this.inputReadsName = inputReadsName;
        return this;
    }

    @JsonProperty("output_tax_profile_name")
    public String getOutputTaxProfileName() {
        return outputTaxProfileName;
    }

    @JsonProperty("output_tax_profile_name")
    public void setOutputTaxProfileName(String outputTaxProfileName) {
        this.outputTaxProfileName = outputTaxProfileName;
    }

    public RunKrakenParams withOutputTaxProfileName(String outputTaxProfileName) {
        this.outputTaxProfileName = outputTaxProfileName;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((("RunKrakenParams"+" [workspaceName=")+ workspaceName)+", inputReadsName=")+ inputReadsName)+", outputTaxProfileName=")+ outputTaxProfileName)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
