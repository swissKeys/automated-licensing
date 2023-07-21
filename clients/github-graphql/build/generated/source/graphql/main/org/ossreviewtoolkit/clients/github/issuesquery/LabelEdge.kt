package org.ossreviewtoolkit.clients.github.issuesquery

import com.expediagroup.graphql.client.Generated
import kotlinx.serialization.Serializable

/**
 * An edge in a connection.
 */
@Generated
@Serializable
public data class LabelEdge(
  /**
   * The item at the end of the edge.
   */
  public val node: Label? = null,
)
