package org.ossreviewtoolkit.clients.github.issuesquery

import com.expediagroup.graphql.client.Generated
import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.Serializable

/**
 * Information about pagination in a connection.
 */
@Generated
@Serializable
public data class PageInfo(
  /**
   * When paginating forwards, the cursor to continue.
   */
  public val endCursor: String? = null,
  /**
   * When paginating forwards, are there more items?
   */
  public val hasNextPage: Boolean,
)
