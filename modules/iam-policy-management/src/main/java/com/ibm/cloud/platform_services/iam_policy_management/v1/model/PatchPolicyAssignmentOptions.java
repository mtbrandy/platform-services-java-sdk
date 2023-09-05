/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.platform_services.iam_policy_management.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The patchPolicyAssignment options.
 */
public class PatchPolicyAssignmentOptions extends GenericModel {

  protected String assignmentId;
  protected String version;

  /**
   * Builder.
   */
  public static class Builder {
    private String assignmentId;
    private String version;

    /**
     * Instantiates a new Builder from an existing PatchPolicyAssignmentOptions instance.
     *
     * @param patchPolicyAssignmentOptions the instance to initialize the Builder with
     */
    private Builder(PatchPolicyAssignmentOptions patchPolicyAssignmentOptions) {
      this.assignmentId = patchPolicyAssignmentOptions.assignmentId;
      this.version = patchPolicyAssignmentOptions.version;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assignmentId the assignmentId
     * @param version the version
     */
    public Builder(String assignmentId, String version) {
      this.assignmentId = assignmentId;
      this.version = version;
    }

    /**
     * Builds a PatchPolicyAssignmentOptions.
     *
     * @return the new PatchPolicyAssignmentOptions instance
     */
    public PatchPolicyAssignmentOptions build() {
      return new PatchPolicyAssignmentOptions(this);
    }

    /**
     * Set the assignmentId.
     *
     * @param assignmentId the assignmentId
     * @return the PatchPolicyAssignmentOptions builder
     */
    public Builder assignmentId(String assignmentId) {
      this.assignmentId = assignmentId;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the PatchPolicyAssignmentOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }

  protected PatchPolicyAssignmentOptions() { }

  protected PatchPolicyAssignmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.assignmentId,
      "assignmentId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.version,
      "version cannot be null");
    assignmentId = builder.assignmentId;
    version = builder.version;
  }

  /**
   * New builder.
   *
   * @return a PatchPolicyAssignmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assignmentId.
   *
   * The policy template assignment ID.
   *
   * @return the assignmentId
   */
  public String assignmentId() {
    return assignmentId;
  }

  /**
   * Gets the version.
   *
   * The policy template version to update to.
   *
   * @return the version
   */
  public String version() {
    return version;
  }
}

