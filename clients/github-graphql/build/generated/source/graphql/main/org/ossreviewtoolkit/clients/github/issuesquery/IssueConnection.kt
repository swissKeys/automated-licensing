package org.ossreviewtoolkit.clients.github.issuesquery

import com.expediagroup.graphql.client.Generated
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * The connection type for Issue.
 */
@Generated
@Serializable
public data class IssueConnection(
  /**
   * A list of edges.
   */
  public val edges: List<IssueEdge?>? = null,
  /**
   * Information to aid in pagination.
   */
  public val pageInfo: PageInfo,
)
