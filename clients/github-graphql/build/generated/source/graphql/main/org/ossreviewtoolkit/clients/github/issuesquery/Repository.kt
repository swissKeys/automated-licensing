package org.ossreviewtoolkit.clients.github.issuesquery

import com.expediagroup.graphql.client.Generated
import kotlinx.serialization.Serializable

/**
 * A repository contains the content for a project.
 */
@Generated
@Serializable
public data class Repository(
  /**
   * A list of issues that have been opened in the repository.
   */
  public val issues: IssueConnection,
)
