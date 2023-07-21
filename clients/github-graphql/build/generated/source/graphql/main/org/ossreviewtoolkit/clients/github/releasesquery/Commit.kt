package org.ossreviewtoolkit.clients.github.releasesquery

import com.expediagroup.graphql.client.Generated
import kotlinx.serialization.Serializable
import org.ossreviewtoolkit.clients.github.URI

/**
 * Represents a Git commit.
 */
@Generated
@Serializable
public data class Commit(
  /**
   * The HTTP URL for this Git object
   */
  public val commitUrl: URI,
)
