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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceObject options.
 */
public class ReplaceObjectOptions extends GenericModel {

  protected String catalogIdentifier;
  protected String objectIdentifier;
  protected String id;
  protected String name;
  protected String rev;
  protected String crn;
  protected String url;
  protected String parentId;
  protected String labelI18n;
  protected String label;
  protected List<String> tags;
  protected Date created;
  protected Date updated;
  protected String shortDescription;
  protected String shortDescriptionI18n;
  protected String kind;
  protected PublishObject publish;
  protected State state;
  protected String catalogId;
  protected String catalogName;
  protected Map<String, Object> data;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogIdentifier;
    private String objectIdentifier;
    private String id;
    private String name;
    private String rev;
    private String crn;
    private String url;
    private String parentId;
    private String labelI18n;
    private String label;
    private List<String> tags;
    private Date created;
    private Date updated;
    private String shortDescription;
    private String shortDescriptionI18n;
    private String kind;
    private PublishObject publish;
    private State state;
    private String catalogId;
    private String catalogName;
    private Map<String, Object> data;

    private Builder(ReplaceObjectOptions replaceObjectOptions) {
      this.catalogIdentifier = replaceObjectOptions.catalogIdentifier;
      this.objectIdentifier = replaceObjectOptions.objectIdentifier;
      this.id = replaceObjectOptions.id;
      this.name = replaceObjectOptions.name;
      this.rev = replaceObjectOptions.rev;
      this.crn = replaceObjectOptions.crn;
      this.url = replaceObjectOptions.url;
      this.parentId = replaceObjectOptions.parentId;
      this.labelI18n = replaceObjectOptions.labelI18n;
      this.label = replaceObjectOptions.label;
      this.tags = replaceObjectOptions.tags;
      this.created = replaceObjectOptions.created;
      this.updated = replaceObjectOptions.updated;
      this.shortDescription = replaceObjectOptions.shortDescription;
      this.shortDescriptionI18n = replaceObjectOptions.shortDescriptionI18n;
      this.kind = replaceObjectOptions.kind;
      this.publish = replaceObjectOptions.publish;
      this.state = replaceObjectOptions.state;
      this.catalogId = replaceObjectOptions.catalogId;
      this.catalogName = replaceObjectOptions.catalogName;
      this.data = replaceObjectOptions.data;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogIdentifier the catalogIdentifier
     * @param objectIdentifier the objectIdentifier
     */
    public Builder(String catalogIdentifier, String objectIdentifier) {
      this.catalogIdentifier = catalogIdentifier;
      this.objectIdentifier = objectIdentifier;
    }

    /**
     * Builds a ReplaceObjectOptions.
     *
     * @return the new ReplaceObjectOptions instance
     */
    public ReplaceObjectOptions build() {
      return new ReplaceObjectOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the ReplaceObjectOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the catalogIdentifier.
     *
     * @param catalogIdentifier the catalogIdentifier
     * @return the ReplaceObjectOptions builder
     */
    public Builder catalogIdentifier(String catalogIdentifier) {
      this.catalogIdentifier = catalogIdentifier;
      return this;
    }

    /**
     * Set the objectIdentifier.
     *
     * @param objectIdentifier the objectIdentifier
     * @return the ReplaceObjectOptions builder
     */
    public Builder objectIdentifier(String objectIdentifier) {
      this.objectIdentifier = objectIdentifier;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceObjectOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReplaceObjectOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the rev.
     *
     * @param rev the rev
     * @return the ReplaceObjectOptions builder
     */
    public Builder rev(String rev) {
      this.rev = rev;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ReplaceObjectOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the ReplaceObjectOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the parentId.
     *
     * @param parentId the parentId
     * @return the ReplaceObjectOptions builder
     */
    public Builder parentId(String parentId) {
      this.parentId = parentId;
      return this;
    }

    /**
     * Set the labelI18n.
     *
     * @param labelI18n the labelI18n
     * @return the ReplaceObjectOptions builder
     */
    public Builder labelI18n(String labelI18n) {
      this.labelI18n = labelI18n;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the ReplaceObjectOptions builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the ReplaceObjectOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the created.
     *
     * @param created the created
     * @return the ReplaceObjectOptions builder
     */
    public Builder created(Date created) {
      this.created = created;
      return this;
    }

    /**
     * Set the updated.
     *
     * @param updated the updated
     * @return the ReplaceObjectOptions builder
     */
    public Builder updated(Date updated) {
      this.updated = updated;
      return this;
    }

    /**
     * Set the shortDescription.
     *
     * @param shortDescription the shortDescription
     * @return the ReplaceObjectOptions builder
     */
    public Builder shortDescription(String shortDescription) {
      this.shortDescription = shortDescription;
      return this;
    }

    /**
     * Set the shortDescriptionI18n.
     *
     * @param shortDescriptionI18n the shortDescriptionI18n
     * @return the ReplaceObjectOptions builder
     */
    public Builder shortDescriptionI18n(String shortDescriptionI18n) {
      this.shortDescriptionI18n = shortDescriptionI18n;
      return this;
    }

    /**
     * Set the kind.
     *
     * @param kind the kind
     * @return the ReplaceObjectOptions builder
     */
    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Set the publish.
     *
     * @param publish the publish
     * @return the ReplaceObjectOptions builder
     */
    public Builder publish(PublishObject publish) {
      this.publish = publish;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the ReplaceObjectOptions builder
     */
    public Builder state(State state) {
      this.state = state;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the ReplaceObjectOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ReplaceObjectOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the ReplaceObjectOptions builder
     */
    public Builder data(Map<String, Object> data) {
      this.data = data;
      return this;
    }

    /**
     * Set the catalogObject.
     *
     * @param catalogObject the catalogObject
     * @return the ReplaceObjectOptions builder
     */
    public Builder catalogObject(CatalogObject catalogObject) {
      this.id = catalogObject.id();
      this.name = catalogObject.name();
      this.rev = catalogObject.rev();
      this.crn = catalogObject.crn();
      this.url = catalogObject.url();
      this.parentId = catalogObject.parentId();
      this.labelI18n = catalogObject.labelI18n();
      this.label = catalogObject.label();
      this.tags = catalogObject.tags();
      this.created = catalogObject.created();
      this.updated = catalogObject.updated();
      this.shortDescription = catalogObject.shortDescription();
      this.shortDescriptionI18n = catalogObject.shortDescriptionI18n();
      this.kind = catalogObject.kind();
      this.publish = catalogObject.publish();
      this.state = catalogObject.state();
      this.catalogId = catalogObject.catalogId();
      this.catalogName = catalogObject.catalogName();
      this.data = catalogObject.data();
      return this;
    }
  }

  protected ReplaceObjectOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogIdentifier,
      "catalogIdentifier cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.objectIdentifier,
      "objectIdentifier cannot be empty");
    catalogIdentifier = builder.catalogIdentifier;
    objectIdentifier = builder.objectIdentifier;
    id = builder.id;
    name = builder.name;
    rev = builder.rev;
    crn = builder.crn;
    url = builder.url;
    parentId = builder.parentId;
    labelI18n = builder.labelI18n;
    label = builder.label;
    tags = builder.tags;
    created = builder.created;
    updated = builder.updated;
    shortDescription = builder.shortDescription;
    shortDescriptionI18n = builder.shortDescriptionI18n;
    kind = builder.kind;
    publish = builder.publish;
    state = builder.state;
    catalogId = builder.catalogId;
    catalogName = builder.catalogName;
    data = builder.data;
  }

  /**
   * New builder.
   *
   * @return a ReplaceObjectOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogIdentifier.
   *
   * Catalog identifier.
   *
   * @return the catalogIdentifier
   */
  public String catalogIdentifier() {
    return catalogIdentifier;
  }

  /**
   * Gets the objectIdentifier.
   *
   * Object identifier.
   *
   * @return the objectIdentifier
   */
  public String objectIdentifier() {
    return objectIdentifier;
  }

  /**
   * Gets the id.
   *
   * unique id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The programmatic name of this offering.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the rev.
   *
   * Cloudant revision.
   *
   * @return the rev
   */
  public String rev() {
    return rev;
  }

  /**
   * Gets the crn.
   *
   * The crn for this specific object.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the url.
   *
   * The url for this specific object.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the parentId.
   *
   * The parent for this specific object.
   *
   * @return the parentId
   */
  public String parentId() {
    return parentId;
  }

  /**
   * Gets the labelI18n.
   *
   * Translated display name in the requested language.
   *
   * @return the labelI18n
   */
  public String labelI18n() {
    return labelI18n;
  }

  /**
   * Gets the label.
   *
   * Display name in the requested language.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the tags.
   *
   * List of tags associated with this catalog.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the created.
   *
   * The date and time this catalog was created.
   *
   * @return the created
   */
  public Date created() {
    return created;
  }

  /**
   * Gets the updated.
   *
   * The date and time this catalog was last updated.
   *
   * @return the updated
   */
  public Date updated() {
    return updated;
  }

  /**
   * Gets the shortDescription.
   *
   * Short description in the requested language.
   *
   * @return the shortDescription
   */
  public String shortDescription() {
    return shortDescription;
  }

  /**
   * Gets the shortDescriptionI18n.
   *
   * Short description translation.
   *
   * @return the shortDescriptionI18n
   */
  public String shortDescriptionI18n() {
    return shortDescriptionI18n;
  }

  /**
   * Gets the kind.
   *
   * Kind of object.
   *
   * @return the kind
   */
  public String kind() {
    return kind;
  }

  /**
   * Gets the publish.
   *
   * Publish information.
   *
   * @return the publish
   */
  public PublishObject publish() {
    return publish;
  }

  /**
   * Gets the state.
   *
   * Offering state.
   *
   * @return the state
   */
  public State state() {
    return state;
  }

  /**
   * Gets the catalogId.
   *
   * The id of the catalog containing this offering.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the catalogName.
   *
   * The name of the catalog.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the data.
   *
   * Map of data values for this object.
   *
   * @return the data
   */
  public Map<String, Object> data() {
    return data;
  }
}

