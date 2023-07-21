package org.ossreviewtoolkit.clients.github.releasesquery

import com.expediagroup.graphql.client.Generated
import kotlinx.serialization.Serializable

/**
 * A repository contains the content for a project.
 */
@Generated
@Serializable
public data class Repository(
  /**
   * List of releases which are dependent on this repository.
   */
  public val releases: ReleaseConnection,
)
