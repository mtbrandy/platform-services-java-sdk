/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.platform_services.catalog_management.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The setDeprecateVersion options.
 */
public class SetDeprecateVersionOptions extends GenericModel {

  /**
   * Set deprecation (true) or cancel deprecation (false).
   */
  public interface Setting {
    /** true. */
    String X_TRUE = "true";
    /** false. */
    String X_FALSE = "false";
  }

  protected String versionLocId;
  protected String setting;
  protected String description;
  protected Long daysUntilDeprecate;

  /**
   * Builder.
   */
  public static class Builder {
    private String versionLocId;
    private String setting;
    private String description;
    private Long daysUntilDeprecate;

    private Builder(SetDeprecateVersionOptions setDeprecateVersionOptions) {
      this.versionLocId = setDeprecateVersionOptions.versionLocId;
      this.setting = setDeprecateVersionOptions.setting;
      this.description = setDeprecateVersionOptions.description;
      this.daysUntilDeprecate = setDeprecateVersionOptions.daysUntilDeprecate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param versionLocId the versionLocId
     * @param setting the setting
     */
    public Builder(String versionLocId, String setting) {
      this.versionLocId = versionLocId;
      this.setting = setting;
    }

    /**
     * Builds a SetDeprecateVersionOptions.
     *
     * @return the new SetDeprecateVersionOptions instance
     */
    public SetDeprecateVersionOptions build() {
      return new SetDeprecateVersionOptions(this);
    }

    /**
     * Set the versionLocId.
     *
     * @param versionLocId the versionLocId
     * @return the SetDeprecateVersionOptions builder
     */
    public Builder versionLocId(String versionLocId) {
      this.versionLocId = versionLocId;
      return this;
    }

    /**
     * Set the setting.
     *
     * @param setting the setting
     * @return the SetDeprecateVersionOptions builder
     */
    public Builder setting(String setting) {
      this.setting = setting;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SetDeprecateVersionOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the daysUntilDeprecate.
     *
     * @param daysUntilDeprecate the daysUntilDeprecate
     * @return the SetDeprecateVersionOptions builder
     */
    public Builder daysUntilDeprecate(long daysUntilDeprecate) {
      this.daysUntilDeprecate = daysUntilDeprecate;
      return this;
    }
  }

  protected SetDeprecateVersionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.versionLocId,
      "versionLocId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.setting,
      "setting cannot be empty");
    versionLocId = builder.versionLocId;
    setting = builder.setting;
    description = builder.description;
    daysUntilDeprecate = builder.daysUntilDeprecate;
  }

  /**
   * New builder.
   *
   * @return a SetDeprecateVersionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the versionLocId.
   *
   * A dotted value of `catalogID`.`versionID`.
   *
   * @return the versionLocId
   */
  public String versionLocId() {
    return versionLocId;
  }

  /**
   * Gets the setting.
   *
   * Set deprecation (true) or cancel deprecation (false).
   *
   * @return the setting
   */
  public String setting() {
    return setting;
  }

  /**
   * Gets the description.
   *
   * Additional information that users can provide to be displayed in deprecation notification.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the daysUntilDeprecate.
   *
   * Specifies the amount of days until product is not available in catalog.
   *
   * @return the daysUntilDeprecate
   */
  public Long daysUntilDeprecate() {
    return daysUntilDeprecate;
  }
}

