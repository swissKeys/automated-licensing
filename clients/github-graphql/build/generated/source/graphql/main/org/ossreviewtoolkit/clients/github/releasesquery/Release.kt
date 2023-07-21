package org.ossreviewtoolkit.clients.github.releasesquery

import com.expediagroup.graphql.client.Generated
import kotlin.String
import kotlinx.serialization.Serializable
import org.ossreviewtoolkit.clients.github.DateTime
import org.ossreviewtoolkit.clients.github.URI

/**
 * A release contains the content for a release.
 */
@Generated
@Serializable
public data class Release(
  /**
   * The HTTP URL for this issue
   */
  public val url: URI,
  /**
   * The title of the release.
   */
  public val name: String? = null,
  /**
   * Identifies the date and time when the release was created.
   */
  public val publishedAt: DateTime? = null,
  /**
   * The name of the release's Git tag
   */
  public val tagName: String,
  /**
   * The tag commit for this release.
   */
  public val tagCommit: Commit? = null,
)
