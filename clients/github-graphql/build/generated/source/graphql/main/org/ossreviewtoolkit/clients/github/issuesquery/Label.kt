package org.ossreviewtoolkit.clients.github.issuesquery

import com.expediagroup.graphql.client.Generated
import kotlin.String
import kotlinx.serialization.Serializable

/**
 * A label for categorizing Issues, Pull Requests, Milestones, or Discussions with a given
 * Repository.
 */
@Generated
@Serializable
public data class Label(
  /**
   * Identifies the label name.
   */
  public val name: String,
)
