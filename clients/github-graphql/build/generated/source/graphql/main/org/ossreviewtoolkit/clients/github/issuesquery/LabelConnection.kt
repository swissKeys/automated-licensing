package org.ossreviewtoolkit.clients.github.issuesquery

import com.expediagroup.graphql.client.Generated
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * The connection type for Label.
 */
@Generated
@Serializable
public data class LabelConnection(
  /**
   * A list of edges.
   */
  public val edges: List<LabelEdge?>? = null,
)
