package org.ossreviewtoolkit.clients.github.releasesquery

import com.expediagroup.graphql.client.Generated
import kotlinx.serialization.Serializable

/**
 * An edge in a connection.
 */
@Generated
@Serializable
public data class ReleaseEdge(
  /**
   * The item at the end of the edge.
   */
  public val node: Release? = null,
)
