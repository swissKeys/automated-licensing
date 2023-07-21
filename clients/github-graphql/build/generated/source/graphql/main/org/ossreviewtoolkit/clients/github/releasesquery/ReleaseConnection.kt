package org.ossreviewtoolkit.clients.github.releasesquery

import com.expediagroup.graphql.client.Generated
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * The connection type for Release.
 */
@Generated
@Serializable
public data class ReleaseConnection(
  /**
   * A list of edges.
   */
  public val edges: List<ReleaseEdge?>? = null,
  /**
   * Information to aid in pagination.
   */
  public val pageInfo: PageInfo,
)
